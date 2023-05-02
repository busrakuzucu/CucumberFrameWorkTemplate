package ApachePOI;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class _09_Tasks {
    public static void main(String[] args) throws IOException {
        /**
         * Kullanıcıdan istediği kolon sayısını aldıktan sonra
         * aşağıdaki excelin 2.Sheet inden istediği kadar kolon miktarını alarak
         * bir fonksyonda ArrayListe çevirerek mainden yazdırınız
         * src/test/java/ApachePOI/resources/ApacheExcel2.xlsx
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kolon sayısı giriniz=");
        int str = scan.nextInt();
        ArrayList<ArrayList<String>> list = exceldenBul(str);
        for (ArrayList<String> s : list) {
            System.out.println(s + "\t");
        }
    }
    public static ArrayList<ArrayList<String>> exceldenBul(int colCount) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet("testCitizen");
        } catch (Exception e) {
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
}
