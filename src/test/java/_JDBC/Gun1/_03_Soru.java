package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_Soru extends JDBCParent {
    @Test
    public void Test1() throws SQLException {
        // city tablosundaki tüm kayıtlardaki isimleri next ile yazdırınız
        ResultSet rs=statement.executeQuery("select city from city");
        int rowCount=0;
        while (rs.next()){
            System.out.println("name="+rs.getString("city"));
            rowCount++;

        }
        System.out.println(rowCount);
    }

    //TODO: city tablosundaki tüm satırdaki şehir isimlerini absolute ile yazdırınız



        @Test
        public void Test2() throws SQLException {
            // city tablosundaki tüm kayıtlardaki isimleri next ile yazdırınız
            ResultSet rs=statement.executeQuery("select city from city");
            int rowCount=1;
            while (rs.absolute(rowCount)){
                System.out.println("name="+rs.getString("city"));
                rowCount++;

            }
            System.out.println(rowCount);
        }
    //TODO: city tablosundaki tüm satırdaki şehir isimlerini relative ile yazdırınız
    @Test
    public void Test3() throws SQLException {
        ResultSet rs=statement.executeQuery("select city from city");
        int rowCount=0;
        while (rs.relative(1)){
            System.out.println("name="+rs.getString("city"));
            rowCount++;
        }
        System.out.println(rowCount);
    }
}
