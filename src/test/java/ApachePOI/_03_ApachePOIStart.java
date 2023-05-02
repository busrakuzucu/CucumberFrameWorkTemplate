package ApachePOI;


import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        //dosyanın yolunu değişkene atalım
        String path= "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";


        //JavaDosya okuma işlemcisine dosyanın yolunu veriyoruz
        //böylece program ile dosya arasında bağlantı oluştu
        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);


        //dosya okuma işlemcisi üzerinden ÇAlışma Kitabını alıyorum
        //hafızada workbooku alıp oluşturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");//getSheetAt(0); eğer isim bilmiyorsak kullanıyoruz

        //istenilen satırı alıyorum
        Row satir=calismaSayfasi.getRow(0);

        Cell hucre=satir.getCell(0);

        System.out.println(hucre);
    }
}
