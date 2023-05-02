package Utilities;

import _JDBC.JDBCParent;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility{
    public static Connection connection;
    public static Statement statement;

    public static ArrayList<ArrayList<String>> getListData(String sql){
        DBConnectionOpen();
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        try {
            ResultSet rs = statement.executeQuery(sql);//data+metadata
            while (rs.next()) {
                ArrayList<String> satir = new ArrayList<>();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    satir.add(rs.getString(i));
                }
                list.add(satir);
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        DBConnectionClose();
        return list;
    }

    @BeforeClass
    public static void DBConnectionOpen() {
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
    public static void DBConnectionClose() {
        try{
            connection.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

}
