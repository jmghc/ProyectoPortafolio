/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import static Gestion.Constantes.URL_INSERTAR_ADMINISTRADOR;
import Modelo.Administrador;
import Modelo.Respuesta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Miguel
 */
public class GestionAdministrador implements Constantes{
    /**
     * 
     * @param correo correo del administrador que se quiere logear.
     * @param contrasena contraseña del administrador que se queire logear.
     * @return devuelve true si hay elementos en la lista de admiistradores.
     */
    public boolean logear(String correo,String contrasena) {
		String url = URL_CONSULTA_ADMINISTRADOR;
		String resultado = HttpRequest.GET_REQUEST(url,"correo="+correo+"&contrasena="+contrasena);
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Administrador>>() {
		}.getType();
		List<Administrador> tipoLista = new Gson().fromJson(resultado, listType);
		return tipoLista.size() > 0;
	}
    /**
     * Método que devuelve el administador que está conectado a la aplicaion comprobandolo en la base de datos.
     * @return devuelve el administrador que esta conectado a la base de datos.
     */
        public List<Administrador> obtenerAdministradorConectado() {
		String url = URL_CONSULTA_ADMINISTRADOR_CONECTADO;
		String resultado = HttpRequest.GET_REQUESTVALUES(url);
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Administrador>>() {
		}.getType();
		List<Administrador> administradorConectado = new Gson().fromJson(resultado, listType);
		return administradorConectado;
	}
        /**
         * 
         * @param url la url del php
         * @param values loa valores necesarios para la consulta.
         * @return verdadero si la respuesta coincide con el código.
         */
        public boolean consultaManipulacion(String url, String values) {
		Respuesta respuesta;
		String resultado = HttpRequest.POST_REQUEST(url, values);
		Gson gson = new Gson();
		respuesta = (Respuesta) gson.fromJson(resultado, Respuesta.class);
		return respuesta.getCode().compareTo(CR_OK) == 0;
	}
        /**
         * Méteodo para conectar a un administrador o desconectarlo si se sale de la app.
         * @param admin Administrador que se va a conectar.
         * @return  Devuelve verdadero si el administaador cambia el estado a conectado.
         */
        public boolean modificarAdministradorConectado(Administrador admin) {
		String url = URL_MODIFICAR_ADMINISTRADOR_CONECTADO;
		String values = "correo=" + admin.getCorreo()
                        +"&conectado=" + admin.getConectado();
		return consultaManipulacion(url, values);
	}
        /**
         * 
         * @param a administrador que se va a insertar en la base de datos.
         * @return Devuelve verdadero si se inserta el nuevo administrador.
         */
        public boolean alta(Administrador a ) {
		String url = URL_INSERTAR_ADMINISTRADOR;
		String values = "correo="+a.getCorreo()+"&contrasena="+a.getContrasena()
                         + "&conectado="+ a.getConectado();
		return consultaManipulacion(url, values);
           
	}
}
