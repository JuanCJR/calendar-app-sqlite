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

import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Mail {


public static int sendEmail(String destinatario){
    Random r = new Random();
    String asunto ="Recuperacion de Contraseña";
    int codigo = r.nextInt(9999);
    String cuerpo="Su codigo de verificacion es el siguiente: "+
            "\n"+
            "\n"+
            "Codigo:" + codigo;
    
    String remitente = "no-reply@Calenderapp.com";
    
    Properties propiedades = System.getProperties();
    propiedades.put("mail.smtp.host","aspmx.l.google.com"); //Servidor de Correos SMTP de google
    propiedades.put("mail.smtp.user", remitente);
 //   propiedades.put("mail.smtp.clave","clave");
 // propiedades.put("mail.smtp.auth", "true"); 
//    propiedades.put("mail.smtp.starttls.enable", "true");
    propiedades.put("mail.smtp.port", "25");
    
    Session session = Session.getDefaultInstance(propiedades);
    MimeMessage message = new MimeMessage(session);
    

    try {
        message.setFrom(new InternetAddress(remitente));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
        message.setSubject(asunto);
        message.setText(cuerpo);
        Transport transport = session.getTransport("smtp");
        transport.connect("aspmx.l.google.com", remitente);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
        
        
    } catch (MessagingException e) {
       JOptionPane.showMessageDialog(null,"Error: " + e.getMessage(), "Error!!!",JOptionPane.ERROR_MESSAGE);
    }
    return codigo;
   
}//.   


}//FIN CLASE.
