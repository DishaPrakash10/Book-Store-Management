/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author gagan
 */
public class ConncetionProvider {
       private static Connection con; 
    
    public static Connection getCon(){
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // step2 create the connection object
             con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "disha", "gagan");
			System.out.println("Database Connected");
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
        return con;
    }
    
}
    

