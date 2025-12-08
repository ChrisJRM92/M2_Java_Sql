create table productos(
    codigo int PRIMARY KEY NOT NULL,
    nombre varchar(50) NOT NULL,
    descripcion varchar(200),
    precio money() NOT NULL,
    stock int NOT NULL
;

create table ventas(
    id_venta int PRIMARY KEY NOT NULL,
    codigo_producto int NOT NULL,
    fecha_venta date NOT NULL,
    cantidad int NOT NULL
    FOREIGN KEY codigo_producto REFERENCES productos(codigo),
);