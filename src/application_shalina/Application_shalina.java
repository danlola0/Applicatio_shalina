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
public class Application_shalina {

  static Connection con; 
  static BD a =new BD();
  
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      con=a.getBD();
       


        
    }
    
}
    