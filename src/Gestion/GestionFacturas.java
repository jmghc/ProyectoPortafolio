/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import Modelo.DetallesEnvio;
import Modelo.Envio;
import Modelo.Factura;
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
public class GestionFacturas implements Constantes {
    /**
     * Método para ver las facturas.
     * @return Devuelve una lista con las facturas.
     */
     public List<Factura> consularFacturas() {
		String url = URL_CONSULTA_ENVIOS;
		String resultado = HttpRequest.GET_REQUESTVALUES(url);
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Factura>>() {
		}.getType();
		List<Factura> tipoLista = new Gson().fromJson(resultado, listType);
		return tipoLista;
	}

	public boolean consultaManipulacion(String url, String values){
		Respuesta respuesta;
		String resultado = HttpRequest.POST_REQUEST(url, values);
		Gson gson = new Gson();
		respuesta = (Respuesta) gson.fromJson(resultado, Respuesta.class);
		return respuesta.getCode().compareTo(CR_OK) == 0;
	}
        /**
         * Métoodo para insertar una factura.
         * @param nuevaFactura Objetro de la clase Factura que se tiene que inertar.
         * @return Devuelve verdadero si se insertar la factura.
         * @throws Exception Salta un error si se dejan los campos es blanco.
         */
       public boolean insertarFactura(Factura nuevaFactura) throws Exception{
		String url = URL_INSERTAR_FACTURA;
                System.out.print(nuevaFactura.toString());
		String values = "idFactura="+ nuevaFactura.getIdFactura()
                        +"&titularFactura=" + nuevaFactura.getTitularFactura()
                        +"&totalPagado="+ nuevaFactura.getTotalPagado()
                        +"&descuento=" + nuevaFactura.getDescuento()
                        +"&idEnvio=" + nuevaFactura.getIdEnvio();
                if(nuevaFactura.getIdFactura().isEmpty()
                        || nuevaFactura.getTitularFactura().isEmpty()
                        || nuevaFactura.getIdEnvio().isEmpty()){
                    throw new Exception("No puede estar vacio o cero");
                }
		return consultaManipulacion(url, values);
	}
}
