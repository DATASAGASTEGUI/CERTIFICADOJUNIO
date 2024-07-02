-- 1. BORRAR BASE DE DATOS SI ESTA EXISTE

DROP DATABASE IF EXISTS PROYECTO25;

-- 2. CREAR BASE DE DATOS

CREATE DATABASE PROYECTO25;

-- 3. USAR BASE DE DATOS

USE PROYECTO25;

-- 4. CREAR TABLA

DROP TABLE IF EXISTS Persona;

CREATE TABLE Persona (
    dni        CHAR(9)      NOT NULL PRIMARY KEY,
    nombre     VARCHAR(50)  NOT NULL,
    apellido   VARCHAR(50)  NOT NULL,
    direccion  VARCHAR(100) NOT NULL,
    telefono   CHAR(8)      NOT NULL,
    nacimiento CHAR(10)     NOT NULL
);
					  
-- 5. MOSTRAR LAS TABLAS DE LA BASE DE DATOS

SHOW TABLES;

-- 6. MOSTRAR LA ESTRUCTURA DE UNA TABLA

DESCRIBE Alumno; 

-- 7. INSERTAR REGISTROS A UNA TABLA

INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345678A', 'Juan', 'Pérez', 'Calle Falsa 123, Ciudad', '12345678', '1990-01-01');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('23456789B', 'María', 'López', 'Avenida Siempre Viva 456, Ciudad', '23456789', '1985-02-15');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('34567890C', 'Carlos', 'García', 'Plaza Mayor 789, Ciudad', '34567890', '1975-03-22');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('45678901D', 'Ana', 'Martínez', 'Boulevard de la Luna 101, Ciudad', '45678901', '1980-04-30');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('56789012E', 'Luis', 'Hernández', 'Calle del Sol 202, Ciudad', '56789012', '1995-05-17');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('67890123F', 'Laura', 'González', 'Avenida del Mar 303, Ciudad', '67890123', '1988-06-23');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('78901234G', 'David', 'Rodríguez', 'Calle del Río 404, Ciudad', '78901234', '1992-07-30');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('89012345H', 'Isabel', 'Fernández', 'Calle de la Esperanza 505, Ciudad', '89012345', '1983-08-14');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('90123456I', 'Miguel', 'Sánchez', 'Plaza de la Libertad 606, Ciudad', '90123456', '1991-09-21');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('01234567J', 'Sara', 'Ramírez', 'Calle de los Naranjos 707, Ciudad', '01234567', '1986-10-02');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345670K', 'Jorge', 'Torres', 'Avenida del Castillo 808, Ciudad', '12345670', '1989-11-11');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('23456781L', 'Lucía', 'Flores', 'Calle del Parque 909, Ciudad', '23456781', '1993-12-05');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('34567892M', 'Raúl', 'Rivera', 'Calle de la Alegría 1010, Ciudad', '34567892', '1976-01-19');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('45678903N', 'Elena', 'Cruz', 'Avenida de los Olivos 1111, Ciudad', '45678903', '1984-02-23');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('56789014O', 'Alberto', 'Ortega', 'Calle del Carmen 1212, Ciudad', '56789014', '1994-03-15');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('67890125P', 'Marta', 'Ramos', 'Calle del Viento 1313, Ciudad', '67890125', '1987-04-18');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('78901236Q', 'Sergio', 'Vargas', 'Calle de la Paz 1414, Ciudad', '78901236', '1990-05-24');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('89012347R', 'Clara', 'Peña', 'Avenida de los Campos 1515, Ciudad', '89012347', '1981-06-30');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('90123458S', 'Antonio', 'Molina', 'Plaza del Sol 1616, Ciudad', '90123458', '1979-07-11');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('01234569T', 'Eva', 'Suárez', 'Calle del Mar 1717, Ciudad', '01234569', '1982-08-05');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345671U', 'Francisco', 'Romero', 'Avenida del Valle 1818, Ciudad', '12345671', '1996-09-20');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('23456782V', 'Patricia', 'Soto', 'Calle de los Santos 1919, Ciudad', '23456782', '1997-10-17');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('34567893W', 'Héctor', 'Campos', 'Calle de la Luna 2020, Ciudad', '34567893', '1977-11-13');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('45678904X', 'Julia', 'Chávez', 'Avenida de la Tierra 2121, Ciudad', '45678904', '1980-12-12');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('56789015Y', 'Óscar', 'Jiménez', 'Calle de la Aurora 2222, Ciudad', '56789015', '1985-01-08');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('67890126Z', 'Rocío', 'Medina', 'Plaza del Rey 2323, Ciudad', '67890126', '1998-02-22');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('78901237A', 'Adrián', 'Arias', 'Calle del Río 2424, Ciudad', '78901237', '1988-03-17');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('89012348B', 'Natalia', 'Palacios', 'Calle de los Ángeles 2525, Ciudad', '89012348', '1999-04-25');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('90123459C', 'Iván', 'Benítez', 'Calle de la Esperanza 2626, Ciudad', '90123459', '1978-05-15');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('01234560D', 'Sandra', 'Reyes', 'Avenida de los Laureles 2727, Ciudad', '01234560', '1990-06-30');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345672E', 'Manuel', 'Giménez', 'Calle de la Primavera 2828, Ciudad', '12345672', '1981-07-11');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('23456783F', 'Laura', 'Navarro', 'Plaza de la Fuente 2929, Ciudad', '23456783', '1992-08-24');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('34567894G', 'Pedro', 'Aguilar', 'Calle del Arco 3030, Ciudad', '34567894', '1979-09-18');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('45678905H', 'Silvia', 'Cortés', 'Avenida del Puerto 3131, Ciudad', '45678905', '1983-10-07');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('56789016I', 'Enrique', 'Guerra', 'Calle de la Victoria 3232, Ciudad', '56789016', '1991-11-22');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('67890127J', 'Ángela', 'Rivas', 'Calle de la Libertad 3333, Ciudad', '67890127', '1987-12-15');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('78901238K', 'Tomás', 'Mendoza', 'Plaza de la Cultura 3434, Ciudad', '78901238', '1986-01-05');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('89012349L', 'Verónica', 'Castro', 'Calle del Arte 3535, Ciudad', '89012349', '1995-02-14');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('90123460M', 'Hugo', 'Vega', 'Avenida del Sol 3636, Ciudad', '90123460', '1984-03-22');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('01234561N', 'Cristina', 'Ramos', 'Calle de la Paz 3737, Ciudad', '01234561', '1989-04-10');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345673O', 'Ricardo', 'Herrera', 'Plaza del Viento 3838, Ciudad', '12345673', '1993-05-27');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('23456784P', 'Alicia', 'Santos', 'Calle de la Alegría 3939, Ciudad', '23456784', '1997-06-12');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('34567895Q', 'Federico', 'Morales', 'Calle de los Ángeles 4040, Ciudad', '34567895', '1994-07-09');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('45678906R', 'Beatriz', 'Román', 'Avenida de los Encina 4141, Ciudad', '45678906', '1988-08-18');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('56789017S', 'Gustavo', 'Alonso', 'Calle de la Estrella 4242, Ciudad', '56789017', '1991-09-21');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('67890128T', 'Carmen', 'Serrano', 'Plaza de la Risa 4343, Ciudad', '67890128', '1982-10-14');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('78901239U', 'Roberto', 'Núñez', 'Calle de los Sueños 4444, Ciudad', '78901239', '1985-11-30');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('89012350V', 'Gloria', 'Lara', 'Calle del Futuro 4545, Ciudad', '89012350', '1996-12-22');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('90123461W', 'Felipe', 'Gómez', 'Avenida de la Esperanza 4646, Ciudad', '90123461', '1980-01-13');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('01234562X', 'Susana', 'Cabrera', 'Calle del Alba 4747, Ciudad', '01234562', '1987-02-09');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345674Y', 'Ramón', 'Prieto', 'Plaza del Cielo 4848, Ciudad', '12345674', '1983-03-11');

-- 8. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Persona;





