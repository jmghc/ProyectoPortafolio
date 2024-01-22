/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *Clase de administrador de la aplicacion.
 * @author José Miguel
 */
public class Administrador {
    String correo;
    String contrasena;
    int conectado;
/**
 * Constructor de la clase Administrador.
 * @param correo
 * @param contrasena
 * @param conectado 
 */
    public Administrador(String correo, String contrasena, int conectado) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.conectado = conectado;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getConectado() {
        return conectado;
    }

    public void setConectado(int conectado) {
        this.conectado = conectado;
    }

    @Override
    public String toString() {
        return "Administrador{" + "correo=" + correo + ", contrasena=" + contrasena + ", conectado=" + conectado + '}';
    }


}
