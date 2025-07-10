CREATE TABLE IF NOT EXISTS `CLIENT` (
	`dni` int NOT NULL UNIQUE,
	`email` varchar(40) NOT NULL UNIQUE,
	`nombre` varchar(40) NOT NULL,
	`apellido` varchar(40) NOT NULL,
	`password` int NOT NULL DEFAULT '1234',
	PRIMARY KEY (`dni`)
);

CREATE TABLE IF NOT EXISTS `CUENTA` (
	`cbu` int NOT NULL UNIQUE,
	`balance` decimal(10,2) NOT NULL DEFAULT '0.0',
	`type` varchar(3) NOT NULL,
	`client_dni` int NOT NULL,
	PRIMARY KEY (`cbu`)
);


ALTER TABLE `CUENTA` ADD CONSTRAINT `CUENTA_fk3` FOREIGN KEY (`client_dni`) REFERENCES `CLIENT`(`dni`);