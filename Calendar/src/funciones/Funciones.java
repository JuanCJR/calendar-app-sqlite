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
package funciones;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Funciones {

       //Switchea color de los botones
 public static void switchBtnIcon(Class clase,JButton boton, String icono, int nro){
        String Url = "/iconos/"+ icono + nro +".png";
        boton.setIcon(new javax.swing.ImageIcon(clase.getResource(Url)));
    }

    //Switchea color de los Label
  public static void switchTxtIcon(Class clase, JLabel txt, String icono, int nro){
         
         String Url = "/iconos/"+ icono + nro +".png";
         txt.setIcon(new javax.swing.ImageIcon(clase.getResource(Url)));
         
  }//.
  
    //Funcion que valida contraseñas ingresadas
  public static boolean validaContraseña (String passwd, String confirmPasswd){
      boolean estado = false;
      
      if (passwd.equals(confirmPasswd))
          estado = true;
      else
          estado = false;
      
      return estado;
      
  }//.
  
    //Funcion que valida txtField vacios
  public static void validaTxtField(JTextField [] campos){
      
      
  }//.
  
  
  //Devuelve Fecha
  public static String getFecha(){
      String fecha;
      
        Calendar calendar = new GregorianCalendar();
        String dia = Integer.toString(calendar.get(Calendar.DATE));
        String mes = Integer.toString(calendar.get(Calendar.MONTH));
        String a = Integer.toString(calendar.get(Calendar.YEAR));
        fecha = dia+"-"+mes+"-"+a;
        
      return fecha;
  }//.
    
  

  public static DefaultTableModel devuelveModelo(){
      
      DefaultTableModel Modelo = new DefaultTableModel(
            new Object [][] {
                {"", "", null, "", null, "", null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, "", null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Tarea", "Prioridad", "Tipo", "Descripcion", "Inicio", "Porcentaje", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
      return Modelo;
  }
  
  
  
  
    
}//FIN CLASE.
