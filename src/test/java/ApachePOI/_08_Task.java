package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _08_Task {
    public static void main(String[] args) {
        /**  Soru 1:
         *  yeni excel (altalta.xls)
         *  Çarpım tablosunu excele yazdırınız.
         *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
         *  sıfırdan excel oluşturarak.
         *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
         */

        /**  Soru 2:
        * yeni excel (yanyana.xls)
        *  Çarpım tablosunu excele yazdırınız.
        *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
        *  sıfırdan excel oluşturarak.
        *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
        */
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("Sayfa1");
        Row newRow=sheet.createRow(0);

        Cell newCell=newRow.createCell(0);
        for (int i = 0; i <10 ; i++) {
            newCell.setCellValue(i);
        }

    }
}
