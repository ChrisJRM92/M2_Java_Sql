CREATE TABLE empleado(
    codigo_empleado INT PRIMARY KEY,
    nombre VARCHAR(25) NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL
);

CREATE TABLE registros_entrada(
    codigo_registro INT PRIMARY KEY,
    cedula_empleado CHAR(10) NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    codigo_empleado INT NOT NULL,
    FOREIGN KEY (codigo_empleado) REFERENCES empleado(codigo_empleado)
);

INSERT INTO empleado (codigo_empleado, nombre, fecha, hora) VALUES
(2201, 'Juan Perez', '2023-01-01', '08:00:00');


INSERT INTO registros_entrada (codigo_registro, cedula_empleado, fecha, hora, codigo_empleado) VALUES
(1, '0102030405', '2023-08-03', '08:15', 2201),
(2, '0102030405', '2023-08-15', '09:22', 2201),
(3, '0102030405', '2023-09-01', '10:03', 2201),
(4, '0102030405', '2023-09-18', '12:44', 2201),
(5, '0102030405', '2023-10-05', '08:57', 2201),
(6, '0102030405', '2023-10-21', '11:36', 2201),
(7, '0102030405', '2023-11-02', '09:49', 2201),
(8, '0102030405', '2023-11-19', '10:28', 2201),
(9, '0102030405', '2023-12-07', '12:11', 2201),
(10, '0102030405', '2023-12-28', '08:42', 2201);
