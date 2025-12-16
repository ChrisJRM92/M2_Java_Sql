--Primero crear la base de datos para empezar a operar
create database javasql

CREATE TABLE estado_civil(
    codigo char(1) PRIMARY KEY NOT NULL,
    descripcion varchar(20) NOT NULL
);

INSERT INTO estado_civil (codigo, descripcion) VALUES
('U', 'Union libre'),
('S', 'Soltero'),
('C', 'Casado');

CREATE TABLE persona(
    cedula char(10) PRIMARY KEY NOT NULL,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
    estatura decimal(10,2) NOT NULL,
    fecha_nacimiento date NOT NULL,
    hora_nacimiento time,
    cantidad_ahorrada money,
    estado_civil char(1) NOT NULL,
    numero_hijos int,
    FOREIGN KEY (estado_civil) REFERENCES estado_civil(codigo)
);

INSERT INTO persona
(cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, estado_civil, numero_hijos)
VALUES
('0912345678', 'Carlos', 'Mendoza', 1.72, '1990-05-14', '08:30:00', 2500.50, 'S', 0),
('0923456789', 'Ana', 'Torres',   1.60, '1988-11-22', '14:15:00', 5200.00, 'C', 2),
('0934567890', 'Luis', 'Ramirez',  1.78, '1995-03-09', '06:45:00', 1200.75, 'U', 1),
('0945678901', 'Maria', 'Paredes', 1.65, '1992-07-01', '10:10:00', 800.00,  'S', 0),
('0956789012', 'Jorge', 'Villacis', 1.70, '1985-01-30', '23:50:00', 10000.00,'C', 3);



