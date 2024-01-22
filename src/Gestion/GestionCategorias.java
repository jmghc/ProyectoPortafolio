/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;


import static Gestion.Constantes.CR_OK;
import static Gestion.Constantes.URL_CONSULTA_CATEGORIA;
import static Gestion.Constantes.URL_INSERTAR_CATEGORIA;
import Modelo.Categoria;
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
public class GestionCategorias {
    /**
     * Métoodo para consultar la categorias que hay en la base de datos.
     * @return Devuelve una lista con las categorias que hay en la base de datos.
     */
    public List<Categoria> consultarCategorias() {
		String url = URL_CONSULTA_CATEGORIA;
		String resultado = HttpRequest.GET_REQUESTVALUES(url);
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Categoria>>() {
		}.getType();
		List<Categoria> listaCategorias = new Gson().fromJson(resultado, listType);
		return listaCategorias;
	}
    /**
     * 
     * @param url
     * @param values
     * @return 
     */
	public boolean consultaManipulacion(String url, String values) {
		Respuesta respuesta;
		String resultado = HttpRequest.POST_REQUEST(url, values);
		Gson gson = new Gson();
		respuesta = (Respuesta) gson.fromJson(resultado, Respuesta.class);
		return respuesta.getCode().compareTo(CR_OK) == 0;
	}
        /**
         * Método para insertar una nueva categoria en la base de datos.
         * @param nuevaCategoria la nueva categoría que se va a insertar.
         * @return Devuelve verdadero si se ha insertardo la nueva categoría.
         */
       public boolean insertarCategoria(Categoria nuevaCategoria) {
		String url = URL_INSERTAR_CATEGORIA;
		String values = "idCategoria=" + nuevaCategoria.getIdCategoria()
                        +"&nombreCategoria=" + nuevaCategoria.getNombreCategoria()
                         + "&descripcionCategoria=" + nuevaCategoria.getDescripcionCategoria()
                        + "&tipoCategoria=" + nuevaCategoria.getTipoCategoria(); 
		return consultaManipulacion(url, values);
	}
    
}
