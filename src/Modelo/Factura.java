/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jose Miugel
 */
public class Factura {
    String idFactura;
    String titularFactura;
    double totalPagado;
    int descuento;
    String idEnvio;
/**
 * Constructor de la clase Factura.
 * @param idFactura
 * @param titularFactura
 * @param totalPagado
 * @param descuento
 * @param idEnvio 
 */
    public Factura(String idFactura, String titularFactura, double totalPagado, int descuento, String idEnvio) {
        this.idFactura = idFactura;
        this.titularFactura = titularFactura;
        this.totalPagado = totalPagado;
        this.descuento = descuento;
        this.idEnvio = idEnvio;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getTitularFactura() {
        return titularFactura;
    }

    public void setTitularFactura(String titularFactura) {
        this.titularFactura = titularFactura;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", titularFactura=" + titularFactura + ", totalPagado=" + totalPagado + ", descuento=" + descuento + ", idEnvio=" + idEnvio + '}';
    }

    

    
}