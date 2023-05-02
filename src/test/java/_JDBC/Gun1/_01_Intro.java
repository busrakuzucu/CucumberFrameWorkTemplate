package _JDBC.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

/**
 * 1- bağlantı bilgilerini girdik ve bağlandık
 * 2- sorguların çalıştırılacağı ortamı açtık
 * 3- sorguyu 2 nolu ortam üzerinde çalıştırdık
 * 4- sonuçları gördük
 */


public class _01_Intro {
    @Test
    public void Test1() throws SQLException {
        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        //Connection açılıyor, fileInputStream gibi bağlantı sağlıyorum.
        Connection connection = DriverManager.getConnection(hostUrl, username, password); //bağlatıya click 1.madde

        //sql sorguların yazılacağı yeri hazırlıyoruz
        Statement statement = connection.createStatement();//sorguları çalıştırmak için sorgu gönderme ortamı 2.madde

        //sorguyu yazdım ve çalıştırdım
        ResultSet rs = statement.executeQuery("select * from customer"); //3. madde Sorgu çalıştı sonuçları nerde?(ResultSette )
        //ilk satırımı istiyorsun, son satırımı, 5. satırımı
        rs.next();//kursör ilk satıra gitti
        String fist_name= rs.getString("first_name");
        String last_name= rs.getString("last_name");
        System.out.println("1.Satırın müşteri adı ve soyadı=" +fist_name +" "+ last_name);

        rs.next();//ikinci satıra geçti artık
        fist_name= rs.getString("first_name");
        last_name= rs.getString("last_name");
        System.out.println("2.Satırın müşteri adı ve soyadı=" +fist_name +" "+ last_name);


        connection.close();

    }
}
