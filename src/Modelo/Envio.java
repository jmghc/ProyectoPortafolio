/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Jose Miguel
 */
public class Envio {
    String idEnvio;
    String titularEnvio;
    String fechaEnvio;
    String direccionEnvio;
    String estadoEnvio;
    String correo;
/**
 * Constructor de la clase Envio.
 * @param idEnvio
 * @param titularEnvio
 * @param fechaEnvio
 * @param direccionEnvio
 * @param estadoEnvio
 * @param correo 
 */
    public Envio(String idEnvio, String titularEnvio, String fechaEnvio, String direccionEnvio, String estadoEnvio, String correo) {
        this.idEnvio = idEnvio;
        this.titularEnvio = titularEnvio;
        this.fechaEnvio = fechaEnvio;
        this.direccionEnvio = direccionEnvio;
        this.estadoEnvio = estadoEnvio;
        this.correo = correo;
    }

    public String getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    public String getTitularEnvio() {
        return titularEnvio;
    }

    public void setTitularEnvio(String titularEnvio) {
        this.titularEnvio = titularEnvio;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Envio{" + "idEnvio=" + idEnvio + ", titularEnvio=" + titularEnvio + ", fechaEnvio=" + fechaEnvio + ", direccionEnvio=" + direccionEnvio + ", estadoEnvio=" + estadoEnvio + ", correo=" + correo + '}';
    }
    
}
