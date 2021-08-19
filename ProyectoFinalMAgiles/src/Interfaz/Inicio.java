package Interfaz;

import Controlador.Operaciones;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inicio extends javax.swing.JFrame {

    int gn = 0;
    int blok = 0;
    Operaciones ctrl = new Operaciones();
    DefaultListModel modeloLista = new DefaultListModel();
    DefaultTableModel modeltab = new DefaultTableModel();
    String[] lista = null;
    String encargado = "";

    public Inicio() {

        initComponents();
        jBsaladmin.setVisible(false);
        val.setVisible(false);
          jPanel1.setVisible(false);
        jlAdmin.setVisible(false);
        jPAdmin.setVisible(false);
        jTidPRoc.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (jTidPRoc.getText().length() > 4) {
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "A exedido el limite de caracteres\n Solo se permite una cadena de 5 caracteres.");
                }
            }
        });
        jtNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (jtNombre.getText().length() > 19) {
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "A exedido el limite de caracteres\n Solo se permite una cadena de 20 caracteres.");
                }
            }
        });

        ctrl.cargarActivos();
        this.setLocationRelativeTo(null);
        jpActivos.setVisible(false);
        jpFunActivos.setVisible(false);
        jlista.setModel(modeloLista);
        jTActivosusuario.setModel(modeltab);
        Jlmensaje.setVisible(false);
        jLEstadoCuenat.setVisible(false);
        jLStadVal.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPAdmin = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jBsaladmin = new javax.swing.JButton();
        val = new javax.swing.JLabel();
        jpIngreso = new javax.swing.JPanel();
        jtUser = new javax.swing.JTextField();
        jtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbIngresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Jlmensaje = new javax.swing.JLabel();
        jLEstadoCuenat = new javax.swing.JLabel();
        jLdes = new javax.swing.JLabel();
        jlAdmin = new javax.swing.JLabel();
        jpFunActivos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtFunActivos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlista = new javax.swing.JList<>();
        jbquitarlista = new javax.swing.JButton();
        jbAgregarlista = new javax.swing.JButton();
        jbValidar2 = new javax.swing.JButton();
        jtasignar = new javax.swing.JLabel();
        jBsalir1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTActivosusuario = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jpActivos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtValidar = new javax.swing.JTable();
        jbRegresar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jBsalir = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtValidacion = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTidPRoc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLStadVal = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jpSalir = new javax.swing.JPanel();
        jlSalir = new javax.swing.JLabel();
        jlMinimizar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jPAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 4), "Opciones de administrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Swis721 BdCnOul BT", 0, 24))); // NOI18N
        jPAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jButton2.setText("Asignar Rol");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPAdmin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jButton3.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jButton3.setText("Desbloquear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPAdmin.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jPanel1.add(jPAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 390, 170));

        jBsaladmin.setFont(new java.awt.Font("HP Simplified", 0, 12)); // NOI18N
        jBsaladmin.setText("Regresar");
        jBsaladmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsaladminActionPerformed(evt);
            }
        });
        jPanel1.add(jBsaladmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, -1, -1));
        jPanel1.add(val, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 560, 600));

        jpIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jpIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtUser.setBorder(null);
        jpIngreso.add(jtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 180, 40));

        jtPass.setBorder(null);
        jpIngreso.add(jtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 176, 55));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel1.setText("Usuario :");
        jpIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña :");
        jpIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel3.setText("Registro");
        jpIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jbIngresar.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        jpIngreso.add(jbIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 100, 40));
        jpIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 230, 20));
        jpIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 230, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_96px_2.png"))); // NOI18N
        jpIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jButton1.setText("Administrador");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpIngreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 110, 30));
        jpIngreso.add(Jlmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 40));
        jpIngreso.add(jLEstadoCuenat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, 30));
        jpIngreso.add(jLdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 60, 40));
        jpIngreso.add(jlAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 30, 30));

        getContentPane().add(jpIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 560, 600));

        jpFunActivos.setBackground(new java.awt.Color(255, 255, 255));
        jpFunActivos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jpFunActivos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel8.setText("Funcionarios y activos");
        jpFunActivos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jtFunActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtFunActivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtFunActivosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtFunActivos);

        jpFunActivos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 350, 110));

        jScrollPane3.setViewportView(jlista);

        jpFunActivos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 80, 100));

        jbquitarlista.setFont(new java.awt.Font("Cooper Black", 2, 10)); // NOI18N
        jbquitarlista.setText("<<");
        jbquitarlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbquitarlistaActionPerformed(evt);
            }
        });
        jpFunActivos.add(jbquitarlista, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        jbAgregarlista.setFont(new java.awt.Font("Cooper Black", 2, 10)); // NOI18N
        jbAgregarlista.setText(">>");
        jbAgregarlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarlistaActionPerformed(evt);
            }
        });
        jpFunActivos.add(jbAgregarlista, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        jbValidar2.setFont(new java.awt.Font("Cooper Black", 0, 10)); // NOI18N
        jbValidar2.setText("Validar");
        jbValidar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbValidar2ActionPerformed(evt);
            }
        });
        jpFunActivos.add(jbValidar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, -1, -1));

        jtasignar.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jpFunActivos.add(jtasignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 340, 30));

        jBsalir1.setBackground(new java.awt.Color(255, 255, 255));
        jBsalir1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBsalir1.setText("Cerrar sesión");
        jBsalir1.setBorder(null);
        jBsalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalir1ActionPerformed(evt);
            }
        });
        jpFunActivos.add(jBsalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 90, 30));

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lista de activos");
        jpFunActivos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 120, 30));

        jTActivosusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTActivosusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTActivosusuarioMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTActivosusuario);

        jpFunActivos.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 530, 80));

        jLabel9.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel9.setText("Detalle de activos");
        jpFunActivos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel11.setText("Eliminar");
        jpFunActivos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel12.setText("Agregar");
        jpFunActivos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        getContentPane().add(jpFunActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 560, 600));

        jpActivos.setBackground(new java.awt.Color(255, 255, 255));
        jpActivos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jpActivos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel5.setText("Asignar identificador:");
        jpActivos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel6.setText("Proceso de validación");
        jpActivos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jtValidar.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jtValidar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtValidar);

        jpActivos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 110));

        jbRegresar.setFont(new java.awt.Font("Cooper Black", 0, 10)); // NOI18N
        jbRegresar.setText("Regresar");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });
        jpActivos.add(jbRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, -1));

        jbGuardar.setFont(new java.awt.Font("Cooper Black", 0, 10)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jpActivos.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        jtNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jpActivos.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 180, 30));

        jBsalir.setBackground(new java.awt.Color(255, 255, 255));
        jBsalir.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBsalir.setText("Cerrar sesión");
        jBsalir.setBorder(null);
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jpActivos.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        jtValidacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jtValidacion);

        jpActivos.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 380, 130));

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel10.setText("Lista de procesos existentes.");
        jpActivos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jTidPRoc.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTidPRoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTidPRocKeyPressed(evt);
            }
        });
        jpActivos.add(jTidPRoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 180, 30));

        jLabel13.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel13.setText("Lista de activos para el proceso:");
        jpActivos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jpActivos.add(jLStadVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 40, 20));

        jLabel15.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel15.setText("Asignar nombre :");
        jpActivos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        getContentPane().add(jpActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 560, 600));

        jpSalir.setBackground(new java.awt.Color(255, 255, 255));
        jpSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jpSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Multiply_32px.png"))); // NOI18N
        jlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSalirMouseClicked(evt);
            }
        });
        jpSalir.add(jlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 20));

        jlMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jlMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimizarMouseClicked(evt);
            }
        });
        jpSalir.add(jlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 20));

        jLabel14.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel14.setText("Sistema de validación.");
        jpSalir.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jpSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseClicked
        encargado = "";
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "SALIR", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jlSalirMouseClicked

    private void jlMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizarMouseClicked
        this.setState(Inicio.ICONIFIED);
    }//GEN-LAST:event_jlMinimizarMouseClicked

    private void jbValidar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbValidar2ActionPerformed
        int ind = modeloLista.getSize();
        if (ind <= 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar almenos un activo para validar");

        } else {
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Va a iniciar un.\n proceso de validacion?", "VALIDAR", dialog);
            if (result == 0) {
                int i = modeloLista.getSize();
                lista = new String[i];
                for (int j = 0; j < i; j++) {
                    lista[j] = modeloLista.get(j).toString();
                }
                ctrl.activarpanel(3);
                ctrl.cargarXactivo(lista);
                ctrl.cargarValidaciones();
                jtasignar.setText("");
            }

        }


    }//GEN-LAST:event_jbValidar2ActionPerformed

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        String[] li = new String[1];
        li[0] = "";
        if (gn == 1) {

            jTidPRoc.setText("");
            jtNombre.setText("");
            ctrl.cargarXactivo(li);
            ctrl.activarpanel(2);
            modeloLista.removeAllElements();
            ctrl.cargarXusuario("");
        } else {
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Aun no guardó el proceso\n"
                    + "¿Desea salir?\n"
                    + "se perderán los datos.", "SALIR", dialog);
            if (result == 0) {
                jTidPRoc.setText("");
                jtNombre.setText("");
                ctrl.cargarXactivo(li);
                ctrl.activarpanel(2);
                modeloLista.removeAllElements();
                ctrl.cargarXusuario("");
                jtasignar.setText("");
            }

        }


    }//GEN-LAST:event_jbRegresarActionPerformed

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        String user = jtUser.getText();
        String pass = jtPass.getText();
        ctrl.estadoCuenta(user);
        String est = jLEstadoCuenat.getText();
        if (est == "A") {
            ctrl.login(user, pass);
            String cont = Jlmensaje.getText();

            if (cont != "Bienvenido") {
                if (est == "A") {
                    blok++;
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas.\nSu cuenta se bloqueará en:\n" + blok + "/3 Intentos");
                    if (blok == 3) {
                        JOptionPane.showMessageDialog(null, "Cuenta bloqueada\nPongase en contacto con el administrador");
                        ctrl.bloquear(user);
                        blok = 0;
                    }
                }
            } else {
                blok = 0;
                encargado = user;
                JOptionPane.showMessageDialog(null, "Bienvenido");
                ctrl.activarpanel(2);
                ctrl.cargarXusuario("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Su cuenta esta bloqueada\nPongase en contacto con el administrador");
            Jlmensaje.setText("");

        }


    }//GEN-LAST:event_jbIngresarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        String nom = jtNombre.getText();
        String idpro = jTidPRoc.getText();

        if (nom.length() == 0 || idpro.length() == 0) {
            if (nom.length() == 0) {
                JOptionPane.showMessageDialog(null, "Asigne un nombre al proceso");
            } else if (idpro.length() == 0) {
                JOptionPane.showMessageDialog(null, "Asigne un ID al proceso");
            } else if (nom.length() == 0 && idpro.length() == 0) {
            }

        } else {

            ctrl.ConsultarProceso(idpro);
            String exist = jLStadVal.getText();
            if (exist == "si") {
                JOptionPane.showMessageDialog(null, "El proceso ya existe\n. Verifique los datos");
                gn = 0;
            } else {
                ctrl.guardarproceso(idpro, nom, encargado);
                int a = jtValidar.getRowCount();
                for (int i = 0; i < a; i++) {
                    String idActi = jtValidar.getValueAt(i, 0).toString();
                    ctrl.guardaractivos(idActi, idpro);
                    ctrl.cargarValidaciones();
                    gn = 1;
                }

            }

        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtFunActivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFunActivosMouseClicked
        int fila = jtFunActivos.getSelectedRow();
        String nom = jtFunActivos.getValueAt(fila, 1).toString();
        String usu = jtFunActivos.getValueAt(fila, 0).toString();
        String ape = jtFunActivos.getValueAt(fila, 2).toString();
        jtasignar.setText("Usted a seleccionado a : " + nom + " " + ape);
        ctrl.cargarXusuario(usu);
    }//GEN-LAST:event_jtFunActivosMouseClicked

    private void jbAgregarlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarlistaActionPerformed
        int cont = 0;
        int tamlist = modeloLista.getSize();
        int a = jtFunActivos.getSelectedRow();
        int fila = jTActivosusuario.getSelectedRow();
        if (fila >= 0) {
            String user = jTActivosusuario.getValueAt(fila, 0).toString();
            modeloLista.addElement(user);
        } else {
            if (a <= 0 && tamlist <= 0) {
                JOptionPane.showMessageDialog(null, "Selecciones un activo.\n"
                        + "1.-Seleccione un usuario de la tabla\n"
                        + "2.- Seleccione un activo de la tabla 'Detalle activos'");
            } else {
                JOptionPane.showMessageDialog(null, "Selecciones un activo");
            }
        }


    }//GEN-LAST:event_jbAgregarlistaActionPerformed

    private void jbquitarlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbquitarlistaActionPerformed
        int tamlist = modeloLista.getSize();
        if (tamlist == 0) {
            JOptionPane.showMessageDialog(null, "Su lista esta vacia");
        } else {

            int ind = jlista.getSelectedIndex();
            if (ind >= 0) {
                modeloLista.remove(ind);

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un activo de su lista");
            }
        }
    }//GEN-LAST:event_jbquitarlistaActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "SALIR", dialog);
        if (result == 0) {
            modeloLista.removeAllElements();
            encargado = "";
            ctrl.activarpanel(1);
            jTActivosusuario.getModel();
            jtFunActivos.clearSelection();
            ctrl.cargarXusuario("");
            jtasignar.setText("");
            jTidPRoc.setText("");
            jtNombre.setText("");
        }


    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalir1ActionPerformed
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "SALIR", dialog);
        if (result == 0) {
            modeloLista.removeAllElements();
            encargado = "";
            ctrl.activarpanel(1);
            jTActivosusuario.getModel();
            jtFunActivos.clearSelection();
            ctrl.cargarXusuario("");
            jtasignar.setText("");
        }


    }//GEN-LAST:event_jBsalir1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cuenta = JOptionPane.showInputDialog("Ingrese el ID de administrador");
        String pass = JOptionPane.showInputDialog("Ingrese su contraseña");
        ctrl.verificarAdmin(cuenta, pass);
        String admin = jlAdmin.getText();

        if (admin == "ok") {
            int dialog = JOptionPane.WHEN_IN_FOCUSED_WINDOW;
            int result = JOptionPane.showConfirmDialog(null, "Acaba de ingresar como administrdor\n"
                    + "1.- Puede asignar Roles de administador a un usuario\n"
                    + "2.- Puede desbloquear una cuenta\n"
                    + "¿Desea contiuar?", "Confirmar", dialog);
            if (result == 0) {
                jPAdmin.setVisible(true);
                  jPanel1.setVisible(true);
                  jpIngreso.setVisible(false);
                  jBsaladmin.setVisible(true);

            }

        }

//        ctrl.login2(cuenta, pass);
//        String cont = Jlmensaje.getText();
//        System.out.println(cont);
//        if (cont == "Bienvenido") {
//            ctrl.desbloquear(cuenta);
//        } else {
//            JOptionPane.showMessageDialog(null, "No fue posible desbloquear");
//        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTActivosusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTActivosusuarioMouseClicked

    }//GEN-LAST:event_jTActivosusuarioMouseClicked

    private void jTidPRocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidPRocKeyPressed

    }//GEN-LAST:event_jTidPRocKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String usuer = JOptionPane.showInputDialog("Ingrese el usuario a desbloquear");
        String passu = JOptionPane.showInputDialog("Ingrese la contraseña");
        ctrl.login2(usuer, passu);
        String cont = Jlmensaje.getText();
        if (cont == "Bienvenido") {
            ctrl.desbloquear(usuer);
            jPAdmin.setVisible(false);
              jPanel1.setVisible(false);
                jpIngreso.setVisible(true);
                  jBsaladmin.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Los datos del usuario\nson incorrectos.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String usuer = JOptionPane.showInputDialog("Ingrese el usuario para su asignacion");
        ctrl.usu(usuer);
       String resp1=val.getText();
       if(resp1=="si"){
               String passu = "admin";
        ctrl.asigRol(usuer, passu);
        String res= jlAdmin.getText();
        if(res=="asignar"){
            jPAdmin.setVisible(false);
            jPanel1.setVisible(false);
              jPanel1.setVisible(false);
              jBsaladmin.setVisible(false);
              jpIngreso.setVisible(true);
       }
    
        }else{
            JOptionPane.showMessageDialog(null, "No se actualizó");
        }
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBsaladminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsaladminActionPerformed
          jpIngreso.setVisible(true);
            jBsaladmin.setVisible(false);
            jPanel1.setVisible(false);
    }//GEN-LAST:event_jBsaladminActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Jlmensaje;
    private javax.swing.JButton jBsaladmin;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBsalir1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JLabel jLEstadoCuenat;
    public static javax.swing.JLabel jLStadVal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLdes;
    private javax.swing.JPanel jPAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTActivosusuario;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTidPRoc;
    private javax.swing.JButton jbAgregarlista;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JButton jbValidar2;
    private javax.swing.JButton jbquitarlista;
    public static javax.swing.JLabel jlAdmin;
    private javax.swing.JLabel jlMinimizar;
    private javax.swing.JLabel jlSalir;
    public static javax.swing.JList<String> jlista;
    public static javax.swing.JPanel jpActivos;
    public static javax.swing.JPanel jpFunActivos;
    public static javax.swing.JPanel jpIngreso;
    private javax.swing.JPanel jpSalir;
    public static javax.swing.JTable jtFunActivos;
    public static javax.swing.JTextField jtNombre;
    public static javax.swing.JPasswordField jtPass;
    public static javax.swing.JTextField jtUser;
    public static javax.swing.JTable jtValidacion;
    public static javax.swing.JTable jtValidar;
    private javax.swing.JLabel jtasignar;
    public static javax.swing.JLabel val;
    // End of variables declaration//GEN-END:variables
}
