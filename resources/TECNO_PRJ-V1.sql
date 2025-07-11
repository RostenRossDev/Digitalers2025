CREATE TABLE IF NOT EXISTS `FACTURAS` (
	`FACTURA_ID` int AUTO_INCREMENT NOT NULL UNIQUE,
	`LETRA` varchar(1) NOT NULL,
	`NUMERO` int NOT NULL,
	`CLIENTE_ID` int NOT NULL,
	`FECHA` date NOT NULL,
	`MONTO` decimal(1000000000,2) NOT NULL,
	PRIMARY KEY (`FACTURA_ID`)
);

CREATE TABLE IF NOT EXISTS `ARTICULOS` (
	`ARTICULO_ID` int AUTO_INCREMENT NOT NULL UNIQUE,
	`NOMBRE` varchar(50) NOT NULL,
	`PRECIO` decimal((1000000000,2)) NOT NULL,
	`STOCK` int NOT NULL,
	PRIMARY KEY (`ARTICULO_ID`)
);

CREATE TABLE IF NOT EXISTS `DETALLES` (
	`DETALLE_ID` int AUTO_INCREMENT NOT NULL UNIQUE,
	`ARTICULO_ID` int NOT NULL,
	`FACTURA_ID` int NOT NULL,
	`CANTIDAD` int NOT NULL,
	PRIMARY KEY (`DETALLE_ID`)
);

CREATE TABLE IF NOT EXISTS `CLIENTES` (
	`CLIENTE_ID` int AUTO_INCREMENT NOT NULL UNIQUE,
	`NOMBRE` varchar(25) NOT NULL,
	`APELLIDO` varchar(25) NOT NULL,
	`CUIT` varchar(16) NOT NULL,
	`COMENTARIOS` varchar(50) NOT NULL,
	`DIRECCION` varchar(50) NOT NULL,
	PRIMARY KEY (`CLIENTE_ID`)
);

ALTER TABLE `FACTURAS` ADD CONSTRAINT `FACTURAS_fk3` FOREIGN KEY (`CLIENTE_ID`) REFERENCES `CLIENTES`(`CLIENTE_ID`);

ALTER TABLE `DETALLES` ADD CONSTRAINT `DETALLES_fk1` FOREIGN KEY (`ARTICULO_ID`) REFERENCES `ARTICULOS`(`ARTICULO_ID`);

ALTER TABLE `DETALLES` ADD CONSTRAINT `DETALLES_fk2` FOREIGN KEY (`FACTURA_ID`) REFERENCES `FACTURAS`(`FACTURA_ID`);
