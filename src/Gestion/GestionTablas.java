/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import Modelo.Envio;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author José Miguel
 */
public class GestionTablas {
    /**
     * Método para crear una tabla con los productos de la base de datos.
     * @param listaProductos Lista con los productos.
     * @return Devuelve el modelo de la tabla.
     */
    public DefaultTableModel crearTablaProductos(List<Producto>listaProductos){
        DefaultTableModel modelo = new DefaultTableModel();
        ArrayList<Object> columnas= new ArrayList<Object>();
        columnas.add("Id del Producto");
        columnas.add("Nombre");
        columnas.add("Descripcion");
        columnas.add("Precio");
        columnas.add("Tipo");
        columnas.add("Disponibilidad");
        columnas.add("Id de la Categoria");
        for(Object colu: columnas){
        modelo.addColumn(colu);
        
        }
        
        ArrayList<Object[]> filas= new ArrayList<Object[]>();
        Object []datos=null;
        for(Producto productos: listaProductos){
            datos=new Object[]{productos.getIdProducto(),productos.getNombre(),
            productos.getDescripcion(),productos.getPrecio(),productos.getTipo(),
            productos.getDisponibilidad(),productos.getIdCategoria()};
          modelo.addRow(datos);
        }
        return modelo;
    }
    /**
     * Método para crear la tabla de los envios.
     * @param listaEnvios Lista de los envios.
     * @return Devuelve el modelo de la tabla de los envios.
     */
    public DefaultTableModel crearTablaEnvios(List<Envio>listaEnvios){
        DefaultTableModel modelo = new DefaultTableModel();
        
        
        ArrayList<Object> columnas= new ArrayList<Object>();
        columnas.add("Id del Envio");
        columnas.add("Titular");
        columnas.add("Fecha de envio");
        columnas.add("Direccion de envio");
        columnas.add("Estado del envio");
        columnas.add("Correo asociado");
        for(Object colu: columnas){
        modelo.addColumn(colu);
        
        }
        
        ArrayList<Object[]> filas= new ArrayList<Object[]>();
        Object []datos=null;
        for(Envio envio: listaEnvios){
            datos=new Object[]{envio.getIdEnvio(),envio.getTitularEnvio()
                    ,envio.getFechaEnvio(),envio.getDireccionEnvio()
                    ,envio.getEstadoEnvio(),envio.getCorreo()};
          modelo.addRow(datos);
        }
        return modelo;
    }
}
