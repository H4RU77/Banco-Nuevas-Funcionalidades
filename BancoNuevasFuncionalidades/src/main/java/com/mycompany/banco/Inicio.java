/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.banco;

import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author harum
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    //inicializar clases
    
     ListaSE<Solicitud> solicitudes = new ListaSE<>();
     ListaSE<Cuenta> cuentas = new ListaSE<>();
     ListaSE<Cuenta> cuentasMillonarios = new ListaSE<>(); 
     Banco b=new Banco(solicitudes,cuentas);
     int posicion = -1;
     
    public Inicio() {
        initComponents();
        InitStyles();
        
    }
    private void InitStyles(){
        inicio.putClientProperty( "FlatLaf.styleClass", "h1" );
        inicio.setForeground(Color.black);
        texto1.putClientProperty( "FlatLaf.styleClass", "h4" );
        texto1.setForeground(Color.black);
        texto2.putClientProperty( "FlatLaf.styleClass", "h4" );
        texto2.setForeground(Color.black);
        texto3.putClientProperty( "FlatLaf.styleClass", "h4" );
        texto3.setForeground(Color.black);
        texto4.putClientProperty( "FlatLaf.styleClass", "h4" );
        texto4.setForeground(Color.black);
        texto5.putClientProperty( "FlatLaf.styleClass", "h4" );
        texto5.setForeground(Color.black);
        texto6.putClientProperty( "FlatLaf.styleClass", "h4" );
        texto6.setForeground(Color.black);
        texto7.putClientProperty( "FlatLaf.styleClass", "h4" );
        texto7.setForeground(Color.black);
        texto8.putClientProperty( "FlatLaf.styleClass", "h4" );
        texto8.setForeground(Color.black);
        texto9.putClientProperty( "FlatLaf.styleClass", "h3" );
        texto9.setForeground(Color.black);
        texto11.putClientProperty( "FlatLaf.styleClass", "h4" );
        texto11.setForeground(Color.black);
        texto13.putClientProperty( "FlatLaf.styleClass", "h3" );
        texto13.setForeground(Color.black);
        texto12.putClientProperty( "FlatLaf.styleClass", "h3" );
        texto12.setForeground(Color.black);
        texto14.putClientProperty( "FlatLaf.styleClass", "h3" );
        texto14.setForeground(Color.black);
        texto15.putClientProperty( "FlatLaf.styleClass", "h3" );
        texto15.setForeground(Color.black);
        texto16.putClientProperty( "FlatLaf.styleClass", "h3" );
        texto16.setForeground(Color.black);
        texto17.putClientProperty( "FlatLaf.styleClass", "h3" );
        texto17.setForeground(Color.black);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        inicio = new javax.swing.JLabel();
        cerrarCuenta = new javax.swing.JButton();
        texto1 = new javax.swing.JLabel();
        atenderSolicitudes = new javax.swing.JButton();
        texto2 = new javax.swing.JLabel();
        mostrarCuentas = new javax.swing.JButton();
        texto3 = new javax.swing.JLabel();
        millonarios = new javax.swing.JButton();
        texto4 = new javax.swing.JLabel();
        verificarCuenta = new javax.swing.JButton();
        texto5 = new javax.swing.JLabel();
        crearCuenta = new javax.swing.JButton();
        texto6 = new javax.swing.JLabel();
        crearSolicitud = new javax.swing.JButton();
        texto7 = new javax.swing.JLabel();
        texto9 = new javax.swing.JLabel();
        texto12 = new javax.swing.JLabel();
        texto8 = new javax.swing.JLabel();
        mostrarMillonarios = new javax.swing.JButton();
        texto13 = new javax.swing.JLabel();
        texto14 = new javax.swing.JLabel();
        texto15 = new javax.swing.JLabel();
        texto16 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        panel4 = new java.awt.Panel();
        panel5 = new java.awt.Panel();
        texto11 = new javax.swing.JLabel();
        texto17 = new javax.swing.JLabel();
        retiro = new javax.swing.JButton();
        texto10 = new javax.swing.JLabel();
        panel6 = new java.awt.Panel();
        panel7 = new java.awt.Panel();
        panel8 = new java.awt.Panel();
        panel9 = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(860, 550));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio.setText("Inicio");
        background.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 130, 46));

        cerrarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2.jpg"))); // NOI18N
        cerrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarCuentaActionPerformed(evt);
            }
        });
        background.add(cerrarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 130, 125));

        texto1.setText("Eliminar cuenta");
        background.add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 90, -1));

        atenderSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b4.jpeg"))); // NOI18N
        atenderSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atenderSolicitudesActionPerformed(evt);
            }
        });
        background.add(atenderSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 130, 125));

        texto2.setText("Mostrar millonarios");
        background.add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 110, -1));

        mostrarCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b7.jpeg"))); // NOI18N
        mostrarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCuentasActionPerformed(evt);
            }
        });
        background.add(mostrarCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 130, 125));

        texto3.setText("Mostrar cuentas");
        background.add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 140, 20));

        millonarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b5.jpeg"))); // NOI18N
        millonarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                millonariosActionPerformed(evt);
            }
        });
        background.add(millonarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 130, 125));

        texto4.setText("Verificar cuenta");
        background.add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 90, -1));

        verificarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b3.jpeg"))); // NOI18N
        verificarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarCuentaActionPerformed(evt);
            }
        });
        background.add(verificarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 130, 125));

        texto5.setText("Atender todas las solicitudes");
        background.add(texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, -1));

        crearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.jpg"))); // NOI18N
        crearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaActionPerformed(evt);
            }
        });
        background.add(crearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 130, 125));

        texto6.setText("Crear cuenta");
        background.add(texto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 81, -1));

        crearSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b6.jpeg"))); // NOI18N
        crearSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearSolicitudActionPerformed(evt);
            }
        });
        background.add(crearSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 125));

        texto7.setText("Crear solicitud de retiro");
        background.add(texto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 150, -1));

        texto9.setText("MILLONARIOS");
        background.add(texto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        texto12.setText("CUENTA");
        background.add(texto12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        texto8.setText("Dar de baja a millonarios");
        background.add(texto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 140, -1));

        mostrarMillonarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b8.jpeg"))); // NOI18N
        mostrarMillonarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarMillonariosActionPerformed(evt);
            }
        });
        background.add(mostrarMillonarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 130, 125));

        texto13.setText("DEPÓSITO");
        background.add(texto13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 110, -1));

        texto14.setText("CREAR/ ELIMINAR");
        background.add(texto14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        texto15.setText("CUENTA");
        background.add(texto15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 20));

        texto16.setText("MOSTRAR/VERIFICAR");
        background.add(texto16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        background.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 20, 470));

        panel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        background.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        panel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        background.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        panel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        background.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 30));

        panel5.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        background.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 530, -1));

        texto11.setText("dados de baja");
        background.add(texto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 110, -1));

        texto17.setText("SOLICITUDES DE");
        background.add(texto17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, -1));

        retiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b6.jpeg"))); // NOI18N
        retiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retiroActionPerformed(evt);
            }
        });
        background.add(retiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 130, 125));

        texto10.setText("Crear solicitud de depósito");
        background.add(texto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, -1));

        panel6.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        background.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        panel7.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        background.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 990, 40));

        panel8.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        background.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));

        panel9.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        background.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCuentasActionPerformed
        if(cuentas==null){
            JOptionPane.showMessageDialog(null,"No hay cuentas para mostrar");
        }else{
            String cuentasConc="";
            for (int i=0;i<cuentas.tamanio();i++){
                String nIdentidad = Integer.toString(cuentas.Obtener(i).getN_identidad());
                String saldo = Double.toString(cuentas.Obtener(i).getSaldo_actual());
                cuentasConc +="No. de Identidad: " + nIdentidad + ", Saldo: " + saldo + "\n";
                
            }
            JOptionPane.showMessageDialog(null,"A continuación se muestran las cuentas actualizadas:\n"+ cuentasConc);

        }
    }//GEN-LAST:event_mostrarCuentasActionPerformed

    private void crearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaActionPerformed
      JTextField t1 = new JTextField(5);
      JTextField t2 = new JTextField(5);
      
      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("No. de Identidad:"));
      myPanel.add(t1);
      myPanel.add(Box.createHorizontalStrut(15)); // espaciador
      myPanel.add(new JLabel("Saldo:"));
      myPanel.add(t2);
      

      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Ingrese los datos de su cuenta: ", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
          String nIdentidad = t1.getText();
      String saldo = t2.getText();
          posicion++;
          cuentas.Agregar(new Cuenta(Integer.parseInt(nIdentidad),Float.parseFloat(saldo), posicion));
          JOptionPane.showMessageDialog(null,"Cuenta creada con los datos:\n No. de Identidad:  "+ nIdentidad +", Saldo: " + saldo);
      }
        
    }//GEN-LAST:event_crearCuentaActionPerformed

    private void crearSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearSolicitudActionPerformed
      JTextField t1 = new JTextField(5);
      JTextField t2 = new JTextField(5);
      JTextField t3 = new JTextField(15);
      
      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("No. de Identidad:"));
      myPanel.add(t1);
      myPanel.add(Box.createHorizontalStrut(15)); // espaciador
      myPanel.add(new JLabel("Cantidad a depositar:"));
      myPanel.add(t2);
      myPanel.add(new JLabel("Nombre del beneficiario:"));
      myPanel.add(t3);
     

      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Ingrese los datos de la cuenta a depositar: ", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
          String nIdentidad = t1.getText();
          String cant_depositar = t2.getText();
          String nombre = t3.getText();
          
          solicitudes.Agregar(new Solicitud(Integer.parseInt(nIdentidad),Float.parseFloat(cant_depositar), nombre));
          /*if(b.VerificarCuenta()>cuentas.tamanio()){
              
          }*/
          JOptionPane.showMessageDialog(null,"Solicitud creada con los datos:\n No. de Identidad:  "+ nIdentidad +", Cantidad: " + cant_depositar + ", Nombre: "+nombre+"\n La solicitud se encuentra pendiente");
      }
    }//GEN-LAST:event_crearSolicitudActionPerformed

    private void cerrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarCuentaActionPerformed
      JTextField t1 = new JTextField(5);
      
      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("No. de Identidad:"));
      myPanel.add(t1);

      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Cuenta que desea eliminar: ", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
          String nIdentidad = t1.getText();
     
        boolean existe = false;
        for(int i=0;i<cuentas.tamanio();i++){
            if(cuentas.Obtener(i).getN_identidad()==Integer.parseInt(nIdentidad)){
                if(b.VerificarNoCuenta(nIdentidad)>-1) {
                        cuentas.Eliminar(b.VerificarNoCuenta(nIdentidad));
                existe = true;
            }
            }
        }
              
          if(existe){
             JOptionPane.showMessageDialog(null,"La cuenta con el no. de Identidad:  "+ nIdentidad +" fue eliminada");

          }else{
               JOptionPane.showMessageDialog(null,"La cuenta con el no. de Identidad:  "+ nIdentidad +" no existe");
          }
         
      }
    }//GEN-LAST:event_cerrarCuentaActionPerformed

    private void verificarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarCuentaActionPerformed

            if(solicitudes.tamanio()>0){
                int tamanio_ini=cuentas.tamanio();
                b.VerificarCuenta(solicitudes.Obtener(0));
                if(tamanio_ini==cuentas.tamanio()){
                    JOptionPane.showMessageDialog(null,"La cuenta de la primera solicitud ha sido verificada y su información actualizada");
                }
                else{
                    JOptionPane.showMessageDialog(null,"La cuenta de la primera solicitud ha sido verificada, se creó una nueva cuenta");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Actualmente no existen solicitudes, intente crear una nueva solicitud");
            }
            
    }//GEN-LAST:event_verificarCuentaActionPerformed

    private void atenderSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atenderSolicitudesActionPerformed
        b.AtenderTodasLasSolicitudes();
        
        JOptionPane.showMessageDialog(null,"Todas las solicitudes han sido atendidas, para mostrar las cuentas actualizadas de click en el botón 'Mostrar cuentas'");
        
    }//GEN-LAST:event_atenderSolicitudesActionPerformed

    private void millonariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_millonariosActionPerformed
         cuentasMillonarios =b.DarBajaAMillonarios();
        JOptionPane.showMessageDialog(null,"Todos los millonarios fueron dados de baja, para mostrar las cuentas actualizadas de click en el botón 'Mostrar cuentas'");
        
    }//GEN-LAST:event_millonariosActionPerformed

    private void mostrarMillonariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMillonariosActionPerformed
        if(millonarios==null){
            JOptionPane.showMessageDialog(null,"No hay millonarios registrados ");
        }else{
            String cuentasConc="";
            for (int i=0;i<cuentasMillonarios.tamanio();i++){
                String nIdentidad = Integer.toString(cuentasMillonarios.Obtener(i).getN_identidad());
                String saldo = Double.toString(cuentasMillonarios.Obtener(i).getSaldo_actual());
                cuentasConc +="No. de Identidad: " + nIdentidad + ", Saldo: " + saldo + "\n";
                
            }
            JOptionPane.showMessageDialog(null,"A continuación se muestran las cuentas de millonarios:\n"+ cuentasConc);

        }
    }//GEN-LAST:event_mostrarMillonariosActionPerformed

    private void retiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retiroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightFlatIJTheme.setup();
  

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atenderSolicitudes;
    private javax.swing.JPanel background;
    private javax.swing.JButton cerrarCuenta;
    private javax.swing.JButton crearCuenta;
    private javax.swing.JButton crearSolicitud;
    private javax.swing.JLabel inicio;
    private javax.swing.JButton millonarios;
    private javax.swing.JButton mostrarCuentas;
    private javax.swing.JButton mostrarMillonarios;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private java.awt.Panel panel9;
    private javax.swing.JButton retiro;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto10;
    private javax.swing.JLabel texto11;
    private javax.swing.JLabel texto12;
    private javax.swing.JLabel texto13;
    private javax.swing.JLabel texto14;
    private javax.swing.JLabel texto15;
    private javax.swing.JLabel texto16;
    private javax.swing.JLabel texto17;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    private javax.swing.JLabel texto7;
    private javax.swing.JLabel texto8;
    private javax.swing.JLabel texto9;
    private javax.swing.JButton verificarCuenta;
    // End of variables declaration//GEN-END:variables
}
