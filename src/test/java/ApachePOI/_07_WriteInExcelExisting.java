package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteInExcelExisting {
    public static void main(String[] args) throws IOException {
        //hafızada workbook ve sheeti ni oluştururum öncelikle.
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sayfa1");
        //Hafızadaki işlemlere devam ediyorum
        Row newRow= sheet.createRow(0);
        Cell newCell=newRow.createCell(0);
        newCell.setCellValue("Busra Unlu");


        //pathini verip yazdırma işlemi SAVE liyoruz.
        String path="src/test/java/ApachePOI/resource/NewCreatedExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("işlem gerçekleşti");
    }
}
