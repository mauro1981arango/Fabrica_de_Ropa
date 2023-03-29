-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-03-2023 a las 17:02:00
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fabrica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargos`
--

CREATE TABLE `cargos` (
  `IdOcupacion` int(11) NOT NULL,
  `Ocupacion` varchar(50) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `cargos`
--

INSERT INTO `cargos` (`IdOcupacion`, `Ocupacion`) VALUES
(1, 'Oficios Varios'),
(2, 'Operario(a) Máquina Ojaladora'),
(3, 'Operario(a) Máquina Plana'),
(4, 'Secretario(a)'),
(5, 'Vendedor(a)'),
(6, 'Operaria (o) Máquina Fileteadora'),
(7, 'Conductor(a)'),
(8, 'Operaria(o) Máquina de Corte'),
(9, 'Asistente Administrativo'),
(10, 'Supervisor(a)'),
(11, 'Salud Ocupacional'),
(12, 'Diseñador(a)'),
(13, 'Contador(a)'),
(14, 'Sistemas'),
(15, 'Gerente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria_material`
--

CREATE TABLE `categoria_material` (
  `IdMaterial` int(11) NOT NULL,
  `Tipo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `categoria_material`
--

INSERT INTO `categoria_material` (`IdMaterial`, `Tipo`) VALUES
(1, 'Maquinaria'),
(2, 'Tela para jeans'),
(3, 'Hilos'),
(4, 'Cuero'),
(5, 'Cremalleras'),
(6, 'Herramientas Manuales'),
(7, 'Tela de Algodón'),
(8, 'Tela Poliéster'),
(9, 'Tela de Seda'),
(10, 'Equipos de Cómputo'),
(11, 'Botonería'),
(12, 'Empacado'),
(13, 'Elemento de oficina'),
(14, 'Medio de transporte');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudades`
--

CREATE TABLE `ciudades` (
  `IdCiudad` int(11) NOT NULL,
  `Ciudad` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ciudades`
--

INSERT INTO `ciudades` (`IdCiudad`, `Ciudad`) VALUES
(1, 'Bogotá'),
(2, 'Medellín'),
(3, 'Cali'),
(4, 'Barranquilla'),
(5, 'Cartagena'),
(6, 'Soledad'),
(7, 'Cúcuta'),
(8, 'Ibagué'),
(9, 'Soacha'),
(10, 'Villavicencio'),
(11, 'Bucaramanga'),
(12, 'Santa Marta'),
(13, 'Valledupar'),
(14, 'Bello'),
(15, 'Pereira'),
(16, 'Montería'),
(17, 'Pasto'),
(18, 'Buenaventura'),
(19, 'Manizales'),
(20, 'Neiva'),
(21, 'Palmira'),
(22, 'Riohacha'),
(23, 'Sincelejo'),
(24, 'Popayán'),
(25, 'Itagüí'),
(26, 'Floridablanca'),
(27, 'Envigado'),
(28, 'Tuluá'),
(29, 'San Andrés de Tumaco'),
(30, 'Dosquebradas'),
(31, 'Apartadó'),
(32, 'Tunja'),
(33, 'Girón'),
(34, 'Uribia'),
(35, 'Barrancabermeja'),
(36, 'Florencia'),
(37, 'Turbo'),
(38, 'Maicao'),
(39, 'Piedecuesta'),
(40, 'Yopal');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `IdCliente` int(11) NOT NULL,
  `Nombres` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Telefono` varchar(10) NOT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `IdCiudad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`IdCliente`, `Nombres`, `Apellidos`, `Telefono`, `Direccion`, `IdCiudad`) VALUES
(1, 'John Ariel', 'Madrigal Alvarez', '3187652177', 'Avenida 20 de Julio Nro 54-65', 3),
(3, 'Karina', 'Castro Piedrahita', '3235884497', 'Calle 67 Nro 22-88', 2),
(4, 'Jefferson Andrés', 'Ramitez Betancurt', '3109874122', 'Av 76 Numero 44b-66', 5),
(6, 'Oscar Daniel', 'Aristizabal Aguirre', '2587100', 'Carrera 55 nro45-88', 6),
(7, 'Sandra Milena', 'Sánchez Aguirre', '5413366', 'Barrio los Alpes Nro 77-21', 16),
(8, 'Macos Aurelio', 'Ocampo Hincapié', '2695514', 'Avenida el triángulo 56-99', 37),
(9, 'John Alex', 'Gómez Mejía', '2546655', 'Calle 22', 7),
(10, 'Jaime', 'Moreno', '323589770', 'Calle 67-99', 4),
(11, 'Liliana Patricia', 'García Cardona', '3216549877', 'Carrear 33 99', 38),
(12, 'María Ximena', 'Martinez', '3235648711', 'Av 55 22-54', 8),
(13, 'Javier Ocaris', 'Arenas Marulanda', '2256984', 'Calle 14 Nro 34c - 15', 3),
(14, 'Luis Alfredo', 'Cortés Castro', '3225801479', 'Calle 99 Nro 21 -09', 30),
(15, 'María Fernanda', 'Aristizábal Sandobal', '4105555', 'Calle 4 Nro 34n - 78', 19);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas_bancarias`
--

CREATE TABLE `cuentas_bancarias` (
  `IdCuenta` int(11) NOT NULL,
  `TipoCuenta` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cuentas_bancarias`
--

INSERT INTO `cuentas_bancarias` (`IdCuenta`, `TipoCuenta`) VALUES
(1, ' Débito'),
(2, ' MasterCard'),
(3, 'Ahorros'),
(4, 'Corriente'),
(5, 'Crédito'),
(6, 'Daviplata'),
(7, 'Nequi'),
(8, 'Nomina');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_factura`
--

CREATE TABLE `detalle_factura` (
  `IdDetalle` int(11) NOT NULL,
  `IdFactura` int(11) NOT NULL,
  `IdProducto` int(11) NOT NULL,
  `PrecioVenta` decimal(11,0) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `SubTotal` decimal(11,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalle_factura`
--

INSERT INTO `detalle_factura` (`IdDetalle`, `IdFactura`, `IdProducto`, `PrecioVenta`, `Cantidad`, `SubTotal`) VALUES
(1, 1, 3, '60000', 2, '120000'),
(2, 1, 1, '70000', 1, '70000'),
(3, 1, 2, '55000', 4, '220000'),
(4, 2, 2, '55000', 1, '55000'),
(5, 2, 3, '60000', 3, '180000'),
(6, 3, 1, '70000', 4, '280000'),
(7, 3, 5, '75000', 25, '1875000'),
(8, 3, 4, '120000', 5, '600000'),
(9, 5, 12, '67000', 3, '201000'),
(10, 5, 10, '67000', 1, '67000'),
(11, 5, 6, '60000', 4, '240000'),
(12, 5, 11, '67000', 1, '67000'),
(13, 5, 5, '75000', 2, '150000'),
(14, 6, 2, '55000', 2, '110000'),
(15, 6, 7, '67000', 1, '67000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `IdFactura` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `IdCliente` int(11) NOT NULL,
  `IdUsuario` int(11) NOT NULL,
  `NroFactura` varchar(10) NOT NULL,
  `MontoPago` double NOT NULL,
  `MontoCambio` double NOT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`IdFactura`, `Fecha`, `IdCliente`, `IdUsuario`, `NroFactura`, `MontoPago`, `MontoCambio`, `Total`) VALUES
(1, '2022-04-05', 13, 5, 'CD000001', 450000, 40000, 410000),
(2, '2022-03-05', 7, 5, 'CD0001', 240000, 5000, 235000),
(3, '2022-03-05', 1, 5, 'CD0002', 300000, 20000, 280000),
(5, '2022-04-09', 14, 5, 'CD0003', 750000, 25000, 725000),
(6, '2022-05-24', 7, 5, 'CD0004', 200000, 23000, 177000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupos_sanguineos`
--

CREATE TABLE `grupos_sanguineos` (
  `IdRH` int(11) NOT NULL,
  `TipoSangre` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `grupos_sanguineos`
--

INSERT INTO `grupos_sanguineos` (`IdRH`, `TipoSangre`) VALUES
(1, 'A negativo'),
(2, 'A positivo'),
(3, 'AB negativo'),
(4, 'AB positivo.'),
(5, 'B negativo'),
(6, 'B positivo'),
(7, 'O negativo'),
(8, 'O positivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `IdInventario` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `FechaCompra` date NOT NULL,
  `FechaMantenimiento` date DEFAULT NULL,
  `IdInsumo` int(11) NOT NULL,
  `IdProveedor` int(11) NOT NULL,
  `IdMaterial` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`IdInventario`, `Nombre`, `FechaCompra`, `FechaMantenimiento`, `IdInsumo`, `IdProveedor`, `IdMaterial`) VALUES
(2, 'Hilo de poliéster', '2019-01-04', '2020-03-04', 2, 1, 3),
(6, 'Cremallera para jean', '2021-03-01', '2022-02-17', 2, 3, 5),
(7, 'Botón para camisa de Hombre', '2022-04-15', '2022-04-15', 6, 8, 11),
(8, 'Caja de empacado', '2022-04-15', '2022-04-15', 7, 3, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia_prima`
--

CREATE TABLE `materia_prima` (
  `IdInsumo` int(11) NOT NULL,
  `RefArticulo` varchar(25) NOT NULL,
  `IdMaterial` int(11) NOT NULL,
  `IdProveedor` int(11) NOT NULL,
  `Cantidad` int(15) NOT NULL,
  `Color` varchar(20) NOT NULL,
  `PrecioUnitario` decimal(11,0) NOT NULL,
  `ValorTotal` decimal(11,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `materia_prima`
--

INSERT INTO `materia_prima` (`IdInsumo`, `RefArticulo`, `IdMaterial`, `IdProveedor`, `Cantidad`, `Color`, `PrecioUnitario`, `ValorTotal`) VALUES
(2, 'RT-654SD1', 3, 1, 30, 'Plateado', '3000', '90000'),
(5, 'TE-POR34', 5, 9, 10, 'Negro', '5000', '50000'),
(6, 'ghghx', 11, 8, 20, 'Azul', '30000', '600000'),
(7, 'SATR.7Y', 12, 3, 100, 'Café', '500', '50000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `meses`
--

CREATE TABLE `meses` (
  `IdMes` int(11) NOT NULL,
  `Mes` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `meses`
--

INSERT INTO `meses` (`IdMes`, `Mes`) VALUES
(1, 'Enero'),
(2, 'Febrero'),
(3, 'Marzo'),
(4, 'Abril'),
(5, 'Mayo'),
(6, 'Junio'),
(7, 'Julio'),
(8, 'Agosto'),
(9, 'Septiembre'),
(10, 'Octubre'),
(11, 'Noviembre'),
(12, 'Diciembre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nomina`
--

CREATE TABLE `nomina` (
  `IdPago` int(11) NOT NULL,
  `IdMes` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `IdRhumanos` int(11) NOT NULL,
  `IdSalario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `nomina`
--

INSERT INTO `nomina` (`IdPago`, `IdMes`, `Fecha`, `IdRhumanos`, `IdSalario`) VALUES
(4, 4, '2022-04-11', 4, 8),
(5, 2, '2022-02-28', 5, 12),
(6, 10, '2021-04-30', 3, 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `IdProveedor` int(11) NOT NULL,
  `NitProveedor` varchar(14) NOT NULL,
  `NombreEmpresa` varchar(45) NOT NULL,
  `Direccion` varchar(45) NOT NULL,
  `Correo` varchar(45) NOT NULL,
  `Telefono` varchar(10) NOT NULL,
  `IdCiudad` int(11) NOT NULL,
  `CuentaBancaria` varchar(14) NOT NULL,
  `IdCuenta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`IdProveedor`, `NitProveedor`, `NombreEmpresa`, `Direccion`, `Correo`, `Telefono`, `IdCiudad`, `CuentaBancaria`, `IdCuenta`) VALUES
(1, '890-555-093-1', 'Todo Hilos Importados', 'Calle 4 Nro 3 - 08', 'todohilos@otmail.com', '2114444', 27, '111-58976-123', 3),
(3, '32343211-1', 'Surtitodo', 'Cra 8 Nro 22 -32', 'surtitodo@gmail.com', '2335555', 5, '21-36978-231', 4),
(8, '580-200-444-1', 'Mi surtido', 'Av Caracas Nro 22 -32b', 'surtidos@hotmail.com', '2334444', 17, '222-568791-135', 2),
(9, '890-800-245-1', 'Telas Importadas', 'Calle 34 Nro 44 - 10', 'telasimportadas@gmail.com', '2550505', 7, '111-8036945-22', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recursos_humanos`
--

CREATE TABLE `recursos_humanos` (
  `IdRhumanos` int(11) NOT NULL,
  `Cedula` int(11) NOT NULL,
  `Nombres` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `FechaNacimiento` date DEFAULT NULL,
  `IdRH` int(11) NOT NULL,
  `Telefono` varchar(10) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Correo` varchar(45) NOT NULL,
  `IdSalario` int(11) NOT NULL,
  `IdCuenta` int(11) NOT NULL,
  `NroCuenta` char(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `recursos_humanos`
--

INSERT INTO `recursos_humanos` (`IdRhumanos`, `Cedula`, `Nombres`, `Apellidos`, `FechaNacimiento`, `IdRH`, `Telefono`, `Direccion`, `Correo`, `IdSalario`, `IdCuenta`, `NroCuenta`) VALUES
(2, 1035870690, 'Martha Lucía', 'Rojas Aguilar', '2001-04-26', 8, '2180000', 'Cr 5 Nro 44-76', 'martha@gmail.com', 5, 2, '03125897741'),
(3, 1035890123, 'Luis Guillermo', 'Mendoza Castrillon', '1976-01-01', 4, '3125897741', 'Calle 33 Nro 22-10', 'guillermo@hotmail.com', 15, 3, '03125897741'),
(4, 1050329852, 'Janeth', 'Castillo Perez', '2006-04-30', 1, '2372020', 'Calle Zea Nro 21 - 08', 'janeth@gmail.com', 8, 8, '03125897741'),
(5, 1035251300, 'Miguel Angel', 'Riveera Mendez', '1991-04-27', 2, '3148796521', 'Av 67 Nro 45b - 32', 'migeuel@gmail.com', 12, 2, '213-89762-11'),
(13, 2147483647, 'Luisa Maribel', 'Rivera Salazar', '1989-04-19', 3, '3158201477', 'Carrera 54 Nro 11 -22', 'maribel@gmail.com', 13, 3, '0254-6733-21'),
(14, 70985231, 'Rosa', 'Cortés Salazar', '2006-04-19', 6, '3158201409', 'Carrera 84 Nro 11 -22', 'maribel@hotmail.com', 8, 3, '0254-6733-000'),
(17, 1029835987, 'Joaquin', 'Monsalve Arriaga', '2005-04-28', 4, '3125896574', 'Calle 14 Nro 34 - 45', 'joaquin@gmail.com', 6, 3, '231-98236-112');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `referencias_ropa`
--

CREATE TABLE `referencias_ropa` (
  `IdVestuario` int(11) NOT NULL,
  `Codigo` varchar(25) NOT NULL,
  `Tipo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `referencias_ropa`
--

INSERT INTO `referencias_ropa` (`IdVestuario`, `Codigo`, `Tipo`) VALUES
(1, '38', 'PIJAMA PARA HOMBRE'),
(2, '39', 'PIJAMA PARA HOMBRE'),
(3, '359', 'PACK X 3 CICLISTA PARA NIÑA'),
(4, '980', 'CAMISETA PARA HOMBRE'),
(5, '1062', 'CAMISETA PARA MUJER'),
(6, '3246', 'CAMISA PARA HOMBRE'),
(7, '3274', 'BUZO PARA HOMBRE'),
(8, '4884', 'BLUSA PARA REBEL'),
(9, '5847', 'Jeans para dama'),
(10, '50018', 'JEAN PARA HOMBRE'),
(11, '100638', 'JEAN PARA MUJER'),
(12, '101275', 'PANTALON PARA HOMBRE'),
(13, '102392', 'CHAQUETA PARA HOMBRE'),
(14, '102616', 'CAMISA PARA HOMBRE'),
(15, '105546', 'PIJAMA PARA NIÑA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ropa_terminada`
--

CREATE TABLE `ropa_terminada` (
  `IdProducto` int(11) NOT NULL,
  `Codigo` varchar(30) NOT NULL,
  `Descripcion` varchar(200) NOT NULL,
  `Talla` char(3) NOT NULL,
  `Color` varchar(30) NOT NULL,
  `Stock` int(11) NOT NULL,
  `PrecioElaboracion` decimal(11,0) NOT NULL,
  `PrecioVenta` decimal(11,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ropa_terminada`
--

INSERT INTO `ropa_terminada` (`IdProducto`, `Codigo`, `Descripcion`, `Talla`, `Color`, `Stock`, `PrecioElaboracion`, `PrecioVenta`) VALUES
(1, 'DEB65-TR', 'Jeans elástico', '30', 'Azul ', 120, '45000', '70000'),
(2, 'MNR56-09GD', 'Blusa para dama', '22', 'Fusia', 92, '36000', '55000'),
(3, '3DSW45-KL8', 'Sudadera para Dama', '14', 'Vinotinto', 50, '35000', '60000'),
(4, '23ADE-LO8HY6', 'Chaqueta de cuero para Hombre', 'M', 'Negro', 115, '85000', '120000'),
(5, 'DS-L3MJ-23', 'Jeans para niña', '14', 'Mostaza', 95, '54000', '75000'),
(6, 'ADE-43-GM6', 'Camiseta para hombre termo encogible', 'L', 'Amarillo', 91, '40000', '60000'),
(7, 'SD-3E-MN1', 'Pantalón de Hombre', '28', 'Café', 93, '45000', '67000'),
(8, 'Y09RD', 'Camisa manga larga en algodón para jóven', 'S', 'Azul rey', 150, '55000', '72000'),
(9, 'Y09RJ', 'Camisa manga larga clásica para Hombre', 'XL', 'Pastel', 250, '53000', '70000'),
(10, 'Y09RX', 'Blusa para niña manga larga', '16', 'Naranja', 94, '46000', '67000'),
(11, 'SD-3E-MN1', 'Pantalón de Hombre', '28', 'Café', 93, '45000', '67000'),
(12, 'SD-3M-MN2', 'Pantalón de Mujer', '18', 'Verde amarela', 100, '5000', '7000'),
(13, 'SD-3E-MN3', 'Pantalón de Dama', '14', 'Gris oscuro', 105, '45000', '63000'),
(16, 'CCH6-L', 'Bufanda para dama', '14', 'Azul', 196, '28000', '42000'),
(17, 'HHZ-07U', 'Camiseta para niño', '10', 'Azul celeste', 225, '25000', '38000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salario`
--

CREATE TABLE `salario` (
  `IdSalario` int(11) NOT NULL,
  `ValorSalario` decimal(11,0) NOT NULL,
  `Ocupacion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `salario`
--

INSERT INTO `salario` (`IdSalario`, `ValorSalario`, `Ocupacion`) VALUES
(1, '915000', 'Oficios Varios'),
(2, '1200000', 'Operario(a) Máquina Ojaladora'),
(3, '1250000', 'Operario(a) Máquina Plana'),
(4, '1370000', 'Secretario(a)'),
(5, '1420000', 'Vendedor(a)'),
(6, '1450000', 'Operaria (o) Máquina Fileteadora'),
(7, '1500000', 'Conductor(a)'),
(8, '1690000', 'Operaria(o) Máquina de Corte'),
(9, '1700000', 'Asistente Administrativo'),
(10, '1850000', 'Supervisor(a)'),
(11, '2200000', 'Salud Ocupacional'),
(12, '2500000', 'Diseñador(a)'),
(13, '3000000', 'Contador(a)'),
(14, '3500000', 'Sistemas'),
(15, '4000000', 'Gerente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `IdTipo` int(11) NOT NULL,
  `Nombre` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_usuario`
--

INSERT INTO `tipo_usuario` (`IdTipo`, `Nombre`) VALUES
(1, 'Administrador'),
(2, 'Usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IdUsuario` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Usuario` varchar(40) NOT NULL,
  `Contraseña` varchar(80) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Correo` varchar(40) NOT NULL,
  `IdTipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`IdUsuario`, `Nombre`, `Usuario`, `Contraseña`, `Correo`, `IdTipo`) VALUES
(5, 'Diego Mauricio Arango', 'admin', '1234', 'godie.1781a@gmail.com', 1),
(8, 'Carlos Manuel', 'admin2', '1111', 'carlos@gmail.com', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor_proveedor`
--

CREATE TABLE `vendedor_proveedor` (
  `Id` int(11) NOT NULL,
  `Nombres` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Sexo` tinyint(1) NOT NULL,
  `Telefono` varchar(11) NOT NULL,
  `IdProveedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cargos`
--
ALTER TABLE `cargos`
  ADD PRIMARY KEY (`IdOcupacion`);

--
-- Indices de la tabla `categoria_material`
--
ALTER TABLE `categoria_material`
  ADD PRIMARY KEY (`IdMaterial`);

--
-- Indices de la tabla `ciudades`
--
ALTER TABLE `ciudades`
  ADD PRIMARY KEY (`IdCiudad`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`IdCliente`),
  ADD KEY `Fk_clientes_Id_Ciudad` (`IdCiudad`);

--
-- Indices de la tabla `cuentas_bancarias`
--
ALTER TABLE `cuentas_bancarias`
  ADD PRIMARY KEY (`IdCuenta`);

--
-- Indices de la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
  ADD PRIMARY KEY (`IdDetalle`),
  ADD KEY `Fk_IdFactura` (`IdFactura`),
  ADD KEY `Fk_ropa_terminada` (`IdProducto`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`IdFactura`),
  ADD KEY `Fk_clientes_IdCliente` (`IdCliente`),
  ADD KEY `Fk_usuarios_IdUsuario` (`IdUsuario`);

--
-- Indices de la tabla `grupos_sanguineos`
--
ALTER TABLE `grupos_sanguineos`
  ADD PRIMARY KEY (`IdRH`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`IdInventario`),
  ADD KEY `Fk_IdInsumo` (`IdInsumo`),
  ADD KEY `Fk_proveedor` (`IdProveedor`),
  ADD KEY `Fk_categoria` (`IdMaterial`);

--
-- Indices de la tabla `materia_prima`
--
ALTER TABLE `materia_prima`
  ADD PRIMARY KEY (`IdInsumo`),
  ADD KEY `Fk_material` (`IdMaterial`),
  ADD KEY `Fk_IdProveedor` (`IdProveedor`);

--
-- Indices de la tabla `meses`
--
ALTER TABLE `meses`
  ADD PRIMARY KEY (`IdMes`);

--
-- Indices de la tabla `nomina`
--
ALTER TABLE `nomina`
  ADD PRIMARY KEY (`IdPago`),
  ADD KEY `Fk_IdMes` (`IdMes`),
  ADD KEY `Fk_IdSalario` (`IdSalario`),
  ADD KEY `Fk_recursos_humanos` (`IdRhumanos`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`IdProveedor`),
  ADD KEY `Fk_ciudad` (`IdCiudad`),
  ADD KEY `Fk_cuentas_bancarias` (`IdCuenta`);

--
-- Indices de la tabla `recursos_humanos`
--
ALTER TABLE `recursos_humanos`
  ADD PRIMARY KEY (`IdRhumanos`),
  ADD KEY `Fk_IdRH` (`IdRH`),
  ADD KEY `Fk_salario_IdSalario` (`IdSalario`),
  ADD KEY `Fk_cuentas_bancarias_IdCuenta` (`IdCuenta`);

--
-- Indices de la tabla `referencias_ropa`
--
ALTER TABLE `referencias_ropa`
  ADD PRIMARY KEY (`IdVestuario`);

--
-- Indices de la tabla `ropa_terminada`
--
ALTER TABLE `ropa_terminada`
  ADD PRIMARY KEY (`IdProducto`);

--
-- Indices de la tabla `salario`
--
ALTER TABLE `salario`
  ADD PRIMARY KEY (`IdSalario`);

--
-- Indices de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`IdTipo`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`IdUsuario`),
  ADD KEY `Fk_tipo_usuario_IdTipo` (`IdTipo`);

--
-- Indices de la tabla `vendedor_proveedor`
--
ALTER TABLE `vendedor_proveedor`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cargos`
--
ALTER TABLE `cargos`
  MODIFY `IdOcupacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `categoria_material`
--
ALTER TABLE `categoria_material`
  MODIFY `IdMaterial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `ciudades`
--
ALTER TABLE `ciudades`
  MODIFY `IdCiudad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `IdCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `cuentas_bancarias`
--
ALTER TABLE `cuentas_bancarias`
  MODIFY `IdCuenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
  MODIFY `IdDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `IdFactura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `grupos_sanguineos`
--
ALTER TABLE `grupos_sanguineos`
  MODIFY `IdRH` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `inventario`
--
ALTER TABLE `inventario`
  MODIFY `IdInventario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `materia_prima`
--
ALTER TABLE `materia_prima`
  MODIFY `IdInsumo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `meses`
--
ALTER TABLE `meses`
  MODIFY `IdMes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `nomina`
--
ALTER TABLE `nomina`
  MODIFY `IdPago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `IdProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `recursos_humanos`
--
ALTER TABLE `recursos_humanos`
  MODIFY `IdRhumanos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT de la tabla `referencias_ropa`
--
ALTER TABLE `referencias_ropa`
  MODIFY `IdVestuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `ropa_terminada`
--
ALTER TABLE `ropa_terminada`
  MODIFY `IdProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `salario`
--
ALTER TABLE `salario`
  MODIFY `IdSalario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  MODIFY `IdTipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `IdUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `vendedor_proveedor`
--
ALTER TABLE `vendedor_proveedor`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `Fk_clientes_Id_Ciudad` FOREIGN KEY (`IdCiudad`) REFERENCES `ciudades` (`IdCiudad`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
  ADD CONSTRAINT `Fk_IdFactura` FOREIGN KEY (`IdFactura`) REFERENCES `factura` (`IdFactura`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_ropa_terminada` FOREIGN KEY (`IdProducto`) REFERENCES `ropa_terminada` (`IdProducto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `Fk_clientes_IdCliente` FOREIGN KEY (`IdCliente`) REFERENCES `clientes` (`IdCliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_usuarios_IdUsuario` FOREIGN KEY (`IdUsuario`) REFERENCES `usuarios` (`IdUsuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD CONSTRAINT `Fk_IdInsumo` FOREIGN KEY (`IdInsumo`) REFERENCES `materia_prima` (`IdInsumo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_categoria` FOREIGN KEY (`IdMaterial`) REFERENCES `categoria_material` (`IdMaterial`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_proveedor` FOREIGN KEY (`IdProveedor`) REFERENCES `proveedores` (`IdProveedor`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `materia_prima`
--
ALTER TABLE `materia_prima`
  ADD CONSTRAINT `Fk_IdProveedor` FOREIGN KEY (`IdProveedor`) REFERENCES `proveedores` (`IdProveedor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_material` FOREIGN KEY (`IdMaterial`) REFERENCES `categoria_material` (`IdMaterial`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `nomina`
--
ALTER TABLE `nomina`
  ADD CONSTRAINT `Fk_IdMes` FOREIGN KEY (`IdMes`) REFERENCES `meses` (`IdMes`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_IdSalario` FOREIGN KEY (`IdSalario`) REFERENCES `salario` (`IdSalario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_recursos_humanos` FOREIGN KEY (`IdRhumanos`) REFERENCES `recursos_humanos` (`IdRhumanos`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD CONSTRAINT `Fk_ciudad` FOREIGN KEY (`IdCiudad`) REFERENCES `ciudades` (`IdCiudad`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_cuentas_bancarias` FOREIGN KEY (`IdCuenta`) REFERENCES `cuentas_bancarias` (`IdCuenta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `recursos_humanos`
--
ALTER TABLE `recursos_humanos`
  ADD CONSTRAINT `Fk_IdRH` FOREIGN KEY (`IdRH`) REFERENCES `grupos_sanguineos` (`IdRH`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_cuentas_bancarias_IdCuenta` FOREIGN KEY (`IdCuenta`) REFERENCES `cuentas_bancarias` (`IdCuenta`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Fk_salario_IdSalario` FOREIGN KEY (`IdSalario`) REFERENCES `salario` (`IdSalario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `Fk_tipo_usuario_IdTipo` FOREIGN KEY (`IdTipo`) REFERENCES `tipo_usuario` (`IdTipo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
