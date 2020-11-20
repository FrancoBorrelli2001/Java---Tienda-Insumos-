package Logica;
import Persistencia.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Main {
    public static void main(String[]args){
        
   Conexion con=new Conexion();
   ResultSet resultado=con.mostrarInsumos();
   
    }
}


 