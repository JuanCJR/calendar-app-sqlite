/*
 * The MIT License
 *
 * Copyright 2019 Juan Jimenez, Marco Avila.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package gestionbd;

import java.sql.*;
import javax.swing.JOptionPane;
import funciones.Funciones;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

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
      
      //Valida Inicio de sesion
      
      public boolean iniciaSesion(String Usuario, String passwd){
          //true si el usuario existe
          boolean vUsuario = validaUsuario(Usuario);
          boolean sesion = false;
          
          if(vUsuario){
                try{
                  Class.forName(DRIVER);
                  conn = DriverManager.getConnection(URL);
                  sentencia = conn.createStatement();
                  String SQL = "SELECT NOM_USUARIO,PASSWD FROM USUARIOS "+
                          "where NOM_USUARIO = "+"'"+Usuario+"' AND PASSWD = "+"'"+passwd+"'";
                    
                  rs = sentencia.executeQuery(SQL);


                  if ( rs.isClosed()){
                      sesion = false;
                  }else{
                      sesion = true;

                  }

                  conn.close();
                  
                  if (sesion==false){
        
                      JOptionPane.showMessageDialog(null, "Contraseña Incorrecta:", "Error!!",JOptionPane.ERROR_MESSAGE);
        
                 }
                  

                }catch(ClassNotFoundException | SQLException e){
                    JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
                } 
            }else{
               JOptionPane.showMessageDialog(null, "El nombre de usuario que ingreso no existe:", "Error!!",JOptionPane.ERROR_MESSAGE);
          }
            
          
          return sesion;    
                
      }//.
      
      
      
      
      
      
      //Crea Tarea
      public void CreaTarea(String Descripcion, String prioridad, String fecha,String cod_usuario,String cod_tarea){
               ImageIcon img = new ImageIcon(getClass().getResource("/iconos/ok2.png"));
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            
            sentencia = conn.createStatement();
            String SQL = "INSERT INTO TAREAS (DESCRIPCION, PRIORIDAD,PORCENTAJE,FECHA_INICIO,COD_USUARIO,CODTIPO_TAREA) VALUES"+
                    "('"+Descripcion+"','"+prioridad+"','1','"+fecha+"','"+cod_usuario+"','"+cod_tarea+"')";
            
            sentencia.executeUpdate(SQL);
           JOptionPane.showMessageDialog(null, "Nueva tarea creada", "EXITO!!",JOptionPane.INFORMATION_MESSAGE,img);
            
            sentencia.close();
            conn.close();
                    
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
    };//. 
      
      //Devuelve COD de usuario
       public int getCodUsuario(String usuario){
          int codUsuario = 0;    
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            sentencia = conn.createStatement();
            String SQL = "SELECT COD_USUARIO FROM USUARIOS "+
                    "where NOM_USUARIO = "+"'"+usuario+"'";
            rs = sentencia.executeQuery(SQL);
           codUsuario = rs.getInt("COD_USUARIO");
            
            
            conn.close();
           
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
        
         return codUsuario;
       
    };//.
       
       //Mostrar Tareas del usuario
       public void muestraTareas(JTable tabla, String usuario){
        
           DefaultTableModel tm = (DefaultTableModel) tabla.getModel();
           String codUsuario = Integer.toString(getCodUsuario(usuario));
           
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            sentencia = conn.createStatement();
            String SQL = "SELECT COD_TAREA, PRIORIDAD,TIPO_TAREA.DESCRIPCION, "+
                    "TAREAS.DESCRIPCION, FECHA_INICIO,PORCENTAJE FROM TAREAS "+
                    "JOIN TIPO_TAREA "+ 
                    "ON TIPO_TAREA.CODTIPO_TAREA = TAREAS.CODTIPO_TAREA "+
                    "WHERE COD_USUARIO = " + codUsuario; 
        
            rs = sentencia.executeQuery(SQL);
            int fila = 0;
            ImageIcon cancel = new ImageIcon(getClass().getResource("/iconos/cancel2.png")); 
            ImageIcon attention = new ImageIcon(getClass().getResource("/iconos/attention2.png"));
            ImageIcon ok = new ImageIcon(getClass().getResource("/iconos/ok2.png"));
            
            while(rs.next()){
                int porcentaje = rs.getInt("PORCENTAJE");
                
                
                    if(porcentaje < 50 || porcentaje >= 1){
                        
                    }else if(porcentaje >= 50 || porcentaje < 100){
                       
                    }else{
                        
                    }
                   
                tabla.setValueAt(rs.getInt(1),fila,0);
                tabla.setValueAt(rs.getString(2),fila,1);
                tabla.setValueAt(rs.getString(3),fila,2);
                tabla.setValueAt(rs.getString(4), fila, 3);
                tabla.setValueAt(rs.getString(5),fila,4);
                tabla.setValueAt(rs.getString(6),fila,5);
                  
                if(porcentaje < 50 && porcentaje >= 1){
                        tabla.setValueAt( new JLabel(cancel),fila,6);
                    }else if(porcentaje >= 50 && porcentaje < 100){
                        tabla.setValueAt( new JLabel(attention),fila,6);
                    }else if (porcentaje == 100) {
                        tabla.setValueAt( new JLabel(ok),fila,6);
                    }
                

//                tm.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),"6", new JLabel(img)});
                
                fila++;
                
            }//fin while.
            rs.close();
            sentencia.close();
            conn.close();
            
            
            conn.close();
           
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
  
    };//.
       
       
       //Devuelve Tipos de Tareas
 public String[] getTipoTareas(){
           
         String [] tipoTareas = new String[10];
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            sentencia = conn.createStatement();
            String SQL = "SELECT DESCRIPCION FROM TIPO_TAREA";
                 
            rs = sentencia.executeQuery(SQL);
            int fila = 0;
            
            while(rs.next()){
                
                tipoTareas[fila] = rs.getString("DESCRIPCION");
                fila++;
                
            }//fin while.
            rs.close();
            sentencia.close();
            conn.close();
            
            
            conn.close();
           
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
        
            return tipoTareas;
       
    };//.
        
    //Elimina tarea
         public void EliminaTarea(int codTarea){
         ImageIcon img = new ImageIcon(getClass().getResource("/iconos/cancel2.png"));
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            
            sentencia = conn.createStatement();
            String SQL = "DELETE FROM TAREAS "
                    + "WHERE COD_TAREA ="+codTarea;
            sentencia.executeUpdate(SQL);
           JOptionPane.showMessageDialog(null, "Tarea Eliminada", "EXITO!!",JOptionPane.INFORMATION_MESSAGE,img);
            
            sentencia.close();
            conn.close();
                    
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
    };//. 
         
         //Muesta las tareas completadas
          public void muestraTareasCompletadas(JTable tabla, String usuario){
        
           DefaultTableModel tm = (DefaultTableModel) tabla.getModel();
           String codUsuario = Integer.toString(getCodUsuario(usuario));
           
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            sentencia = conn.createStatement();
            String SQL = "SELECT USUARIOS.NOM_USUARIO,COD_TAREA, PRIORIDAD,TIPO_TAREA.DESCRIPCION, "+
                    "HISTO_TAREAS.DESCRIPCION, FECHA_INICIO,FECHA_FIN,PORCENTAJE FROM HISTO_TAREAS "+
                    "JOIN USUARIOS "+
                    "ON USUARIOS.COD_USUARIO = HISTO_TAREAS.COD_USUARIO "+
                    "JOIN TIPO_TAREA "+ 
                    "ON TIPO_TAREA.CODTIPO_TAREA = HISTO_TAREAS.CODTIPO_TAREA "+
                    "WHERE HISTO_TAREAS.COD_USUARIO = " + codUsuario; 
        
            rs = sentencia.executeQuery(SQL);
            int fila = 0;
            ImageIcon ok = new ImageIcon(getClass().getResource("/iconos/ok2.png"));
            
            while(rs.next()){
                   
                tabla.setValueAt(rs.getString(1), fila, 0);
                tabla.setValueAt(rs.getInt(2),fila,1);
                tabla.setValueAt(rs.getString(3),fila,2);
                tabla.setValueAt(rs.getString(4),fila,3);
                tabla.setValueAt(rs.getString(5), fila, 4);
                tabla.setValueAt(rs.getString(6),fila,5);
                tabla.setValueAt(rs.getString(7),fila,6); 
                tabla.setValueAt(rs.getString(8),fila,7);
                tabla.setValueAt( new JLabel(ok),fila,8);
                
                

//                tm.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),"6", new JLabel(img)});
                
                fila++;
                
            }//fin while.
            rs.close();
            sentencia.close();
            conn.close();
            
            
            conn.close();
           
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
  
    };//.
       
    //Actualiza Tarea
         public void ActualizaTarea(String campo,String nuevoValor, int codTarea){
               
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            
            sentencia = conn.createStatement();
            String SQL = "UPDATE TAREAS " +
                    "SET "+campo+"="+"'"+nuevoValor+"'"+
                    " WHERE COD_TAREA ="+codTarea;
            System.out.println(SQL);
            sentencia.executeUpdate(SQL);
            System.out.println("Tarea Actualizada"); 
            sentencia.close();
            conn.close();
                    
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
    };//.
         
         
         //Devuelve Correo de Usuario
          public String getCorreo(String usuario){
         String correo = "";
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            sentencia = conn.createStatement();
            String SQL = "SELECT EMAIL FROM USUARIOS "+
                    "where NOM_USUARIO = "+"'"+usuario+"'";
            rs = sentencia.executeQuery(SQL);
           correo = rs.getString("EMAIL");
            System.out.println(correo);
            
            conn.close();
           
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
        
         return correo;
       
    };//.
          
          //Actualiza contraseña
          public void ActualizaContraseña(String usuario,String Passwd){
               
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);
            
            sentencia = conn.createStatement();
            String SQL = "UPDATE USUARIOS " +
                    "SET PASSWD ="+"'"+Passwd+"'"+
                    " WHERE NOM_USUARIO ="+"'"+usuario+"'";
            System.out.println(SQL);
            sentencia.executeUpdate(SQL);
             
            sentencia.close();
            conn.close();
                    
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e,"Error!!",JOptionPane.ERROR_MESSAGE);
        } 
    };//.
         
    
}//FIN CLASE.
