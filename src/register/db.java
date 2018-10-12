/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;
import java.sql.*;

public class db {
    public static void main(String[] args){
        new db().getConnection();
    }
    public void getConnection() {
        String db_name = "u572797458_soft";
        String user = "u572797458_soft";
        String pass = "password0880";
        String hostname="db144.hostinger.in.th";
        String driver = "com.mysql.jdbc.Driver";
        
       try{
        Connection conn = DriverManager.getConnection(db_name,user,pass);
        System.out.println("Connected!");
        Statement stmt = (Statement) conn.createStatement();
        String Fname = "Jame";
        String Lname = "Brown";
        String sql ="Insert into Username(Username, Password) values ('Fname','Lname')";
        System.out.println("success");
        stmt.executeUpdate(sql);
           
    }catch(SQLException e){
        System.out.println(e);
    }
    }
}
