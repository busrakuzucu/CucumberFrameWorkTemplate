package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ExcelUtility {
    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int colCount) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> row = new ArrayList<>();
            for (int j = 0; j < colCount; j++) {
                row.add(sheet.getRow(i).getCell(j).toString());
            }
            list.add(row);
        }
        return list;
    }

    public static void writeExcel(String path, Scenario scenario, String browserName) {
        //burada her bir senaryonun sonucu excele yazılacak

        //Eğer dosya yok ise dosya oluştursun ona yazsın
        File file = new File(path);
        if (!file.exists()) {//dosya yok ise
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("campusTest");

            Row newRow = sheet.createRow(0);
            Cell newCell = newRow.createCell(0);
            newCell.setCellValue(scenario.getName());

            newCell = newRow.createCell(1);
            newCell.setCellValue(scenario.getStatus().toString());//fail veya pass

            newCell = newRow.createCell(2);
            newCell.setCellValue(browserName);


            //file save
            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (Exception e) {
            }

        } else {//eğer dosya var ise
            Sheet sheet = null;
            Workbook workbook = null;
            try {
                FileInputStream inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
                sheet = workbook.getSheet("campusTest");
            } catch (Exception ex) {
            }
            Row newRow = sheet.createRow(sheet.getPhysicalNumberOfRows());//en alt boş satırı aç
            Cell newCell = newRow.createCell(0);
            newCell.setCellValue(scenario.getName());

            newCell = newRow.createCell(1);
            newCell.setCellValue(scenario.getStatus().toString());//fail veya pass
            newCell = newRow.createCell(2);
            newCell.setCellValue(browserName);
            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (Exception e) {

            }

        }


    }
}
