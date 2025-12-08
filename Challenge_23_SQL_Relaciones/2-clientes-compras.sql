create table clientes(
    cedula char(10) PRIMARY KEY NOT NULL,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL
);

create table compras(
    id_compras INT FOREIGN KEY,
    cedula char(10) NOTNULL,
    fecha_compra DATE NOTNULL,
    monto DECIMAL(10.2),
    FOREIGN KEY (cedula) REFERENCES clientes(cedula)
);

