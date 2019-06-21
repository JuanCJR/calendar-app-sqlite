
package Funciones;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Mail {


public static void sendEmail(String destinatario, String asunto, String cuerpo){
    
    String remitente = "no-repy@CalenderApp.com";
    
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
}//.   


}//FIN CLASE.
