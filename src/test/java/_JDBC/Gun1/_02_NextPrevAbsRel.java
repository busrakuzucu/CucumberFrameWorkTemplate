package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JDBCParent {
    @Test
    public void textNextPrev() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from language");
        rs.next();//ilk satır
        System.out.println("1. satir dilAdi="+rs.getString(2));//column sırası English

        rs.next();
        System.out.println("2. satir dilAdi="+rs.getString(2)); //italian

        rs.next();
        System.out.println("3. satir dilAdi="+rs.getString(2));//Japanese

        rs.previous();// -> 2.satıra gitti
        System.out.println("1 geri satir dilAdi="+rs.getString(2)); //italian



    }
    @Test
    public void AbsoluteRelative() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from film");
        //rs.next():sonraki satır
        //rs.previous();önceki satır
        //rs.absolute(-10);- (eksi) sondan demektir sonran 10.satır
        //rs.relative(-5); bulunduğu yerden 5 satır geri gider
        rs.absolute(10);//10.satıra git
        System.out.println("10.satır - title="+ rs.getString("title"));
        rs.relative(5);
        System.out.println("10. satırdan itibaren 5i  getir yani 20. satır="+rs.getString("title"));
        rs.absolute(-10);
        System.out.println("sondan 10. satır - title="+ rs.getString("title"));


    }
}
