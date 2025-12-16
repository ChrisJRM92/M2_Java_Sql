--Primero crear la base de datos para empezar a operar
create database javasql

CREATE TABLE estado_civil(
    codigo char(1) PRIMARY KEY NOT NULL,
    descripcion varchar(20) NOT NULL
);

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



