CREATE DATABASE repasoDB;

drop table if exist historial_movimientos;
drop table if exist productos;
drop table if exist categorias;

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
insert into categorias(nombre) VALUES
('Bebidas'),
('Snacks'),
('Golosinas');

DELETE FROM categorias WHERE id = 1;

--Productos
insert into productos(nombre, precio_venta, precio_compra, id_categoria) VALUES
('Coca cola 300ml', 0.7, 0.55, 1),
('Coca cola 1000ml', 1, 0.80, 1),
('Doritos 50g', 0.5, 0.42, 2),
('Manicho', 0.25, 0.21, 3),
('Tango', 0.5, 0.42, 3);

--Historial
INSERT INTO historial_movimientos(id_producto, cantidad, fecha_movimiento) VALUES
(1, 10, '2020/10/28 09:45'),
(2, -3, '2020/10/28 10:49'),
(1, 5, '2020/10/28 12:23');

select * from productos;
select * from categorias;
select * from historial_movimientos;