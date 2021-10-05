package PICT;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author ajinkya
 */
public class Connect {
    Connection con=null;
    public static Connection ConnectDB(){
        try{
            String DriverName="com.mysql.jdbc.Driver";
            Class.forName(DriverName);
            String serverName = "localhost:3307";
            String mydatabase = "src_travel";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username="root";
            String Password="root";
            Connection con = DriverManager.getConnection(url, username, Password);
            return con;
            
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
       
        }
    }
    
}
