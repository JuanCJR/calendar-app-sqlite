
package gestionbd;

import java.sql.*;
import javax.swing.JOptionPane;

public class GestionBD {
    
    Connection conn = null;
    Statement sentencia = null;
    ResultSet rs = null;
    
    String DRIVER = "org.sqlite.JDBC";
    String NOMBREBD = "CalendarBD.sqlite";
    String URL = "jdbc:sqlite:"+NOMBREBD;
    
    //Metodo para crear base de datos
    public void crearBD(){
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        }
    
    }//.
    
     public void crearTabla(){
       
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            
            sentencia = conn.createStatement();
            String SQL = "CREATE TABLE USUARIOS"+
                    "(COD_USUARIO INT PRIMARY KEY NOT NULL,"+
                    "NOM_USUARIO TEXT NOT NULL,"+
                    "NOMBRE TEXT NOT NULL,"+
                    "APELLIDO TEXT NOT NULL,"+
                    "EMAIL TEXT NOT NULL,"+
                    "PASSWD TEXT NOT NULL)";
            
            sentencia.executeUpdate(SQL);
           JOptionPane.showMessageDialog(null, "TABLA CREADA:", "EXITO!!",JOptionPane.INFORMATION_MESSAGE);
            
            sentencia.close();
            conn.close();
                    
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
    
        
    }//.
   
    //Metodo para crear usuarios en la base de datos
    public void CreaUsuario(String usuario, String nombre, String apellido, String email, String pass ){
               
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            
            sentencia = conn.createStatement();
            String SQL = "INSERT INTO USUARIOS (NOM_USUARIO, NOMBRE, APELLIDO, EMAIL,PASSWD) VALUES"+
                    "('"+usuario+"','"+nombre+"','"+apellido+"','"+email+"','"+pass+"')";
            
            sentencia.executeUpdate(SQL);
           JOptionPane.showMessageDialog(null, "Usuario "+usuario+" creado con exito!", "EXITO!!",JOptionPane.INFORMATION_MESSAGE);
            
            sentencia.close();
            conn.close();
                    
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
    };//. 
    
    //Validacion de nombre de usuario
      public boolean validaUsuario(String usuario){
          boolean usuarioExiste = false;    
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            sentencia = conn.createStatement();
            String SQL = "SELECT NOM_USUARIO FROM USUARIOS "+
                    "where NOM_USUARIO = "+"'"+usuario+"'";
            rs = sentencia.executeQuery(SQL);
           
            
            if ( rs.isClosed()){
                usuarioExiste = false;
            }else{
                usuarioExiste = true;
               
            }
            
            conn.close();
                    
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
        
        return usuarioExiste;
    };//. 
    
    
}//FIN CLASE.
