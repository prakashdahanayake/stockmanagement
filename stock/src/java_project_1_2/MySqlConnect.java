/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_1_2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL-PC
 */
public class MySqlConnect {

    Connection conn = null;
    public static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/products_db","root","");
            //JOptionPane.showMessageDialog(null, "Connected");
            return  conn;
        }  catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
                    
        }
        
    }
}


