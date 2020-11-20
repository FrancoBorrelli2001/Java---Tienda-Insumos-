/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Presentacion.ModificarComponentes;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexion {
    public static final String URL="jdbc:mysql://localhost:3306/bd_proyectof";
    public static final String USERNAME="root";
            public static final String PASSWORD="";
  
    

    
    
   
    
    public void Conexion() {
          Connection con=null;
       try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con= DriverManager.getConnection(URL,"root","");
           
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Conexion Fallida");
        }
    }
    public static Connection getConexion() {
        String URL="jdbc:mysql://localhost:3306/bd_proyectof";
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con= DriverManager.getConnection(URL,"root","");
          
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Conexion Fallida");
        }
        

return con;
}
    
    public ResultSet mostrarInsumos (){
          Connection con=null;
        ResultSet res=null;
        Statement stm;
        
        try{
            stm = con.createStatement();
            res=stm.executeQuery("select * from insumos");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return res;
        
    }
    
}
