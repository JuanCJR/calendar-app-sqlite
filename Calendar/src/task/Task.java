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

import com.sun.glass.events.KeyEvent;
import funciones.*;
import gestionbd.GestionBD;
import java.awt.LayoutManager;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import principal.Integrantes;
import principal.Login;


public class Task extends javax.swing.JFrame {

    String Usuario = Login.usuario;
    GestionBD gbd = new GestionBD();
    
    public Task() {
        initComponents();
        ImageIcon iconoApp = new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSolo.png"));
        this.setTitle("Calendar");
        this.setLocationRelativeTo(null);
        this.setIconImage(iconoApp.getImage());
        tablaTareas.setDefaultRenderer(Object.class,new IconRenderer());
        tablaTareasCompletadas.setDefaultRenderer(Object.class,new IconRenderer());
        
        //Muestra tareas en la tabla
        gbd.muestraTareas(tablaTareas, Usuario);
        gbd.muestraTareasCompletadas(tablaTareasCompletadas, Usuario);
        txtUsuario.setText("Usuario: " + Usuario);
        

        txtUsuario.setText("Usuario: " + Usuario);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tareasPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTareas = new javax.swing.JTable();
        btnNuevaTarea = new javax.swing.JButton();
        btnEliminaTarea = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        txtTitulo2 = new javax.swing.JLabel();
        TareasCompletadasPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaTareasCompletadas = new javax.swing.JTable();
        btnRefrescar2 = new javax.swing.JButton();
        txtTitulo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnIntegrantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelContenedor.setBackground(new java.awt.Color(42, 43, 74));
        panelContenedor.setForeground(new java.awt.Color(42, 43, 74));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 127, 39));
        txtTitulo.setText("Menu Tareas");

        jTabbedPane1.setBackground(new java.awt.Color(42, 43, 74));
        jTabbedPane1.setForeground(new java.awt.Color(255, 127, 39));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setDoubleBuffered(true);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tareasPanel.setBackground(new java.awt.Color(42, 43, 74));
        tareasPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 127, 39)));
        tareasPanel.setForeground(new java.awt.Color(255, 127, 39));
        tareasPanel.setToolTipText("Tareas Completadas");
        tareasPanel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tablaTareas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tablaTareas.setModel(new javax.swing.table.DefaultTableModel(
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
        });
        tablaTareas.setRowHeight(30);
        tablaTareas.setSelectionBackground(new java.awt.Color(255, 127, 39));
        tablaTareas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaTareasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTareas);
        if (tablaTareas.getColumnModel().getColumnCount() > 0) {
            tablaTareas.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaTareas.getColumnModel().getColumn(1).setPreferredWidth(40);
            tablaTareas.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaTareas.getColumnModel().getColumn(3).setPreferredWidth(500);
            tablaTareas.getColumnModel().getColumn(4).setPreferredWidth(50);
            tablaTareas.getColumnModel().getColumn(5).setPreferredWidth(40);
            tablaTareas.getColumnModel().getColumn(6).setPreferredWidth(40);
        }

        btnNuevaTarea.setBackground(new java.awt.Color(42, 43, 74));
        btnNuevaTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add1.png"))); // NOI18N
        btnNuevaTarea.setToolTipText("Agregar Tarea");
        btnNuevaTarea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        btnEliminaTarea.setBackground(new java.awt.Color(42, 43, 74));
        btnEliminaTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete1.png"))); // NOI18N
        btnEliminaTarea.setToolTipText("Eliminar Tarea");
        btnEliminaTarea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminaTarea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEliminaTareaMouseMoved(evt);
            }
        });
        btnEliminaTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminaTareaMouseExited(evt);
            }
        });
        btnEliminaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaTareaActionPerformed(evt);
            }
        });

        btnRefrescar.setBackground(new java.awt.Color(42, 43, 74));
        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/refresh1.png"))); // NOI18N
        btnRefrescar.setToolTipText("Refrescar");
        btnRefrescar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefrescar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRefrescarMouseMoved(evt);
            }
        });
        btnRefrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRefrescarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRefrescarMousePressed(evt);
            }
        });
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        txtTitulo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTitulo2.setForeground(new java.awt.Color(255, 127, 39));
        txtTitulo2.setText("Tareas");

        javax.swing.GroupLayout tareasPanelLayout = new javax.swing.GroupLayout(tareasPanel);
        tareasPanel.setLayout(tareasPanelLayout);
        tareasPanelLayout.setHorizontalGroup(
            tareasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tareasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tareasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                    .addGroup(tareasPanelLayout.createSequentialGroup()
                        .addComponent(btnNuevaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefrescar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tareasPanelLayout.createSequentialGroup()
                        .addComponent(txtTitulo2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tareasPanelLayout.setVerticalGroup(
            tareasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tareasPanelLayout.createSequentialGroup()
                .addComponent(txtTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tareasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefrescar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminaTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/task2.png")), tareasPanel); // NOI18N

        TareasCompletadasPanel.setBackground(new java.awt.Color(42, 43, 74));
        TareasCompletadasPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 127, 39)));
        TareasCompletadasPanel.setForeground(new java.awt.Color(255, 127, 39));
        TareasCompletadasPanel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tablaTareasCompletadas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tablaTareasCompletadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", "", null, "", null, null, "", null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, "", null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Usuario", "N° Tarea", "Prioridad", "Tipo", "Descripcion", "Inicio", "Fin", "Porcentaje", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTareasCompletadas.setRowHeight(30);
        tablaTareasCompletadas.setSelectionBackground(new java.awt.Color(255, 127, 39));
        tablaTareasCompletadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaTareasCompletadasKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tablaTareasCompletadas);
        if (tablaTareasCompletadas.getColumnModel().getColumnCount() > 0) {
            tablaTareasCompletadas.getColumnModel().getColumn(4).setPreferredWidth(350);
            tablaTareasCompletadas.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        btnRefrescar2.setBackground(new java.awt.Color(42, 43, 74));
        btnRefrescar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/refresh1.png"))); // NOI18N
        btnRefrescar2.setToolTipText("Refrescar");
        btnRefrescar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefrescar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRefrescar2MouseMoved(evt);
            }
        });
        btnRefrescar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRefrescar2MouseExited(evt);
            }
        });
        btnRefrescar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescar2ActionPerformed(evt);
            }
        });

        txtTitulo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTitulo1.setForeground(new java.awt.Color(255, 127, 39));
        txtTitulo1.setText("Tareas Completadas");

        javax.swing.GroupLayout TareasCompletadasPanelLayout = new javax.swing.GroupLayout(TareasCompletadasPanel);
        TareasCompletadasPanel.setLayout(TareasCompletadasPanelLayout);
        TareasCompletadasPanelLayout.setHorizontalGroup(
            TareasCompletadasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TareasCompletadasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TareasCompletadasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                    .addGroup(TareasCompletadasPanelLayout.createSequentialGroup()
                        .addGroup(TareasCompletadasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefrescar2)
                            .addComponent(txtTitulo1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        TareasCompletadasPanelLayout.setVerticalGroup(
            TareasCompletadasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TareasCompletadasPanelLayout.createSequentialGroup()
                .addComponent(txtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefrescar2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/task_complete.png")), TareasCompletadasPanel); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 127, 39));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSoloPequeño.png"))); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 127, 39));
        txtUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user.png"))); // NOI18N
        txtUsuario.setText("Usuario:");

        btnExit.setBackground(new java.awt.Color(42, 43, 74));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/exit1.png"))); // NOI18N
        btnExit.setToolTipText("Cerrar Sesion");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnExitMouseMoved(evt);
            }
        });
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnIntegrantes.setBackground(new java.awt.Color(42, 43, 74));
        btnIntegrantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user.png"))); // NOI18N
        btnIntegrantes.setToolTipText("Integrantes");
        btnIntegrantes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegrantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsuario)
                        .addGap(156, 156, 156)))
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIntegrantes)
                        .addGap(30, 30, 30))))
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorLayout.createSequentialGroup()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1))
                    .addGroup(panelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIntegrantes)
                        .addGap(77, 77, 77)
                        .addComponent(btnExit)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseMoved
       Funciones.switchBtnIcon(getClass(), btnExit, "exit",2);
    }//GEN-LAST:event_btnExitMouseMoved

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
       Funciones.switchBtnIcon(getClass(), btnExit, "exit",1);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void tablaTareasCompletadasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaTareasCompletadasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaTareasCompletadasKeyReleased

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        DefaultTableModel modeloTabla =(DefaultTableModel) tablaTareas.getModel();
        modeloTabla.fireTableDataChanged();
        tablaTareas.setModel(Funciones.devuelveModelo());
        jScrollPane1.setViewportView(tablaTareas);
        if (tablaTareas.getColumnModel().getColumnCount() > 0) {
            tablaTareas.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaTareas.getColumnModel().getColumn(1).setPreferredWidth(40);
            tablaTareas.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaTareas.getColumnModel().getColumn(3).setPreferredWidth(500);
            tablaTareas.getColumnModel().getColumn(4).setPreferredWidth(50);
            tablaTareas.getColumnModel().getColumn(5).setPreferredWidth(40);
            tablaTareas.getColumnModel().getColumn(6).setPreferredWidth(40);
        }
        gbd.muestraTareas(tablaTareas, Usuario);

    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnRefrescarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefrescarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefrescarMousePressed

    private void btnRefrescarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefrescarMouseExited
        Funciones.switchBtnIcon(getClass(), btnRefrescar, "refresh", 1);
    }//GEN-LAST:event_btnRefrescarMouseExited

    private void btnRefrescarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefrescarMouseMoved
        Funciones.switchBtnIcon(getClass(), btnRefrescar, "refresh", 2);
    }//GEN-LAST:event_btnRefrescarMouseMoved

    private void btnEliminaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaTareaActionPerformed

        DefaultTableModel modeloTabla =(DefaultTableModel) tablaTareas.getModel();
        int  nro_tarea = (int)modeloTabla.getValueAt(tablaTareas.getSelectedRow(),0);
        gbd.EliminaTarea(nro_tarea);
        modeloTabla.removeRow(tablaTareas.getSelectedRow());

    }//GEN-LAST:event_btnEliminaTareaActionPerformed

    private void btnEliminaTareaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaTareaMouseExited
        Funciones.switchBtnIcon(getClass(), btnEliminaTarea, "delete", 1);
    }//GEN-LAST:event_btnEliminaTareaMouseExited

    private void btnEliminaTareaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminaTareaMouseMoved
        Funciones.switchBtnIcon(getClass(), btnEliminaTarea, "delete", 2);
    }//GEN-LAST:event_btnEliminaTareaMouseMoved

    private void btnNuevaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaTareaActionPerformed
        NuevaTarea nt = new NuevaTarea();
        nt.setVisible(true);

        gbd.muestraTareas(tablaTareas, Usuario);
    }//GEN-LAST:event_btnNuevaTareaActionPerformed

    private void btnNuevaTareaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaTareaMouseExited
        Funciones.switchBtnIcon(getClass(), btnNuevaTarea, "add",1);
    }//GEN-LAST:event_btnNuevaTareaMouseExited

    private void btnNuevaTareaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaTareaMouseMoved
        Funciones.switchBtnIcon(getClass(), btnNuevaTarea, "add",2);
    }//GEN-LAST:event_btnNuevaTareaMouseMoved

    private void tablaTareasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaTareasKeyReleased

        //Codigo para detectar celdas modificadas en la tabla
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            DefaultTableModel modeloTabla =(DefaultTableModel) tablaTareas.getModel();
            int  nro_tarea = (int)modeloTabla.getValueAt(tablaTareas.getSelectedRow(),0);

            String Campo = tablaTareas.getColumnName(tablaTareas.getSelectedColumn());

            String  celdaModificada = (String)tablaTareas.getValueAt(tablaTareas.getSelectedRow(),tablaTareas.getSelectedColumn()).toString();

            gbd.ActualizaTarea(Campo,celdaModificada, nro_tarea);

        }
    }//GEN-LAST:event_tablaTareasKeyReleased

    private void btnIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegrantesActionPerformed
      Integrantes i = new Integrantes();
      i.setVisible(true);
    }//GEN-LAST:event_btnIntegrantesActionPerformed

    private void btnRefrescar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescar2ActionPerformed
        DefaultTableModel modeloTabla2 =(DefaultTableModel) tablaTareasCompletadas.getModel();
        modeloTabla2.fireTableDataChanged();
        gbd.muestraTareasCompletadas(tablaTareasCompletadas, Usuario);
    }//GEN-LAST:event_btnRefrescar2ActionPerformed

    private void btnRefrescar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefrescar2MouseExited
        Funciones.switchBtnIcon(getClass(), btnRefrescar2, "refresh", 1);
    }//GEN-LAST:event_btnRefrescar2MouseExited

    private void btnRefrescar2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefrescar2MouseMoved
        Funciones.switchBtnIcon(getClass(), btnRefrescar2, "refresh", 2);
    }//GEN-LAST:event_btnRefrescar2MouseMoved

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
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Task().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TareasCompletadasPanel;
    private javax.swing.JButton btnEliminaTarea;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIntegrantes;
    private javax.swing.JButton btnNuevaTarea;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton btnRefrescar2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JTable tablaTareas;
    private javax.swing.JTable tablaTareasCompletadas;
    private javax.swing.JPanel tareasPanel;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTitulo1;
    private javax.swing.JLabel txtTitulo2;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
