
/**
 * @author Minhazul Abedin
 *         ID: 221-15-4919
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

public class Tables {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
//            st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobileNumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
//            st.executeUpdate("insert into appuser (userRole, name, dob, mobileNumber, email, username, password, address) values('Admin','Minhazul Abedin', '28-11-2001', '8801852018502','abedin15-4919@diu.edu.bd', 'admin', 'admin', 'Mirpur, Dhaka')");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
