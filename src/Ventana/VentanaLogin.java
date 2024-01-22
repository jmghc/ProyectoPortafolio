/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import Gestion.GestionAdministrador;
import Gestion.ValidarDatos;
import Modelo.Administrador;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Jose Miguel
 */
public class VentanaLogin extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLogin
     */
    public VentanaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setImagenLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        logoApp = new javax.swing.JLabel();
        tituloLogin = new javax.swing.JLabel();
        tituloApp = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        campoContrasena = new javax.swing.JPasswordField();
        panelBotonEntrar = new javax.swing.JPanel();
        botonEntrar = new javax.swing.JLabel();
        panelBotonRegistro = new javax.swing.JPanel();
        botonRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoApp.setBackground(new java.awt.Color(60, 89, 221));
        logoApp.setOpaque(true);
        panelPrincipal.add(logoApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 620, 600));

        tituloLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloLogin.setForeground(new java.awt.Color(60, 89, 221));
        tituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLogin.setText("lOGIN");
        panelPrincipal.add(tituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 310, 20));

        tituloApp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloApp.setForeground(new java.awt.Color(60, 89, 221));
        tituloApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloApp.setText("SISTEMA DE INVENTARIO");
        panelPrincipal.add(tituloApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 180));

        campoCorreo.setText("Introduce tu correo");
        campoCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoCorreoMousePressed(evt);
            }
        });
        panelPrincipal.add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 290, 50));

        campoContrasena.setText("********");
        campoContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoContrasenaMousePressed(evt);
            }
        });
        panelPrincipal.add(campoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 290, 50));

        panelBotonEntrar.setBackground(new java.awt.Color(60, 89, 221));

        botonEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        botonEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonEntrar.setText("Inciar");
        botonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBotonEntrarLayout = new javax.swing.GroupLayout(panelBotonEntrar);
        panelBotonEntrar.setLayout(panelBotonEntrarLayout);
        panelBotonEntrarLayout.setHorizontalGroup(
            panelBotonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelBotonEntrarLayout.setVerticalGroup(
            panelBotonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelBotonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, 50));

        panelBotonRegistro.setBackground(new java.awt.Color(255, 255, 255));

        botonRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(60, 89, 221));
        botonRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonRegistro.setText("Nuevo administrador");
        botonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBotonRegistroLayout = new javax.swing.GroupLayout(panelBotonRegistro);
        panelBotonRegistro.setLayout(panelBotonRegistroLayout);
        panelBotonRegistroLayout.setHorizontalGroup(
            panelBotonRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonRegistroLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonRegistroLayout.setVerticalGroup(
            panelBotonRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPrincipal.add(panelBotonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 180, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Método para enviar los datos del login y permitir al usuario entrar.
 * @param evt 
 */
    private void botonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntrarMouseClicked
        GestionAdministrador usuarioLogeado = new GestionAdministrador();
        VentanaPrincipal ventana_principal = new VentanaPrincipal();
        PanelInsertarEnvio enviarCorreo = new PanelInsertarEnvio();
        if(comprobarDatosLogin(campoCorreo.getText(), String.valueOf(campoContrasena.getPassword()))){
        Administrador adminLogeado = new Administrador(campoCorreo.getText(),
        String.valueOf(campoContrasena.getPassword()),1);
        boolean logeado = usuarioLogeado.logear(campoCorreo.getText(), String.valueOf(campoContrasena.getPassword()));
        boolean modificado = usuarioLogeado.modificarAdministradorConectado(adminLogeado);
        
       if(!camposVacios() && logeado && modificado){
         ventana_principal.setVisible(true);
         dispose();
        }else{
             JOptionPane.showMessageDialog(this,"ERROR: NO SE PUDO INICIAR SESION");
        
        }
        }else{
            JOptionPane.showMessageDialog(this, "DATOS NO VALIDOS");
        }
    }//GEN-LAST:event_botonEntrarMouseClicked
/**
 * Método para cambiar el color al campo de correo si se presiona o se cambia de campo.
 * @param evt 
 */
    private void campoCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCorreoMousePressed
        if(campoCorreo.getText().equals("Introduce tu correo")){
            campoCorreo.setText("");
            campoCorreo.setForeground(Color.black);
        }
        if(String.valueOf(campoContrasena.getPassword()).isEmpty()){
            campoContrasena.setText("********");
            campoContrasena.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoCorreoMousePressed
/**
 * Método para cambiar el color al campo de contraseña si se presiona o se cambia de campo.
 * @param evt 
 */
    private void campoContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoContrasenaMousePressed
       if(String.valueOf(campoContrasena.getPassword()).equals("********")){
           campoContrasena.setText("");
           campoContrasena.setForeground(Color.black);
       }
       if(campoCorreo.getText().isEmpty()){
           campoCorreo.setText("Introduce tu correo");
           campoCorreo.setForeground(Color.gray);
       }
    }//GEN-LAST:event_campoContrasenaMousePressed
/**
 * Método para cambiar el fondo al botón de entrar.
 * @param evt 
 */
    private void botonEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntrarMouseEntered
        panelBotonEntrar.setBackground(Color.gray);
    }//GEN-LAST:event_botonEntrarMouseEntered
/**
 * Método para cambiar el color del boton al salir del botón.
 * @param evt 
 */
    private void botonEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntrarMouseExited
        panelBotonEntrar.setBackground(new Color(60,89,221));
    }//GEN-LAST:event_botonEntrarMouseExited
/**
 * Método para registrarse en la base de datos.
 * @param evt 
 */
    private void botonRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistroMouseClicked
        VentanaRegistro registro = new VentanaRegistro();
        registro.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRegistroMouseClicked

    private boolean camposVacios(){
        boolean vacios = false;
        if(campoCorreo.getText().isEmpty()
                || String.valueOf(campoContrasena.getPassword()).isEmpty()){
            vacios = true;
        }
        return vacios;
    }
    /**
     * Método para comprobar lo datos necesarios en el login.
     * @param correo Correo del administrador.
     * @param contrasena Clave del administrador.
     * @return Devuelve verdadero si los datos son correctos.
     */
    private boolean comprobarDatosLogin(String correo, String contrasena){
        boolean loginCorrecto = false;
        ValidarDatos validar = new ValidarDatos(); 
        if(validar.validarCorreo(correo) &&  validar.validarContrasena(contrasena)){
          loginCorrecto = true;
        }
        return loginCorrecto;
    }
    /**
     * Método para insertar la imagen dentro de un label en la VentanaLogin.
     */
    private void setImagenLabel(){
        Image img= new ImageIcon("src/Imagenes/imagenAlmacen.jpg").getImage();
        ImageIcon imagenLogo=new ImageIcon(img.getScaledInstance(logoApp.getWidth(),logoApp.getHeight() , Image.SCALE_DEFAULT));
        logoApp.setIcon(imagenLogo);
        repaint();
     }
   
   
  
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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonEntrar;
    private javax.swing.JLabel botonRegistro;
    private javax.swing.JPasswordField campoContrasena;
    public javax.swing.JTextField campoCorreo;
    private javax.swing.JLabel logoApp;
    private javax.swing.JPanel panelBotonEntrar;
    private javax.swing.JPanel panelBotonRegistro;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel tituloApp;
    private javax.swing.JLabel tituloLogin;
    // End of variables declaration//GEN-END:variables
}
