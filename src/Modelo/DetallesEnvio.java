/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *Clase de los detalles del envio.
 * @author José Miguel
 */
public class DetallesEnvio {
    String idDetalles;
    String idProducto;
    String idEnvio;
    int cantidad;
/**
 * Constructor de la clase DetallesEnvio.
 * @param idDetalles
 * @param idProducto
 * @param idEnvio
 * @param cantidad 
 */
    public DetallesEnvio(String idDetalles, String idProducto, String idEnvio, int cantidad) {
        this.idDetalles = idDetalles;
        this.idProducto = idProducto;
        this.idEnvio = idEnvio;
        this.cantidad = cantidad;
    }

    public String getIdDetalles() {
        return idDetalles;
    }

    public void setIdDetalles(String idDetalles) {
        this.idDetalles = idDetalles;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetallesEnvio{" + "idDetalles=" + idDetalles + ", idProducto=" + idProducto + ", idEnvio=" + idEnvio + ", cantidad=" + cantidad + '}';
    }
    
    
}
