package task;

import javax.swing.*;


public class Panel extends JPanel{

    JPanel panelTarea = new JPanel();
    

    public JPanel agregaComponentes(){
        JScrollPane  scrollPane = new JScrollPane();
        JTable tablaTareas = new JTable();
        JButton btnNuevaTarea = new JButton();
        
        panelTarea.setBackground(new java.awt.Color(51, 51, 51));
        panelTarea.setFont(new java.awt.Font("Segoe UI", 0, 18));
        tablaTareas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tablaTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° Tarea", "Descripcion", "Prioridad", "% Completado", "Estado"
            }
        ));
        scrollPane.setViewportView(tablaTareas);
          btnNuevaTarea.setText("Nueva Tarea");
        
        GroupLayout Panel_Tarea_Layout = new GroupLayout(panelTarea);
        panelTarea.setLayout(Panel_Tarea_Layout);
        
        Panel_Tarea_Layout.setHorizontalGroup(Panel_Tarea_Layout.createParallelGroup(GroupLayout.Alignment.LEADING).
                addGroup(Panel_Tarea_Layout.createSequentialGroup().addContainerGap()
                .addComponent(scrollPane,javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevaTarea)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        
        Panel_Tarea_Layout.setVerticalGroup(
            Panel_Tarea_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Tarea_Layout.createSequentialGroup()
                .addGap(19, 19, 19)
              .addComponent(btnNuevaTarea)
                .addContainerGap(312, Short.MAX_VALUE))
            .addGroup(Panel_Tarea_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        return panelTarea;
    }//
    
   
    
}//FIN CLASE.
