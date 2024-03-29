/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventana;

import Gestion.GestionCategorias;
import Modelo.Categoria;
import com.google.gson.JsonSyntaxException;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Jose Miguel
 */
public class PanelInsertarCategoria extends javax.swing.JPanel {

    /**
     * Creates new form PanelInsertarProducto
     */
    public PanelInsertarCategoria() {
        initComponents(); 
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTituloNuevoEnvio = new javax.swing.JLabel();
        panelBotonInsertarE = new javax.swing.JPanel();
        botonInsertarEnvio = new javax.swing.JLabel();
        panelDetallesEnvio = new javax.swing.JPanel();
        lIdProducto = new javax.swing.JLabel();
        lIdCategoria = new javax.swing.JLabel();
        lNombreCategoria = new javax.swing.JLabel();
        tfNombreCategoria = new javax.swing.JTextField();
        tfIdCategoria = new javax.swing.JTextField();
        lTipoCategoria = new javax.swing.JLabel();
        tfDescripcionCategoria = new javax.swing.JTextField();
        lDescripcionCategoria = new javax.swing.JLabel();
        rbHombre = new javax.swing.JRadioButton();
        rbMujer = new javax.swing.JRadioButton();
        rbNino = new javax.swing.JRadioButton();
        rbSinespecificar = new javax.swing.JRadioButton();
        panelVerCategorias = new javax.swing.JPanel();
        botonVerCategorias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCategorias = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lTituloNuevoEnvio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lTituloNuevoEnvio.setForeground(new java.awt.Color(60, 89, 221));
        lTituloNuevoEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTituloNuevoEnvio.setText("Categorias");
        add(lTituloNuevoEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 50));

        panelBotonInsertarE.setBackground(new java.awt.Color(255, 255, 255));

        botonInsertarEnvio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonInsertarEnvio.setForeground(new java.awt.Color(60, 89, 221));
        botonInsertarEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonInsertarEnvio.setText("Insertar");
        botonInsertarEnvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInsertarEnvioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBotonInsertarELayout = new javax.swing.GroupLayout(panelBotonInsertarE);
        panelBotonInsertarE.setLayout(panelBotonInsertarELayout);
        panelBotonInsertarELayout.setHorizontalGroup(
            panelBotonInsertarELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonInsertarELayout.createSequentialGroup()
                .addComponent(botonInsertarEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBotonInsertarELayout.setVerticalGroup(
            panelBotonInsertarELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonInsertarELayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonInsertarEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panelBotonInsertarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 130, 40));

        panelDetallesEnvio.setBackground(new java.awt.Color(60, 89, 221));
        panelDetallesEnvio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lIdProducto.setText("Insertar el id de la categoria:");
        panelDetallesEnvio.add(lIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, 40));

        lIdCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lIdCategoria.setText("Insertar una nueva categoria:");
        panelDetallesEnvio.add(lIdCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        lNombreCategoria.setText("Inserta el nombre de la categoria");
        panelDetallesEnvio.add(lNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 250, 40));
        panelDetallesEnvio.add(tfNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 250, 40));
        panelDetallesEnvio.add(tfIdCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, 40));

        lTipoCategoria.setText("Insertar el tipo de categoria:");
        panelDetallesEnvio.add(lTipoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 250, 20));
        panelDetallesEnvio.add(tfDescripcionCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 250, 70));

        lDescripcionCategoria.setText("Insertar pequeña descricpcion de la categoria:");
        panelDetallesEnvio.add(lDescripcionCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 250, 30));

        rbHombre.setText("Hombre");
        panelDetallesEnvio.add(rbHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        rbMujer.setText("Mujer");
        panelDetallesEnvio.add(rbMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        rbNino.setText("Niños");
        panelDetallesEnvio.add(rbNino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        rbSinespecificar.setText("Sin especificar");
        panelDetallesEnvio.add(rbSinespecificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        add(panelDetallesEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 540));

        panelVerCategorias.setBackground(new java.awt.Color(255, 255, 255));
        panelVerCategorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVerCategorias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonVerCategorias.setForeground(new java.awt.Color(60, 89, 221));
        botonVerCategorias.setText("Ver Categorias");
        botonVerCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVerCategoriasMouseClicked(evt);
            }
        });
        panelVerCategorias.add(botonVerCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        add(panelVerCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 130, 40));

        listaCategorias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaCategorias);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 500, 460));
    }// </editor-fold>//GEN-END:initComponents
/**
 * Método para insetar una nueva categoria.
 * @param evt 
 */
    private void botonInsertarEnvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInsertarEnvioMouseClicked
        try {
            boolean categoriaInsertada;
            GestionCategorias gestionarCategorias = new GestionCategorias();
            categoriaInsertada = gestionarCategorias.insertarCategoria(obtenerDatosCategoria());
            System.out.print(obtenerDatosCategoria().toString());
            if(categoriaInsertada){
                JOptionPane.showMessageDialog(this, "CATEGORIA INSERTADA");
            }else{
                JOptionPane.showMessageDialog(this, "NO SE HA PODIDO"
                        + "INSERTAR LA CATEGORIA"
                        + "INTENTALO OTRA VEZ");
            }
        } 
         catch (JsonSyntaxException errorDatos) {
               JOptionPane.showMessageDialog(this, "PROBLEMA CON LOS"
                       + "DATOS INTRODUCIDOS");
        }catch (Exception e) {
               JOptionPane.showMessageDialog(this, "Error:"+ e.getMessage());
        }
    }//GEN-LAST:event_botonInsertarEnvioMouseClicked
/**
 * Método para ver las categoriaa que hay en  la base de datos.
 * @param evt 
 */
    private void botonVerCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerCategoriasMouseClicked
        GestionCategorias gestionarCategoria = new GestionCategorias();
        List<Categoria> listaCategoria = gestionarCategoria.consultarCategorias();
        DefaultListModel modeloLista = new DefaultListModel();
        for(Categoria categoria:listaCategoria){
            modeloLista.addElement(categoria);
        }
        listaCategorias.setModel(modeloLista);
    }//GEN-LAST:event_botonVerCategoriasMouseClicked
/**
 * Método para obtener los datso de unc categoría.
 * @return Devuelve un objeto de la clase Categoria.
 */
    private Categoria obtenerDatosCategoria(){
        Categoria nuevaCategoria = null;
        String idCategoria = tfIdCategoria.getText();
        String nombreCategoria = tfNombreCategoria.getText();
        String descripcionCategoria = tfDescripcionCategoria.getText();
        String tipoCategoria = obtenerTipoCategoria();
        nuevaCategoria = new Categoria(idCategoria,nombreCategoria
                ,descripcionCategoria,tipoCategoria);
        return nuevaCategoria;
    }
    /**
     * Método par obtener el tipo de una categoría.
     * @return Devuelve unc cadena con el tipo de la categoría.
     */
    private String obtenerTipoCategoria(){
        String opcion="";
        if(rbHombre.isSelected()){
            opcion = "hombre";
        }else{
        }if(rbMujer.isSelected()){
            opcion = "mujer";
        }else{
        }if(rbNino.isSelected()){
            opcion = "niños";
        }else{
        }if(rbSinespecificar.isSelected()){
            opcion = "sinespecificar";
        }
        return opcion;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonInsertarEnvio;
    private javax.swing.JLabel botonVerCategorias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lDescripcionCategoria;
    private javax.swing.JLabel lIdCategoria;
    private javax.swing.JLabel lIdProducto;
    private javax.swing.JLabel lNombreCategoria;
    private javax.swing.JLabel lTipoCategoria;
    private javax.swing.JLabel lTituloNuevoEnvio;
    private javax.swing.JList<String> listaCategorias;
    private javax.swing.JPanel panelBotonInsertarE;
    private javax.swing.JPanel panelDetallesEnvio;
    private javax.swing.JPanel panelVerCategorias;
    private javax.swing.JRadioButton rbHombre;
    private javax.swing.JRadioButton rbMujer;
    private javax.swing.JRadioButton rbNino;
    private javax.swing.JRadioButton rbSinespecificar;
    private javax.swing.JTextField tfDescripcionCategoria;
    private javax.swing.JTextField tfIdCategoria;
    private javax.swing.JTextField tfNombreCategoria;
    // End of variables declaration//GEN-END:variables
}
