/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SHOP;

/**
 *
 * @author Oumar NIANG
 */
import java.sql.*;
import javax.swing.*;
public class javaconnect
{
    Connection conn=null;
  public  static Connection connectdb()
  {
      String url="jdbc:mysql://127.0.0.1/shop";
      String user="root";
      String password="";
      try
      {
             Class.forName("com.mysql.jdbc.Driver");
         Connection conn=DriverManager.getConnection(url,user,password);
          
          return conn;
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, e);
      }
      return null;
  }
}
    
    
