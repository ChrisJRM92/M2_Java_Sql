CREATE DATABASE repasoDB;

--En postgres el autoincrement es SERIAL.
CREATE TABLE categorias(
    id SERIAL PRIMARY KEY,
    nombre varchar(100) NOT NULL
);

CREATE TABLE productos(
    id SERIAL PRIMARY KEY,
    nombre varchar(100) NOT NULL,
    precio_venta money NOT NULL,
    precio_compra money NOT NULL,
    id_categoria int NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES categorias(id)
);

CREATE TABLE historial_movimientos(
    id SERIAL  PRIMARY KEY,
    id_producto int NOT NULL,
    cantidad int NOT NULL,
    fecha_movimiento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY(id_producto) REFERENCES productos(id)
);

--Insertar la data
--Categorias
insert into categorias(nombre) VALUES('Bebidas');
insert into categorias(nombre) VALUES('Snaks');
insert into categorias(nombre) VALUES('Golosinas');

insert into categorias(nombre) VALUES
('Bebidas'),
('Snacks'),
('Golosinas');

DELETE FROM categorias WHERE id = 1;

--Productos
insert into productos(nombre, precio_venta, precio_compra, id_categoria) VALUES
('Coca cola 300ml', 0.7, 0.55, 4),
('Coca cola 1000ml', 1, 0.80, 4),
('Doritos 50g', 0.5, 0.42, 5),
('Manicho', 0.25, 0.21, 6),
('Tango', 0.5, 0.42, 6);