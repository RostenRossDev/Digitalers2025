-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-07-2025 a las 00:10:18
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda_demo`
--

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`id`, `nombre`, `descripcion`) VALUES
(1, 'Electrónica', 'Dispositivos y gadgets tecnológicos'),
(2, 'Ropa', 'Prendas de vestir para todas las edades'),
(3, 'Hogar', 'Artículos para el hogar y decoración'),
(4, 'Juguetes', 'Juguetes para niños de todas las edades');

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `nombre`, `email`, `direccion`, `ciudad`, `telefono`) VALUES
(1, 'Juan Pérez', '11@mail.com', 'Calle Falsa 123', 'Buenos Aires', '1144556677'),
(2, 'María López', 'maria.lopez@gmail.com11@mail.com', 'Av. Siempreviva 742', 'Rosario', '1144556677'),
(3, 'Carlos García', 'cgarcia@yahoo.com', 'San Martín 500', 'Córdoba', '1144556677'),
(4, 'Ana Torres', 'ana_torres@hotmail.com', 'Rivadavia 999', 'Mendoza', '1122334455'),
(5, 'Pedro Gómez', 'pedro.gomez@live.com', 'Mitre 200', 'La Plata', '1199887766'),
(6, 'Laura Díaz', 'laura.dz@gmail.com', 'Perón 1234', 'Salta', '1177889900'),
(7, 'Luis Martínez', 'lmartinez@mail.com', 'Belgrano 789', 'San Juan', '1166554433'),
(8, 'Cecilia Ramírez', 'ceci.ramirez@gmail.com', 'Pueyrredón 456', 'Tucumán', '1188776655'),
(9, 'Diego Fernández', 'dfernandez@mail.com', 'Alsina 1000', 'Neuquén', '1100112233'),
(10, 'Romina Acosta', 'romina.acosta@yahoo.com', 'Urquiza 333', 'Bahía Blanca', '1133445566'),
(11, 'Valentina Núñez', 'valentina.nunez@gmail.com', 'Las Heras 550', 'Salta', '1165432190'),
(12, 'Federico Ríos', 'frios@hotmail.com', 'Belgrano 234', 'Santa Fe', '1176543210'),
(13, 'Camila Ortiz', 'cortiz@yahoo.com', 'San Juan 123', 'Mendoza', '1143210987'),
(14, 'Santiago Vera', 'svera@mail.com', 'Mitre 456', 'Rosario', '1156785432'),
(15, 'Bruno López', 'bruno.lopez@mail.com', 'Urquiza 789', 'Córdoba', '1187654321'),
(16, 'Jimena Gil', 'jgilmendoza@gmail.com', 'Alvear 321', 'Mendoza', '1132109876'),
(17, 'Mauricio Vega', 'mvega@live.com', 'Roca 654', 'Santa Fe', '1123456789'),
(18, 'Emilia Díaz', 'ediaz@yahoo.com', 'San Martín 987', 'Buenos Aires', '1144556677'),
(19, 'Martín Romero', 'mromero@hotmail.com', 'Belgrano 111', 'Tucumán', '1145678901'),
(20, 'Lucía Santos', 'lsantos@gmail.com', 'Pueyrredón 222', 'Resistencia', '1167890123'),
(21, 'Agustina Herrera', 'aherrera@mail.com', 'Rawson 333', 'Neuquén', '1154321098'),
(22, 'Agustín Caballero', 'acaba@hotmail.com', 'Chacabuco 444', 'Salta', '1189012345'),
(23, 'Isidora Castro', 'icastrovz@gmail.com', 'Mitre 555', 'La Plata', '1178901234'),
(24, 'Felipe Fuentes', 'ffuentes@yahoo.com', 'Alberdi 666', 'Córdoba', '1145671234'),
(25, 'Luciano Morales', 'lmorales@mail.com', 'Corrientes 777', 'Rosario', '1192314567'),
(26, 'Bianca Roldán', 'broldan@hotmail.com', 'Maipú 888', 'Mendoza', '1173456789'),
(27, 'Gonzalo Bravo', 'gbravo@gmail.com', 'San Luis 999', 'Santa Fe', '1134567890'),
(28, 'Brenda Ibarra', 'bibarra@mail.com', 'Bv. Oroño 101', 'Rosario', '1186543210'),
(29, 'Joel Medina', 'jmedina@yahoo.com', 'Alsina 202', 'Buenos Aires', '1144556677'),
(30, 'Antonella Parra', 'aparra@live.com', 'Catamarca 303', 'Salta', '1145678909'),
(31, 'Nicolás Peña', 'npena@hotmail.com', 'España 404', 'Córdoba', '1189123456'),
(32, 'Melisa Cortés', 'mcortes@gmail.com', 'Pellegrini 505', 'Resistencia', '1178905678'),
(33, 'Andrés Rivas', 'arivas@yahoo.com', 'Burns 606', 'Mendoza', '1154320987'),
(34, 'Paula Luna', 'pluna@mail.com', 'Mendoza 707', 'Neuquén', '1198760123'),
(35, 'Esteban Velázquez', 'evelaz@gmail.com', 'Junín 808', 'La Plata', '1145609876'),
(36, 'Bruno Blanco', 'bblanco@hotmail.com', 'Maipú 909', 'Santa Fe', '1167892345'),
(37, 'Mariana Silva', 'msilva@mail.com', 'España 1010', 'Rosario', '1132112345'),
(38, 'Diego Herrera', 'dherrera@gmail.com', 'San Martín 1111', 'Córdoba', '1187650987'),
(39, 'Karina Díaz', 'kdiaz@yahoo.com', 'Rivadavia 1212', 'Mendoza', '1176540987'),
(40, 'Leandro Ortiz', 'lortiz@mail.com', 'Mitre 1313', 'Buenos Aires', '1144556677'),
(41, 'Victoria Aguirre', 'vaguirre@hotmail.com', 'Alsina 1414', 'Salta', '1143217654'),
(42, 'Ramiro Torres', 'rtorres@gmail.com', 'Catamarca 1515', 'Neuquén', '1192345678'),
(43, 'Julieta Palacios', 'jpalacios@mail.com', 'Rawson 1616', 'La Plata', '1178903456'),
(44, 'Nicolás Morales', 'nmorales@hotmail.com', 'Belgrano 1717', 'Rosario', '1132176543'),
(45, 'Manuela Peña', 'mpena@gmail.com', 'Corrientes 1818', 'Mendoza', '1156785432'),
(46, 'Ignacio Castillo', 'icastillo@yahoo.com', 'Junín 1919', 'Santa Fe', '1187654320'),
(47, 'Carla Méndez', 'cmendez@mail.com', 'España 2020', 'Córdoba', '1165432109'),
(48, 'Tomás Gutiérrez', 'tgutier@mail.com', 'Rivadavia 2121', 'Buenos Aires', '1176543219'),
(49, 'Solana Peralta', 'speralta@gmail.com', 'Alberdi 2222', 'Salta', '1143214567'),
(50, 'Facundo Cabrera', 'fcabrera@live.com', 'Burns 2323', 'La Plata', '1198765439'),
(51, 'Emiliano Vega', 'evega@hotmail.com', 'Mitre 2424', 'Neuquén', '1134560123'),
(52, 'Julieta Molina', 'jmolina@yahoo.com', 'Maipú 2525', 'Rosario', '1178901230'),
(53, 'Enzo Paredes', 'eparedes@mail.com', 'Catamarca 2626', 'Córdoba', '1187651234'),
(54, 'Valeria Suárez', 'vsuarez@gmail.com', 'España 2727', 'Mendoza', '1154321234'),
(55, 'Bruno Figueroa', 'bfigueroa@gmail.com', 'San Martín 2828', 'Buenos Aires', '1145671230'),
(56, 'Camila Luna', 'cluna@mail.com', 'Alsina 2929', 'Salta', '1167890129'),
(57, 'Martín Aguilar', 'maguilar@hotmail.com', 'Corrientes 3030', 'La Plata', '1189012340'),
(58, 'Manuela Ramos', 'mramos@yahoo.com', 'Pueyrredón 3131', 'Rosario', '1176543201'),
(59, 'Ignacio Salazar', 'isalazar@mail.com', 'Junín 3232', 'Neuquén', '1145601234'),
(60, 'Catalina Cabrera', 'ccabrera@gmail.com', 'Rivadavia 3333', 'Córdoba', '1167890987');

--
-- Volcado de datos para la tabla `detalles_pedido`
--

INSERT INTO `detalles_pedido` (`id`, `pedido_id`, `producto_id`, `cantidad`, `precio_unitario`) VALUES
(1, 1, 1, 1, 120000.00),
(2, 1, 9, 1, 20000.00),
(3, 2, 2, 1, 280000.00),
(4, 3, 4, 2, 30000.00),
(5, 4, 3, 2, 20000.00),
(6, 5, 10, 1, 25000.00),
(7, 5, 6, 1, 7000.00),
(8, 6, 5, 1, 75000.00),
(9, 7, 2, 1, 280000.00),
(10, 8, 7, 1, 50000.00),
(11, 8, 8, 2, 20000.00),
(12, 9, 4, 1, 35000.00),
(13, 10, 1, 1, 120000.00),
(14, 11, 11, 1, 45000.00),
(15, 12, 12, 2, 15000.00),
(16, 13, 13, 1, 8000.00),
(17, 14, 14, 1, 18000.00),
(18, 15, 15, 1, 32000.00),
(19, 16, 16, 1, 38000.00),
(20, 17, 17, 1, 7000.00),
(21, 18, 18, 2, 22000.00),
(22, 19, 19, 1, 45000.00),
(23, 20, 20, 3, 8000.00),
(24, 21, 21, 1, 14000.00),
(25, 22, 22, 1, 6000.00),
(26, 23, 23, 2, 38000.00),
(27, 24, 24, 1, 12000.00),
(28, 25, 25, 1, 15000.00),
(29, 26, 26, 2, 70000.00),
(30, 27, 27, 1, 9000.00),
(31, 28, 28, 1, 4000.00),
(32, 29, 29, 2, 38000.00),
(33, 30, 30, 1, 12000.00),
(34, 31, 31, 1, 100000.00),
(35, 32, 32, 1, 40000.00),
(36, 33, 33, 1, 15000.00),
(37, 34, 34, 1, 28000.00),
(38, 35, 35, 1, 18000.00),
(39, 36, 36, 1, 30000.00),
(40, 37, 37, 1, 99000.00),
(41, 38, 38, 1, 61000.00),
(42, 39, 39, 1, 155000.00),
(43, 40, 40, 2, 80000.00),
(44, 41, 41, 1, 102000.00),
(45, 42, 42, 1, 57000.00),
(46, 43, 43, 1, 36000.00),
(47, 44, 44, 1, 92000.00),
(48, 45, 45, 1, 68000.00),
(49, 46, 46, 1, 144000.00),
(50, 47, 47, 1, 81000.00),
(51, 48, 48, 1, 53000.00),
(52, 49, 49, 1, 102000.00),
(53, 50, 50, 1, 45000.00);

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `nombre`, `puesto`, `email`, `fecha_contratacion`) VALUES
(1, 'Lucía Castro', 'Vendedor', 'lcastro@tienda.com', '2021-05-15'),
(2, 'Javier Ruiz', 'Encargado', 'jruiz@tienda.com', '2020-08-01'),
(3, 'Paula Méndez', 'Cajera', 'pmendez@tienda.com', '2022-02-10'),
(4, 'Marcos Villar', 'Repartidor', 'mvillar@tienda.com', '2023-04-20'),
(5, 'Sofía Herrera', 'Atención al cliente', 'sherrera@tienda.com', '2021-11-30'),
(6, 'María Sánchez', 'Vendedor', 'msanchez@tienda.com', '2020-07-10'),
(7, 'Jorge Díaz', 'Cajero', 'jdiaz@tienda.com', '2021-09-12'),
(8, 'Mónica Pérez', 'Vendedor', 'mperez@tienda.com', '2022-03-15'),
(9, 'Eduardo Romero', 'Encargado', 'eromero@tienda.com', '2019-11-20'),
(10, 'Florencia Morales', 'Cajera', 'fmorales@tienda.com', '2020-12-05'),
(11, 'Martín Núñez', 'Repartidor', 'mnunez@tienda.com', '2021-01-20'),
(12, 'Claudia Herrera', 'Atención al cliente', 'cherrera@tienda.com', '2022-06-18'),
(13, 'Ricardo Flores', 'Vendedor', 'rflores@tienda.com', '2023-02-11'),
(14, 'Lorena Gómez', 'Cajera', 'lgomez@tienda.com', '2022-08-19'),
(15, 'Rodrigo Castillo', 'Repartidor', 'rcastillo@tienda.com', '2021-04-25'),
(16, 'Patricia Ruiz', 'Encargada', 'pruiz@tienda.com', '2020-10-30'),
(17, 'Gabriel Medina', 'Vendedor', 'gmedina@tienda.com', '2021-05-22'),
(18, 'Daniela Vega', 'Cajera', 'dvega@tienda.com', '2022-09-09'),
(19, 'Fabián Ortiz', 'Repartidor', 'fortiz@tienda.com', '2023-03-03'),
(20, 'Viviana Silva', 'Atención al cliente', 'vsilva@tienda.com', '2020-11-11'),
(21, 'Héctor López', 'Vendedor', 'hlopez@tienda.com', '2021-02-07'),
(22, 'Natalia Torres', 'Cajera', 'ntorres@tienda.com', '2022-07-27'),
(23, 'Pablo Fernández', 'Encargado', 'pfernandez@tienda.com', '2019-10-01'),
(24, 'Silvia Ramírez', 'Repartidor', 'sramirez@tienda.com', '2021-12-12'),
(25, 'Adrián Camacho', 'Vendedor', 'acamacho@tienda.com', '2022-04-14'),
(26, 'Karina Rojas', 'Cajera', 'krojas@tienda.com', '2020-06-08'),
(27, 'Bruno López', 'Encargado', 'bllopez@tienda.com', '2019-09-17'),
(28, 'Laura Castro', 'Vendedora', 'lcastro@tienda.com', '2021-03-05'),
(29, 'Sebastián Ramírez', 'Repartidor', 'sramirez2@tienda.com', '2023-01-29'),
(30, 'María Florencia', 'Atención al cliente', 'mflorencia@tienda.com', '2020-08-23'),
(31, 'Gaston Moreno', 'Vendedor', 'gmoreno@tienda.com', '2021-11-04'),
(32, 'Denise Paredes', 'Cajera', 'dparedes@tienda.com', '2022-05-13'),
(33, 'Ricardo Peña', 'Repartidor', 'rpena@tienda.com', '2023-06-16'),
(34, 'Andrea Molina', 'Encargada', 'amolina@tienda.com', '2019-12-21'),
(35, 'Martín Flores', 'Vendedor', 'mflores2@tienda.com', '2020-09-09'),
(36, 'Vanesa Castro', 'Cajera', 'vcastro@tienda.com', '2021-02-28'),
(37, 'Diego Soto', 'Repartidor', 'dsoto@tienda.com', '2022-11-11'),
(38, 'Jimena Alvarez', 'Atención al cliente', 'jalvarez@tienda.com', '2021-07-07'),
(39, 'Sergio Torres', 'Vendedor', 'storres@tienda.com', '2022-01-15'),
(40, 'Pamela Díaz', 'Cajera', 'pdiaz@tienda.com', '2020-10-10'),
(41, 'Gustavo Rojas', 'Repartidor', 'grojas@tienda.com', '2023-04-04'),
(42, 'Natalia Santos', 'Encargada', 'nsantos@tienda.com', '2019-11-11'),
(43, 'Lisandro Herrera', 'Vendedor', 'lherrera@tienda.com', '2021-06-06'),
(44, 'María Belén', 'Cajera', 'mbelen@tienda.com', '2022-02-02'),
(45, 'Carlos Chávez', 'Repartidor', 'cchavez@tienda.com', '2023-05-05'),
(46, 'Verónica Paz', 'Atención al cliente', 'vpaz@tienda.com', '2020-08-08'),
(47, 'Gabriel Ruiz', 'Vendedor', 'gruiz@tienda.com', '2021-03-03'),
(48, 'Melissa Romero', 'Cajera', 'mromero2@tienda.com', '2022-12-12'),
(49, 'Leonardo Ríos', 'Repartidor', 'lrios@tienda.com', '2019-09-09'),
(50, 'Patricia Flores', 'Encargada', 'pflores@tienda.com', '2020-07-07'),
(51, 'Tomás Pérez', 'Vendedor', 'tperez@tienda.com', '2021-10-10'),
(52, 'Adriana Ortiz', 'Cajera', 'aortiz@tienda.com', '2022-05-05');

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`id`, `cliente_id`, `empleado_id`, `fecha_pedido`, `total`) VALUES
(1, 1, 1, '2024-01-10', 140000.00),
(2, 2, 2, '2024-01-12', 280000.00),
(3, 3, 3, '2024-01-15', 60000.00),
(4, 4, 1, '2024-02-01', 40000.00),
(5, 5, 4, '2024-02-05', 32000.00),
(6, 6, 5, '2024-02-10', 75000.00),
(7, 7, 2, '2024-02-20', 150000.00),
(8, 8, 3, '2024-03-01', 90000.00),
(9, 9, 4, '2024-03-05', 45000.00),
(10, 10, 1, '2024-03-10', 115000.00),
(11, 11, 6, '2024-03-11', 98000.00),
(12, 12, 7, '2024-03-12', 75000.00),
(13, 13, 8, '2024-03-13', 43000.00),
(14, 14, 9, '2024-03-14', 112000.00),
(15, 15, 10, '2024-03-15', 52000.00),
(16, 16, 11, '2024-03-16', 47000.00),
(17, 17, 12, '2024-03-17', 86000.00),
(18, 18, 13, '2024-03-18', 61500.00),
(19, 19, 14, '2024-03-19', 32500.00),
(20, 20, 15, '2024-03-20', 140000.00),
(21, 21, 16, '2024-03-21', 92000.00),
(22, 22, 17, '2024-03-22', 55000.00),
(23, 23, 18, '2024-03-23', 78000.00),
(24, 24, 19, '2024-03-24', 36000.00),
(25, 25, 20, '2024-03-25', 150000.00),
(26, 26, 21, '2024-03-26', 66000.00),
(27, 27, 22, '2024-03-27', 110000.00),
(28, 28, 23, '2024-03-28', 52000.00),
(29, 29, 24, '2024-03-29', 83000.00),
(30, 30, 25, '2024-03-30', 45000.00),
(31, 31, 26, '2024-03-31', 78000.00),
(32, 32, 27, '2024-04-01', 99000.00),
(33, 33, 28, '2024-04-02', 61000.00),
(34, 34, 29, '2024-04-03', 24000.00),
(35, 35, 30, '2024-04-04', 128000.00),
(36, 36, 31, '2024-04-05', 67000.00),
(37, 37, 32, '2024-04-06', 92000.00),
(38, 38, 33, '2024-04-07', 34500.00),
(39, 39, 34, '2024-04-08', 155000.00),
(40, 40, 35, '2024-04-09', 80000.00),
(41, 41, 36, '2024-04-10', 102000.00),
(42, 42, 37, '2024-04-11', 57000.00),
(43, 43, 38, '2024-04-12', 36000.00),
(44, 44, 39, '2024-04-13', 92000.00),
(45, 45, 40, '2024-04-14', 68000.00),
(46, 46, 41, '2024-04-15', 144000.00),
(47, 47, 42, '2024-04-16', 81000.00),
(48, 48, 43, '2024-04-17', 53000.00),
(49, 49, 44, '2024-04-18', 102000.00),
(50, 50, 45, '2024-04-19', 45000.00);

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre`, `descripcion`, `precio`, `stock`, `categoria_id`) VALUES
(1, 'Smartphone Galaxy A14', 'Teléfono inteligente de gama media', 120000.00, 50, 1),
(2, 'Notebook HP 14\"', 'Laptop con 8GB RAM y SSD', 280000.00, 30, 1),
(3, 'Camisa blanca', 'Camisa formal de algodón', 20000.00, 80, 2),
(4, 'Zapatillas deportivas', 'Zapatillas Nike running', 35000.00, 40, 2),
(5, 'Sillón de 2 cuerpos', 'Tapizado en tela gris', 150000.00, 15, 3),
(6, 'Lampara LED', 'Lámpara de escritorio regulable', 18000.00, 60, 3),
(7, 'Lego City', 'Set de construcción Lego', 50000.00, 25, 4),
(8, 'Muñeca Barbie', 'Muñeca Barbie con accesorios', 22000.00, 35, 4),
(9, 'Auriculares Bluetooth', 'Con cancelación de ruido', 32000.00, 70, 1),
(10, 'Pantalón de jean', 'Tiro alto, clásico', 25000.00, 60, 2),
(11, 'Tablet Galaxy S7', 'Tablet Samsung 10\", 64GB', 45000.00, 25, 1),
(12, 'Smartwatch Fit 2', 'Reloj inteligente con pulsómetro', 15000.00, 40, 1),
(13, 'Cargador inalámbrico', 'Carga rápida Qi 15W', 5000.00, 100, 1),
(14, 'Auriculares in-ear', 'Con micrófono y cable', 8000.00, 60, 1),
(15, 'Sweater de lana', 'Suéter unisex tejido', 18000.00, 50, 2),
(16, 'Bufanda invierno', 'Bufanda gruesa y suave', 6000.00, 70, 2),
(17, 'Chaqueta de jean', 'Chaqueta clásica unisex', 32000.00, 30, 2),
(18, 'Vestido floral', 'Vestido casual estampado', 27000.00, 35, 2),
(19, 'Juego de ollas 5 piezas', 'Ollas de acero inoxidable', 45000.00, 20, 3),
(20, 'Set de cuchillos', 'Juego 6 piezas acero', 12000.00, 50, 3),
(21, 'Planta decorativa', 'Planta artificial mediana', 7000.00, 80, 3),
(22, 'Alfombra sala', 'Alfombra moderna 120x180cm', 38000.00, 15, 3),
(23, 'Peluche oso', 'Oso de peluche grande', 12000.00, 60, 4),
(24, 'Juego de mesa', 'Juego de mesa familiar', 22000.00, 25, 4),
(25, 'Puzzle 1000 piezas', 'Puzzle artístico 1000', 18000.00, 40, 4),
(26, 'Monitor 24\"', 'Monitor FullHD 75Hz', 120000.00, 20, 1),
(27, 'Teclado mecánico', 'RGB, switch rojo', 25000.00, 30, 1),
(28, 'Mouse inalámbrico', 'Con bluetooth y DPI', 8000.00, 50, 1),
(29, 'Webcam HD', 'Cámara para videollamadas', 22000.00, 25, 1),
(30, 'Sábana King', 'Juego de sábanas 4 piezas', 14000.00, 40, 2),
(31, 'Almohada viscoelástica', 'Almohada cervical', 9000.00, 50, 2),
(32, 'Juego de toallas', 'Set 3 toallas algodón', 12000.00, 60, 3),
(33, 'Cortina blackout', 'Cortina oscura 140x200cm', 30000.00, 25, 3),
(34, 'Tren de juguete', 'Tren de madera para niños', 15000.00, 30, 4),
(35, 'Dron básico', 'Dron con cámara 2k', 70000.00, 15, 1),
(36, 'Batería externa 10000mAh', 'Carga rápida USB-C', 9000.00, 80, 1),
(37, 'Gorra deportiva', 'Gorra ajustable negra', 4000.00, 70, 2),
(38, 'Zapatillas casual', 'Zapatillas lona unisex', 22000.00, 45, 2),
(39, 'Sofá cama 3 cuerpos', 'Sofá que se convierte en cama', 180000.00, 10, 3),
(40, 'Mesa comedor 4 personas', 'Mesa madera maciza', 95000.00, 8, 3),
(41, 'Cochecito bebé', 'Coche de paseo reclinable', 50000.00, 12, 4),
(42, 'Monopatín eléctrico', 'Skateboard eléctrico', 100000.00, 12, 1),
(43, 'Estantería madera', 'Estante 5 niveles', 40000.00, 20, 3),
(44, 'Kit de pintura', 'Pintura artística acrílica', 12000.00, 50, 4),
(45, 'Set de jardinería', 'Herramientas jardín 5 piezas', 15000.00, 25, 3),
(46, 'Lámpara de pie', 'Lámpara LED de pie', 28000.00, 15, 3),
(47, 'Linterna táctica', 'LED recargable 1000lm', 8000.00, 40, 1),
(48, 'Router WiFi 6', 'Rendimiento gigabit', 18000.00, 22, 1),
(49, 'Campera invierno', 'Campera impermeable', 38000.00, 25, 2),
(50, 'Sillón giratorio', 'Sillón para escritorio', 60000.00, 15, 3),
(51, 'Auriculares deportivos', 'Resistentes al agua', 18000.00, 50, 1),
(52, 'Maceta cerámica', 'Maceta decorativa blanca', 5000.00, 80, 3),
(53, 'Coche teledirigido', 'Carro RC 4x4', 30000.00, 15, 4),
(54, 'Set matemáticas', 'Calculadora científica+', 12000.00, 40, 4);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
