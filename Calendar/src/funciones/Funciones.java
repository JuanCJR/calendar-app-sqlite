package funciones;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

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
         
  }

    
}
