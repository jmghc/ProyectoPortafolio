/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import Modelo.DetallesEnvio;
import Modelo.Producto;
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
public class GestionProductos implements Constantes {
    /**
     * Método para consultar los productos que hay en el base de datos.
     * @return Devuelve una lista con los porductos que hay en la base de datos.
     */
     public List<Producto> consularProductos() {
		String url = URL_CONSULTA_PRODUCTOS;
		String resultado = HttpRequest.GET_REQUESTVALUES(url);
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Producto>>() {
		}.getType();
		List<Producto> tipoLista = new Gson().fromJson(resultado, listType);
		return tipoLista;
	}
     /**
      * Método consultar si hay productos en un envio.
      * @param idProducto id del del producto que se quiere buscar en los envios.
      * @return Devuelve verdadero si hay productos en los envios.
      */
      public boolean consularProductosEnvios(String idProducto) {
		String url = URL_CONSULTAR_PRODUCTO_ENVIO;
		String resultado = HttpRequest.GET_REQUEST(url,"idProducto="+idProducto);
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<DetallesEnvio>>() {
		}.getType();
		List<DetallesEnvio> tipoLista = new Gson().fromJson(resultado, listType);
		return tipoLista.size()>0;
	}


	public boolean consultaManipulacion(String url, String values){
		Respuesta respuesta;
		String resultado = HttpRequest.POST_REQUEST(url, values);
		Gson gson = new Gson();
		respuesta = (Respuesta) gson.fromJson(resultado, Respuesta.class);
		return respuesta.getCode().compareTo(CR_OK) == 0;
	}
        /**
         * Método para insertar un nuevo producto.
         * @param nuevoProducto Objeto de la clase Producto que se va a insertar.
         * @return Devuelve verdadero si se ha inertardo el producto.
         * @throws Exception Salta una excepcion si los campos estan vacios.
         */
       public boolean insertarProducto(Producto nuevoProducto) throws Exception {
		String url = URL_INSERTAR_PRODUCTO;
		String values = "idProducto="+nuevoProducto.getIdProducto()
                        +"&nombre=" + nuevoProducto.getNombre()
                        +"&descripcion="+ nuevoProducto.getDescripcion()
                        +"&precio=" + nuevoProducto.getPrecio()
                        +"&tipo=" + nuevoProducto.getTipo()
                        +"&disponibilidad=" + nuevoProducto.getDisponibilidad()
                        +"&idCategoria=" + nuevoProducto.getIdCategoria();
                
                if(nuevoProducto.getIdProducto().isEmpty()){
                    throw new Exception("No puede ser vacio");
                }
		return consultaManipulacion(url, values);
                
                
           
	}
       /**
        * Método para buscar un producto según su nombre.
        * @param nombre nombre del producto que se quiere buscar.
        * @return Devuelve una lista con los productos encontrados.
        * @throws UnsupportedEncodingException 
        */
       public List<Producto> buscarProducto(String nombre) throws UnsupportedEncodingException {
		String url = URL_BUSCAR_NOMBRE_PRODUCTO;
                String nombreCodificado = URLEncoder.encode(nombre, "UTF-8");
		String resultado = HttpRequest.GET_REQUEST(url,"nombre=" + nombreCodificado);
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Producto>>() {
		}.getType();
		List<Producto> listaProductos = new Gson().fromJson(resultado, listType);
		return listaProductos;
	}
       /**
        * Método para buscar la cantidad de un producto.
        * @param idProducto id del producto con el que se va a reclizar la busqueda.
        * @return Devuelve una lista con los productos que se han encontrado.
        * @throws UnsupportedEncodingException 
        */
        public List<Producto> buscarCantidad(String idProducto) throws UnsupportedEncodingException {
		String url = URL_CONSULTAR_ID_PRODUCTO;
                String idCodificado = URLEncoder.encode(idProducto, "UTF-8");
		String resultado = HttpRequest.GET_REQUEST(url,"idProducto=" + idCodificado);
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Producto>>() {
		}.getType();
		List<Producto> listaProductos = new Gson().fromJson(resultado, listType);
		return listaProductos;
	}
        /**
         * Método para modificar un producto
         * @param producto Objeto de la clase Producto que se va a modificar.
         * @return Devuelve verdadero si se ha modificado el producto.
         */
       public boolean modificarProducto(Producto producto) {
		String url = URL_MODIFICAR_PRODUCTO;
		String values = "idProducto=" + producto.getIdProducto()
                        +"&nombre=" + producto.getNombre() 
                        +"&descripcion=" + producto.getDescripcion()
                        +"&precio=" + producto.getPrecio()
                        + "&tipo=" + producto.getTipo()
                        +"&disponibilidad=" + producto.getDisponibilidad()
                        + "&idCategoria=" + producto.getIdCategoria();
		return consultaManipulacion(url, values);
	}
       /**
        * Método para modificar la cantidad de un producto.
        * @param idProducto Id del producto que se va modificar la cantidad.
        * @param disponibilidad Cantidad que tiene el producto antes de modificarse.
        * @return Devuelve verdadero si se modifica la cantidad del producto.
        */
       public boolean modificarCantidadProducto(String idProducto, int disponibilidad) {
		String url = URL_MODIFICAR_CANTIDAD_PRODUCTO;
		String values = "idProducto=" + idProducto
                        +"&disponibilidad=" + disponibilidad;
                        
		return consultaManipulacion(url, values);
	}
/**
 * Método para eliminar un producto
 * @param idProducto Id del producto que se va a eliminar.
 * @return Devuelve verdadero si de eliminar el producto.
 */
	public boolean eliminarProducto(String idProducto) {
		String url = URL_ELIMINAR_PRODUCTO;
		return consultaManipulacion(url, "idProducto=" + idProducto);
	} 

}
