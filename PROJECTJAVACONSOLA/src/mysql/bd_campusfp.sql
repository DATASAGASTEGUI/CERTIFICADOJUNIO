-- 1. BORRAR BASE DE DATOS SI ESTA EXISTE

DROP DATABASE IF EXISTS CAMPUSFP1;

-- 2. CREAR BASE DE DATOS

CREATE DATABASE CAMPUSFP1;

-- 3. USAR BASE DE DATOS

USE CAMPUSFP1;

-- 4. CREAR TABLA

DROP TABLE IF EXISTS Alumno;

CREATE TABLE Alumno (
  idAlumno          INT         NOT NULL AUTO_INCREMENT,
  nombre            VARCHAR(25) NOT NULL,
  apellidos         VARCHAR(50) NOT NULL,
  grupo             VARCHAR(50) NOT NULL,
  fechaNacimiento   DATE        NOT NULL,
                    PRIMARY KEY (idAlumno)
);
					  
-- 5. MOSTRAR LAS TABLAS DE LA BASE DE DATOS

SHOW TABLES;

-- 6. MOSTRAR LA ESTRUCTURA DE UNA TABLA

DESCRIBE Alumno; 

-- 7. INSERTAR REGISTROS A UNA TABLA

INSERT INTO Alumno (idAlumno, nombre, apellidos, grupo, fechaNacimiento) VALUES (NULL,'Carlos','Ledezma Perez','dam','2020.01.15');
INSERT INTO Alumno (idAlumno, nombre, apellidos, grupo, fechaNacimiento) VALUES (NULL,'Miguel','Ruíz Párraga','daw','2021.02.13');
INSERT INTO Alumno (idAlumno, nombre, apellidos, grupo, fechaNacimiento) VALUES (NULL,'Luis','Goycochea Ruíz','dam','2019.03.18');
INSERT INTO Alumno (idAlumno, nombre, apellidos, grupo, fechaNacimiento) VALUES (NULL,'Carmen','Roncal Jauregui','daw','2020.04.15');
INSERT INTO Alumno (idAlumno, nombre, apellidos, grupo, fechaNacimiento) VALUES (NULL,'Lucho','Diez Rodriguez','dam','2021.10.31');
INSERT INTO Alumno (idAlumno, nombre, apellidos, grupo, fechaNacimiento) VALUES (NULL,'Lucia','Rodriguez Jauregui','dam','2021.03.25');
INSERT INTO Alumno (idAlumno, nombre, apellidos, grupo, fechaNacimiento) VALUES (NULL,'Vanessa','Perez Cuba','daw','2019.12.17');
INSERT INTO Alumno (idAlumno, nombre, apellidos, grupo, fechaNacimiento) VALUES (NULL,'Arturo','Ledezma Perez','dam','2020.10.16');

-- 8. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Alumno;

DELIMITER $$

CREATE FUNCTION NombreMes(num_mes INT)
RETURNS VARCHAR(15)
DETERMINISTIC
BEGIN
    DECLARE nombre VARCHAR(15);

    SET nombre = CASE
        WHEN num_mes = 1 THEN 'Enero'
        WHEN num_mes = 2 THEN 'Febrero'
        WHEN num_mes = 3 THEN 'Marzo'
        WHEN num_mes = 4 THEN 'Abril'
        WHEN num_mes = 5 THEN 'Mayo'
        WHEN num_mes = 6 THEN 'Junio'
        WHEN num_mes = 7 THEN 'Julio'
        WHEN num_mes = 8 THEN 'Agosto'
        WHEN num_mes = 9 THEN 'Septiembre'
        WHEN num_mes = 10 THEN 'Octubre'
        WHEN num_mes = 11 THEN 'Noviembre'
        WHEN num_mes = 12 THEN 'Diciembre'
        ELSE 'Mes Inválido'
    END;

    RETURN nombre;
END$$

DELIMITER ;


