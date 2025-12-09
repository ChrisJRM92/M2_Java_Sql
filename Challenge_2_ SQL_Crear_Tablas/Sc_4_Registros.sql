create table registros(
    codigo_registro integer PRIMARY KEY NOT NULL,
    cedula_empleado varchar(10) NOT NULL,
    fecha date NOT NULL,
    hora time NOT NULL
);