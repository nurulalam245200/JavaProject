

package ConnectionProject;
import java.sql.*;

/**
 *
 * @author akib2
 */

public class connection {
    public static Connection getcon(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billingmanagement", "root", ""
                + "");
        return con;}
        catch(Exception e){
        }
        return null;
      
    }
    public static void main(String[] args) {
        
    }
    
}
