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
package task;

import funciones.Funciones;
import gestionbd.GestionBD;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import principal.Login;


public class NuevaTarea extends javax.swing.JFrame {
    
        GestionBD gbd = new GestionBD();
        String Usuario = Login.usuario;
        
    public NuevaTarea() {
        initComponents();
         ImageIcon iconoApp = new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSolo.png"));
        this.setTitle("Calendar");
        this.setLocationRelativeTo(null);
        this.setIconImage(iconoApp.getImage());
        
        ConfigurarRB();
        String tipoTareas [] = gbd.getTipoTareas();
        
        for (int i = 0; i < tipoTareas.length; i++) {
            
             cbTipoTarea.addItem(tipoTareas[i]);
        }
       
        
    }
    
    
    //Agrupacion de radio buttons
    private void ConfigurarRB(){
        
        ButtonGroup bg = new ButtonGroup();
        
        bg.add(rbBaja);
        bg.add(rbMedia);
        bg.add(rbAlta);
        bg.add(rbMuyAlta);
        
        rbBaja.setSelected(true);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NuevaTareaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfDescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbBaja = new javax.swing.JRadioButton();
        rbMedia = new javax.swing.JRadioButton();
        rbAlta = new javax.swing.JRadioButton();
        rbMuyAlta = new javax.swing.JRadioButton();
        btnNuevaTarea = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbTipoTarea = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        NuevaTareaPanel.setBackground(new java.awt.Color(42, 43, 74));
        NuevaTareaPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 127, 39)));
        NuevaTareaPanel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 127, 39));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSoloPequeño.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 127, 39));
        jLabel6.setText("Descripcion:");

        txtfDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtfDescripcion.setToolTipText("");
        txtfDescripcion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 127, 39)));
        txtfDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtfDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfDescripcionFocusLost(evt);
            }
        });
        txtfDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtfDescripcionMouseReleased(evt);
            }
        });
        txtfDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfDescripcionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 127, 39));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit_user1.png"))); // NOI18N
        jLabel1.setText("Nueva Tarea");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 127, 39));
        jLabel7.setText("Prioridad:");

        rbBaja.setBackground(new java.awt.Color(42, 43, 74));
        rbBaja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbBaja.setForeground(new java.awt.Color(255, 127, 39));
        rbBaja.setText("Baja");

        rbMedia.setBackground(new java.awt.Color(42, 43, 74));
        rbMedia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMedia.setForeground(new java.awt.Color(255, 127, 39));
        rbMedia.setText("Media");

        rbAlta.setBackground(new java.awt.Color(42, 43, 74));
        rbAlta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbAlta.setForeground(new java.awt.Color(255, 127, 39));
        rbAlta.setText("Alta");

        rbMuyAlta.setBackground(new java.awt.Color(42, 43, 74));
        rbMuyAlta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMuyAlta.setForeground(new java.awt.Color(255, 127, 39));
        rbMuyAlta.setText("Muy Alta");

        btnNuevaTarea.setBackground(new java.awt.Color(42, 43, 74));
        btnNuevaTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login1.png"))); // NOI18N
        btnNuevaTarea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnNuevaTareaMouseMoved(evt);
            }
        });
        btnNuevaTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevaTareaMouseExited(evt);
            }
        });
        btnNuevaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaTareaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 127, 39));
        jLabel8.setText("Tipo Tarea:");

        javax.swing.GroupLayout NuevaTareaPanelLayout = new javax.swing.GroupLayout(NuevaTareaPanel);
        NuevaTareaPanel.setLayout(NuevaTareaPanelLayout);
        NuevaTareaPanelLayout.setHorizontalGroup(
            NuevaTareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevaTareaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NuevaTareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NuevaTareaPanelLayout.createSequentialGroup()
                        .addGroup(NuevaTareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(NuevaTareaPanelLayout.createSequentialGroup()
                                .addGroup(NuevaTareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(NuevaTareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTipoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(NuevaTareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(NuevaTareaPanelLayout.createSequentialGroup()
                                            .addComponent(rbBaja)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbMedia)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbAlta)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rbMuyAlta))
                                        .addComponent(txtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(NuevaTareaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        NuevaTareaPanelLayout.setVerticalGroup(
            NuevaTareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevaTareaPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevaTarea)
                .addContainerGap())
            .addGroup(NuevaTareaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(NuevaTareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NuevaTareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbBaja)
                    .addComponent(rbMedia)
                    .addComponent(rbAlta)
                    .addComponent(rbMuyAlta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NuevaTareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbTipoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevaTareaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NuevaTareaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfDescripcionFocusLost

       
    }//GEN-LAST:event_txtfDescripcionFocusLost

    private void txtfDescripcionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfDescripcionMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfDescripcionMouseReleased

    private void txtfDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfDescripcionActionPerformed

    private void btnNuevaTareaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaTareaMouseMoved
        Funciones.switchBtnIcon(getClass(), btnNuevaTarea, "login",2);
    }//GEN-LAST:event_btnNuevaTareaMouseMoved

    private void btnNuevaTareaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaTareaMouseExited
        Funciones.switchBtnIcon(getClass(), btnNuevaTarea, "login",1);
    }//GEN-LAST:event_btnNuevaTareaMouseExited

    private void btnNuevaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaTareaActionPerformed
        
        String Fecha = Funciones.getFecha();
        String Descripcion = txtfDescripcion.getText();
        String Prioridad = null;
        String codTarea = Integer.toString(cbTipoTarea.getSelectedIndex()+1);
        String codUsuario = Integer.toString(gbd.getCodUsuario(Usuario));
        if(rbBaja.isSelected()){
            Prioridad = rbBaja.getText();
            
        }else if(rbMedia.isSelected()){
            Prioridad = rbMedia.getText();
            
        }else if(rbAlta.isSelected()){
            Prioridad = rbAlta.getText();
        
        }else if(rbMuyAlta.isSelected()){
            Prioridad = rbMuyAlta.getText();
           
        }//fin SI.
        
        
        gbd.CreaTarea(Descripcion, Prioridad, Fecha, codUsuario, codTarea);
           this.dispose();
    }//GEN-LAST:event_btnNuevaTareaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NuevaTareaPanel;
    private javax.swing.JButton btnNuevaTarea;
    private javax.swing.JComboBox<String> cbTipoTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rbAlta;
    private javax.swing.JRadioButton rbBaja;
    private javax.swing.JRadioButton rbMedia;
    private javax.swing.JRadioButton rbMuyAlta;
    private javax.swing.JTextField txtfDescripcion;
    // End of variables declaration//GEN-END:variables
}
