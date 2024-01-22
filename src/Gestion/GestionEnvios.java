/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import Modelo.DetallesEnvio;
import Modelo.Envio;
import Modelo.Respuesta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Miguel
 */
public class GestionEnvios implements Constantes {
    /**
     * Método para consultar los envios que hay en la base de datos.
     * @param correo Correo de los admistradores responsables de ese envio.
     * @return Devuelve una lista con los envios que hay de ese administrador en la base de datos.
     */
        public List<Envio> consultarEnvios(String correo) {
		String url = URL_CONSULTA_ENVIOS;
		String resultado = HttpRequest.GET_REQUEST(url,"correo=" + correo);
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Envio>>() {
		}.getType();
		List<Envio> tipoLista = new Gson().fromJson(resultado, listType);
		return tipoLista;
	}
        /**
         * 
         * @param url
         * @param values
         * @return 
         */
	public boolean consultaManipulacion(String url, String values){
		Respuesta respuesta;
		String resultado = HttpRequest.POST_REQUEST(url, values);
		Gson gson = new Gson();
		respuesta = (Respuesta) gson.fromJson(resultado, Respuesta.class);
		return respuesta.getCode().compareTo(CR_OK) == 0;
	}
        /**
         * Método para insertar un nuevo envío en la base de datos.
         * @param nuevoEnvio El nuevo envio que se va a insertar en la base de datos.
         * @return Devielve verdadero si se insertar el nuevo envio en la base de datos.
         * @throws Exception Salta uns excepcion si los campos estan vacios.
         */
       public boolean insertarEnvio(Envio nuevoEnvio) throws Exception{
		String url = URL_INSERTAR_ENVIO;
		String values = "idEnvio="+ nuevoEnvio.getIdEnvio()
                        +"&titularEnvio=" + nuevoEnvio.getTitularEnvio()
                        +"&fechaEnvio="+ nuevoEnvio.getFechaEnvio()
                        +"&direccionEnvio=" + nuevoEnvio.getDireccionEnvio()
                        +"&estadoEnvio=" + nuevoEnvio.getEstadoEnvio()
                        +"&correo=" + nuevoEnvio.getCorreo();
               
                if(nuevoEnvio.getIdEnvio().isEmpty() 
                        || nuevoEnvio.getTitularEnvio().isEmpty()
                        || nuevoEnvio.getDireccionEnvio().isEmpty()){
                    throw new Exception("No puede estar vacio");
                }
		return consultaManipulacion(url, values); 
	}
       /**
        * Métodos para insertar los detalles de cada envio.
        * @param nuevoDetalles Objeto que de la calse de DetallesEnvio que se va a insertar.
        * @return Devuelve verdadero si se insertar en la base de datos.
        * @throws Exception Salta un error si los campos estan vacios.
        */
        public boolean insertarDetallesEnvio(DetallesEnvio nuevoDetalles) throws Exception{
		String url = URL_INSERTAR_DETALLES_ENVIO;
		String values = "idDetalles="+ nuevoDetalles.getIdDetalles()
                        +"&idProducto=" + nuevoDetalles.getIdProducto()
                        +"&idEnvio="+ nuevoDetalles.getIdEnvio()
                        +"&cantidad=" + nuevoDetalles.getCantidad();
                
                if(nuevoDetalles.getIdDetalles().isEmpty()
                        ||nuevoDetalles.getIdProducto().isEmpty()
                        ||nuevoDetalles.getIdEnvio().isEmpty()){
                    throw new Exception("NO PUEDE ESTAR VACIO");
                    
                }
		return consultaManipulacion(url, values);
	}
        /**
         * Método para buscar un envio según el titular del envío.
         * @param titular Titular del envío que se va a buscar.
         * @param correo Correo del amdinistrador responsable de ese envio
         * @return Devuelve una lista con los envios que cumplan con la condiciones.
         * @throws UnsupportedEncodingException Deuvelve un error si el titular contiene algo no previsto.
         */
         public List<Envio> buscarEnvio(String titular,String correo) throws UnsupportedEncodingException {
		String url = URL_BUSCAR_TITULAR_ENVIO;
                String titularCodificado = URLEncoder.encode(titular, "UTF-8");
		String resultado = HttpRequest.GET_REQUEST(url,"titularEnvio=" 
                        + titularCodificado + "&correo="+ correo);
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Envio>>() {
		}.getType();
		List<Envio> listaEnvios = new Gson().fromJson(resultado, listType);
		return listaEnvios;
	}
         /**
          * Método para modificar un envío.
          * @param idEnvio
          * @param estado
          * @return 
          */
       public boolean modificarEnvio(String idEnvio, String estado) {
		String url = URL_MODIFICAR_ENVIO;
		String values = "idEnvio=" + idEnvio
                        +"&estadoEnvio=" + estado;
                        
		return consultaManipulacion(url, values);
	}
        

}
