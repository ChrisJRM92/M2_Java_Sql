create table productos(
    codigo int PRIMARY KEY NOT NULL,
    nombre varchar(50) NOT NULL,
    descripcion varchar(200),
    precio money NOT NULL,
    stock int NOT NULL
);

create table ventas(
    id_venta int PRIMARY KEY NOT NULL,
    codigo_producto int NOT NULL,
    fecha_venta date NOT NULL,
    cantidad int NOT NULL,
    FOREIGN KEY (codigo_producto) REFERENCES productos(codigo)
);

INSERT INTO productos (codigo, nombre, descripcion, precio, stock) VALUES
(1, 'Martillo', 'Herramienta de golpe', 12.50, 30),
(2, 'Mesa', 'Madera resistente', 45.00, 10),
(3, 'Monitor', NULL, 120.00, 5),
(4, 'Taladro', 'Herramienta eléctrica', 80.00, 8),
(5, 'Cables', 'Cables eléctricos varios', 15.00, 50),
(6, 'Mouse', 'Periférico de computadora', 10.00, 25),
(7, 'Memoria USB', 'Almacenamiento portátil', 8.00, 40),
(8, 'Lampara', 'Luz LED blanca', 14.00, 20),
(9, 'Batería', 'Batería AA recargable', 5.00, 100),
(10, 'Impresora', 'Inyección de tinta', 90.00, 4);



INSERT INTO ventas (id_venta, codigo_producto, fecha_venta, cantidad) VALUES
(1, 1, '2024-01-10', 2),
(2, 2, '2024-01-11', 1),
(3, 3, '2024-01-12', 5),
(4, 4, '2024-01-13', 3),
(5, 5, '2024-01-14', 4),
(6, 6, '2024-01-15', 2),
(7, 7, '2024-01-16', 1),
(8, 8, '2024-01-17', 6),
(9, 9, '2024-01-18', 2),
(10, 10, '2024-01-19', 1);

