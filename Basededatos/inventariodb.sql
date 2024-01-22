-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-01-2024 a las 13:06:40
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventariodb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

CREATE TABLE `administradores` (
  `correo` varchar(255) NOT NULL,
  `contrasena` varchar(255) NOT NULL,
  `conectado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `administradores`
--

INSERT INTO `administradores` (`correo`, `contrasena`, `conectado`) VALUES
('admin@admin.com', '0192023a7bbd73250516f069df18b500', 1),
('admintotal@admin.com', '6e4a283d52cedf963656e287088d3799', 0),
('admintotal@inventarioapp.com', '655fe29872cba51a6c35f9f660b28931', 0),
('jm@admin.com', 'd17c800c35493c7c52467d024ee8f8bf', 0),
('pruebainsertar@admin.com', '1ba982bdaa28671155f71d06f34be874', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `idCategoria` varchar(11) NOT NULL,
  `nombreCategoria` varchar(255) NOT NULL,
  `descripcionCategoria` text DEFAULT NULL,
  `tipoCategoria` enum('hombre','mujer','niños','sinespecificar') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`idCategoria`, `nombreCategoria`, `descripcionCategoria`, `tipoCategoria`) VALUES
('', '', '', ''),
('CategoriaP', 'CategoriaP', 'Prueba para insertar una categoria', 'sinespecificar'),
('CategoriaP2', 'CategoriaP', 'Prueba para insertar una categoria', 'sinespecificar'),
('CatgDis', 'CategoriaDispositivos', 'Categoria para todos los dispositivos', 'sinespecificar'),
('Consolas01', 'Consolas', 'Categoría de las consolas', 'sinespecificar'),
('IDc', 'CategoriasCajas', 'Cajas', 'sinespecificar'),
('ppp', 'ppp', 'ppp', 'sinespecificar'),
('RopaC001', 'Ropa deportiva', 'Ropa deportiva de distintas marcas.', 'sinespecificar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallesenvio`
--

CREATE TABLE `detallesenvio` (
  `idDetalles` varchar(255) NOT NULL,
  `idProducto` varchar(255) NOT NULL,
  `idEnvio` varchar(255) NOT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallesenvio`
--

INSERT INTO `detallesenvio` (`idDetalles`, `idProducto`, `idEnvio`, `cantidad`) VALUES
('D01', 'Top001', 'E02', 2),
('DetallesP', 'Top001', 'EnvioP', 2),
('Envio01Deta', 'Top001', 'Envio01', 1),
('EnvioAuriculares01Detalles', 'Auriculares01', 'EnvioAuriculares01', 1),
('EnvioCamiseta01Detalles', 'Camisetas01', 'EnvioCamiseta01', 2),
('pcDetalles', 'Top001', 'pc', 2),
('PEnvioDetalles', 'Top001', 'PEnvio', 1),
('pruebaDetal', 'Top001', 'prueba', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `envios`
--

CREATE TABLE `envios` (
  `idEnvio` varchar(255) NOT NULL,
  `titularEnvio` varchar(255) NOT NULL,
  `fechaEnvio` date DEFAULT NULL,
  `direccionEnvio` varchar(255) NOT NULL,
  `estadoEnvio` enum('preparado','enviado','cancelado') DEFAULT NULL,
  `correo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `envios`
--

INSERT INTO `envios` (`idEnvio`, `titularEnvio`, `fechaEnvio`, `direccionEnvio`, `estadoEnvio`, `correo`) VALUES
('a', 'a', '2023-12-12', 'a', 'enviado', 'admin@admin.com'),
('b', 'b', '0000-00-00', 'b', 'preparado', 'admin@admin.com'),
('E02', 'pruebaenvio', '2023-03-03', 'calle prueba', 'preparado', 'pruebainsertar@admin.com'),
('Envio01', 'Manolo', '2023-11-16', 'C\\Calle N12', 'enviado', 'admin@admin.com'),
('EnvioAuriculares01', 'Manolo', '2021-11-21', 'Calle Calle N 23', 'preparado', 'admin@admin.com'),
('EnvioCamiseta01', 'Administrador', '0000-00-00', 'Calle Pruebas', 'preparado', 'admintotal@admin.com'),
('EnvioP', 'titularP', '2023-11-11', 'direccionP', 'preparado', 'admin@admin.com'),
('Ep', 'p', '2023-10-02', 'p', 'enviado', 'pruebainsertar@admin.com'),
('l', 'l', '0000-00-00', 'l', 'preparado', 'admin@admin.com'),
('pc', 'pc', '2021-11-19', 'pc', 'preparado', 'admin@admin.com'),
('PEnvio', 'PTitular', '2024-01-14', 'ppp', 'enviado', 'admintotal@admin.com'),
('prueba', 'prueba', '2021-12-12', 'prueba', 'preparado', 'admin@admin.com'),
('q', 'q', '2023-11-11', 'q', 'preparado', 'admin@admin.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `idFactura` varchar(11) NOT NULL,
  `titularFactura` varchar(255) NOT NULL,
  `totalPagado` double NOT NULL,
  `descuento` double DEFAULT NULL,
  `idEnvio` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`idFactura`, `titularFactura`, `totalPagado`, `descuento`, `idEnvio`) VALUES
('Fac01', 'Manolo', 20, 0, 'Envio01'),
('Fac02', 'Manolo', 20, 0, 'Envio01'),
('Fac09', 'Manolo', 20, 0, 'Envio01'),
('Fac0a', 'Manolo', 20, 0, 'a'),
('Factura01', 'Manolo Sanchez', 90, 0, 'Envio01'),
('Factura03', 'Jose', 200, 0, 'Envio01'),
('l', 'l', 1, 1, 'Envio01'),
('l2', 'l', 1, 1, 'Envio01'),
('p', 'p', 1, NULL, 'Envio01'),
('p2', 'p', 1, 1, 'Envio01'),
('ppl', 'ppl', 0, 0, 'PEnvio'),
('ppp', 'ppp', 0, 0, 'a');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `idProducto` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `tipo` enum('nuevo','seminuevo','reparado') DEFAULT NULL,
  `disponibilidad` int(20) DEFAULT NULL,
  `idCategoria` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idProducto`, `nombre`, `descripcion`, `precio`, `tipo`, `disponibilidad`, `idCategoria`) VALUES
('', 'p', 'p', 2, 'nuevo', NULL, 'RopaC001'),
('Auriculares01', 'Auriculares sin cables', 'Auriculares para todos los dispositivos', 29.99, 'nuevo', 10, 'CatgDis'),
('Camisetas01', 'Camisetas deportivas', 'Camisetas para hacer deportes', 10, 'nuevo', 18, 'RopaC001'),
('Cplay01', 'ConsolaPlay', 'Consola para jugar a los videojuegos más populares del mercado.', 500, 'nuevo', 5, 'Consolas01'),
('IDp', 'Cajas', 'Cajas para envios', 5, 'reparado', 100, 'IDc'),
('PD002', 'Pantalones deportivos', 'Pantalones deportivos comodos para realizar gimnasio', 20, 'nuevo', NULL, 'RopaC001'),
('Top001', 'Top deportivo chica', 'Top para realizar deporte', 20.99, 'nuevo', 4, 'RopaC001');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administradores`
--
ALTER TABLE `administradores`
  ADD PRIMARY KEY (`correo`);

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `detallesenvio`
--
ALTER TABLE `detallesenvio`
  ADD PRIMARY KEY (`idDetalles`),
  ADD KEY `idProducto` (`idProducto`),
  ADD KEY `idEnvio` (`idEnvio`);

--
-- Indices de la tabla `envios`
--
ALTER TABLE `envios`
  ADD PRIMARY KEY (`idEnvio`),
  ADD KEY `correo` (`correo`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`idFactura`),
  ADD KEY `idEnvio` (`idEnvio`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detallesenvio`
--
ALTER TABLE `detallesenvio`
  ADD CONSTRAINT `detallesenvio_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `productos` (`idProducto`),
  ADD CONSTRAINT `detallesenvio_ibfk_2` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvio`);

--
-- Filtros para la tabla `envios`
--
ALTER TABLE `envios`
  ADD CONSTRAINT `envios_ibfk_1` FOREIGN KEY (`correo`) REFERENCES `administradores` (`correo`);

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD CONSTRAINT `facturas_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvio`);

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categorias` (`idCategoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
