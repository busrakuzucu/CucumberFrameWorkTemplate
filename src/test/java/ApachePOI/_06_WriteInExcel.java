package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInExcel  {
    public static void main(String[] args) throws IOException {

        //BU VAROLAN DOSYAYA YAZAR
        //once excel açılır sheete ulaşılır
        //yazma işlemleri eklenir ()hafıza cache bellekte
        //yazma modunda acip ,hafızadaki işlemleri kaydederim
        String path="src/test/java/ApachePOI/resource/bosExcel.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0);
        //Hafızadaki işlemelere devam ediyoruz
        //Row newRow=sheet.createRow(0);
        // sheet.getPysicalNumberOfRows() dersek bir sonraki alt satıra geçer
        Row newRow=sheet.createRow(sheet.getPhysicalNumberOfRows());
        Cell newCell=newRow.createCell(0);
        newCell.setCellValue("Busra Unlu");
        //Sıra kaydetmeye geldi ama önce okuma modundan çıkıp

        //yazma moduna geldi
        inputStream.close();
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);//savce işlemi yapıldı
        workbook.close();//hafızayı boşalt
        outputStream.close();//hafızayı boşalt
        System.out.println("yazma işlemi yapıldı");
    }


}
