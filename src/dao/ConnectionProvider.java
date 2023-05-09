package dao;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Minhazul Abedin
 *         ID: 221-15-4919
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marspharma?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            return con;
        } 
        catch(Exception e) {
            System.out.println("e");
            return null;
        }
    }
}
