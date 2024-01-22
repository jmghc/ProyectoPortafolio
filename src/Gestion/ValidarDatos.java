/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Clase para validar los datos según las características.
 * @author José Miguel
 */
public class ValidarDatos {
    /**
     * Método para validar los datos del correo.
     * @param correo Correo del amdinistrador que se va a validar.
     * @return Devuelve verdadero si el correo es valido.
     */
    public boolean validarCorreo(String correo) { 
        
        String patron = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"; return validar(correo, patron); }
    /**
     * Método para validar la contraseña.
     * @param contrasena Contraseña que se va a validar
     * @return Devuelve verdadero si la contraseña es valida.
     */
    public boolean validarContrasena(String contrasena) { 
        
        String patron = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!¡¿?*().])(?=\\S+$).{8,}$"; return validar(contrasena, patron); }
    
/**
 * Método par validar los datos
 * @param cadena Cadena que se va a validar
 * @param patron Patron que tiene que seguir la cadena que se va a validar.
 * @return Devuelve verdadero si la cadena sigue el patron.
 */
public static boolean validar(String cadena, String patron) {
		Pattern p = Pattern.compile(patron);
		Matcher m = p.matcher(cadena);

		if (m.matches()) {
			return true;
		}

		return false;
	}
}
