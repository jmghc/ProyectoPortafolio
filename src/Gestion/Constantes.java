
package Gestion;

/**
 *
 * @author JoseMiguel
 * Interfaz para usar  estas direcciones en otra clase.
 * 
 */
public interface Constantes {
	String SERVIDOR = "http://localhost/PhpSistemaInventario/vista/";
	String URL_CONSULTA_ADMINISTRADOR = SERVIDOR + "consultarAdministrador.php";
        String URL_CONSULTA_ADMINISTRADOR_CONECTADO = SERVIDOR + "consultarAdministradorConectado.php";
        String URL_MODIFICAR_ADMINISTRADOR_CONECTADO = SERVIDOR + "modificarConectados.php";
	String URL_INSERTAR_ADMINISTRADOR = SERVIDOR + "insertarAdministrador.php";
        String URL_CONSULTAR_CLUBS = SERVIDOR + "consultarDatosClub.php";
        String URL_CONSULTA_PRODUCTOS = SERVIDOR + "consultarProducto.php";
        String URL_INSERTAR_PRODUCTO = SERVIDOR + "insertarProducto.php";
        String URL_INSERTAR_ENVIO = SERVIDOR + "insertarEnvio.php";
        String URL_CONSULTA_ENVIOS = SERVIDOR + "consultarEnvios.php";
        String URL_BUSCAR_TITULAR_ENVIO = SERVIDOR + "consultarEnviosTitular.php";
        String URL_INSERTAR_DETALLES_ENVIO = SERVIDOR + "insertarDetallesEnvio.php";
        String URL_BUSCAR_NOMBRE_PRODUCTO = SERVIDOR + "buscarProducto.php";
        String URL_ELIMINAR_PRODUCTO = SERVIDOR + "eliminarProducto.php";
        String URL_MODIFICAR_PRODUCTO = SERVIDOR + "modificarProducto.php";
        String URL_MODIFICAR_CANTIDAD_PRODUCTO =  SERVIDOR + "modificarCantidadProducto.php";
        String URL_CONSULTAR_ID_PRODUCTO =  SERVIDOR + "buscarIdProducto.php";
        String URL_INSERTAR_FACTURA = SERVIDOR + "insertarFactura.php";
        String URL_MODIFICAR_ENVIO = SERVIDOR + "modificarEstadoEnvio.php";
        String URL_CONSULTA_CATEGORIA = SERVIDOR + "consultarCategoria.php";
        String URL_INSERTAR_CATEGORIA = SERVIDOR + "insertarCategoria.php";
        String URL_CONSULTAR_PRODUCTO_ENVIO = SERVIDOR + "consultarProductoEnviado.php";
	String CR_OK = "CR_OK";
	String CR_ERROR = "CR_ERROR";
}
