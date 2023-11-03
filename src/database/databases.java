/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;

public class databases {
    private static Connection mysqlconfig;
    public static Connection configDB(){
        try{
            String url = "jdbc:mysql://localhost:3306/pa";
            String user = "root";
            String Password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            mysqlconfig = DriverManager.getConnection(url,user,Password);
        }  catch (Exception e){
                   System.err.println("koneksi gagal"+e.getMessage());           
        }
        return mysqlconfig;
    }
    
}
