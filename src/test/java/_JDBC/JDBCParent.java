package _JDBC;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent {
    public static Connection connection;
    public static Statement statement;

    @BeforeClass
    public void DBConnectionOpen() {
        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        try {
            connection = DriverManager.getConnection(hostUrl, username, password); //bağlatıya click 1.madde
            statement=connection.createStatement();//sorguları çalıştırmak için sorgu gönderme ortamı 2.madde
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @AfterClass
    public void DBConnectionClose() {
       try{
           connection.close();
       }catch (SQLException e){
           throw new RuntimeException(e);
       }

    }
}
