/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application_shalina;

import java.sql.*;

/**
 *
 * @author Danlola
 */
public class BD {
    
    
    Connection con;
    
    
 public Connection getBD(){
     
     try {
         
    Class.forName("com.mysql.jdbc.Driver");
    
    con=DriverManager.getConnection("jdbc:mysql://localhost/shalina3","root","");
         System.out.println("connection reussie");
         return con;
         
         
     } catch (ClassNotFoundException | SQLException e) {
         
         System.out.println("pas de connection "+e);
         
     }
   
     
     return null;
     
     
 }
    
}
