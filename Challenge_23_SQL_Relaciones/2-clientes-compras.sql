create table clientes(
    cedula char(10) PRIMARY KEY NOT NULL,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL
);

create table compras(
    id_compras INT PRIMARY KEY,
    cedula char(10) NOT NULL,
    fecha_compra DATE NOT NULL,
    monto decimal(10,2),
    FOREIGN KEY (cedula) REFERENCES clientes(cedula)
);

INSERT INTO clientes (cedula, nombre, apellido) VALUES
('1700123456','Pedro','Cajas'),
('1876543210','Lucia','Martinez'),
('1278903456','Andres','Quintero'),
('1777788888','Monica','Reyes'),
('1976549870','Hector','Garzon'),
('1478523690','Natalia','Brito'),
('1788899900','Felipe','Acosta'),
('1570098765','Veronica','Delgado'),
('1765432199','Mateo','Jaramillo'),
('1670012345','Carla','Velez');

INSERT INTO compras (id_compras, cedula, fecha_compra, monto) VALUES
(1,'1700123456','2024-01-10',150.50),
(2,'1876543210','2024-02-14',320.00),
(3,'1278903456','2024-03-20',89.99),
(4,'1777788888','2024-04-05',540.25),
(5,'1976549870','2024-05-18',72.00),
(6,'1478523690','2024-06-01',199.90),
(7,'1788899900','2024-07-22',123.45),
(8,'1570098765','2024-08-30',310.00),
(9,'1765432199','2024-09-11',450.75),
(10,'1670012345','2024-10-03',999.99);
