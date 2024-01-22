/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventana;
import Gestion.GestionEnvios;
import Gestion.GestionTablas;
import Modelo.Envio;
import static Ventana.VentanaPrincipal.panelTareas;
import java.awt.BorderLayout;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jose Miguel
 */
public class PanelEnvios extends javax.swing.JPanel {
    PanelInsertarEnvio panelIEnvios = new PanelInsertarEnvio();
    /**
     * Creates new form PanelPedidos
     */
    public PanelEnvios() {
        initComponents();
        GestionTablas tablas = new GestionTablas();
        GestionEnvios totalEnvios = new GestionEnvios();
        List <Envio>listaTotalEnvios  = totalEnvios.consultarEnvios(panelIEnvios.obtenerCorreoAdministrador());
        tablaEnvios.setModel(tablas.crearTablaEnvios(listaTotalEnvios));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTablaEnvios = new javax.swing.JScrollPane();
        tablaEnvios = new javax.swing.JTable();
        lTituloEnvio = new javax.swing.JLabel();
        panelbotonInsertarE = new javax.swing.JPanel();
        botonInsertarEnvio = new javax.swing.JLabel();
        lSubtituloEnvio = new javax.swing.JLabel();
        tfBuscarEnvio = new javax.swing.JTextField();
        panelBuscarEnvio = new javax.swing.JPanel();
        botonBuscarEnvio = new javax.swing.JLabel();
        lEnviarEnvio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaEnvios.setModel(new javax.swing.table.DefaultTableModel(
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
        spTablaEnvios.setViewportView(tablaEnvios);

        add(spTablaEnvios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 860, 310));

        lTituloEnvio.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lTituloEnvio.setForeground(new java.awt.Color(60, 89, 221));
        lTituloEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTituloEnvio.setText("Envios");
        add(lTituloEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        panelbotonInsertarE.setBackground(new java.awt.Color(255, 255, 255));
        panelbotonInsertarE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonInsertarEnvio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonInsertarEnvio.setForeground(new java.awt.Color(60, 89, 221));
        botonInsertarEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonInsertarEnvio.setText("Insertar Envio");
        botonInsertarEnvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInsertarEnvioMouseClicked(evt);
            }
        });
        panelbotonInsertarE.add(botonInsertarEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        add(panelbotonInsertarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 110, 40));

        lSubtituloEnvio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lSubtituloEnvio.setForeground(new java.awt.Color(153, 153, 153));
        lSubtituloEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSubtituloEnvio.setText("Lleva un control de todos los envios que preparas.");
        add(lSubtituloEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 840, 40));
        add(tfBuscarEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 740, 30));

        panelBuscarEnvio.setBackground(new java.awt.Color(255, 255, 255));
        panelBuscarEnvio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBuscarEnvio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonBuscarEnvio.setForeground(new java.awt.Color(60, 89, 221));
        botonBuscarEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonBuscarEnvio.setText("Buscar");
        botonBuscarEnvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarEnvioMouseClicked(evt);
            }
        });
        panelBuscarEnvio.add(botonBuscarEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        add(panelBuscarEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 80, 30));

        lEnviarEnvio.setText("Para enviar un envio realiza primero la factura en el apartado 'Facturas'");
        add(lEnviarEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 640, 30));
    }// </editor-fold>//GEN-END:initComponents
/**
 * Método para insertar un nuevo envio.
 * @param evt 
 */
    private void botonInsertarEnvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInsertarEnvioMouseClicked
        PanelInsertarEnvio panelInsertarEnvio = new PanelInsertarEnvio();
        panelInsertarEnvio.setSize(860, 600);
        panelInsertarEnvio.setLocation(0, 0);
        panelTareas.removeAll();
        panelTareas.add(panelInsertarEnvio,BorderLayout.CENTER);
        panelTareas.revalidate();
        panelTareas.repaint();                           
    }//GEN-LAST:event_botonInsertarEnvioMouseClicked
/**
 * Método para buscar un envio en la tabla.
 * @param evt 
 */
    private void botonBuscarEnvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarEnvioMouseClicked
           GestionEnvios gestionBuscado = new GestionEnvios();
        GestionTablas gestionTabla = new GestionTablas();
        List<Envio>listaEncontrados = new ArrayList<Envio>();
        try {
            listaEncontrados = gestionBuscado.buscarEnvio(tfBuscarEnvio.getText()
            ,panelIEnvios.obtenerCorreoAdministrador());
            System.out.print(panelIEnvios.obtenerCorreoAdministrador());
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaEnvios.setModel(gestionTabla.crearTablaEnvios(listaEncontrados));
    }//GEN-LAST:event_botonBuscarEnvioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonBuscarEnvio;
    private javax.swing.JLabel botonInsertarEnvio;
    private javax.swing.JLabel lEnviarEnvio;
    private javax.swing.JLabel lSubtituloEnvio;
    private javax.swing.JLabel lTituloEnvio;
    private javax.swing.JPanel panelBuscarEnvio;
    private javax.swing.JPanel panelbotonInsertarE;
    private javax.swing.JScrollPane spTablaEnvios;
    private javax.swing.JTable tablaEnvios;
    private javax.swing.JTextField tfBuscarEnvio;
    // End of variables declaration//GEN-END:variables
}