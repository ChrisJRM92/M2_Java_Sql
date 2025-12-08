create table usuarios(
    cedula varchar(5) PRIMARY KEY NOT NULL,
    nombre varchar(25) NOT NULL,
    apellido varchar(25) NOT NULL,
    tipo_cuenta varchar(20),
    limite_credito decimal(10,5)
);

create table cuentas(
    numero_cuenta char(5) PRIMARY KEY,
    cedula_propietario char(5) NOT NULL,
    fecha_creacion DATE NOT NULL,
    saldo MONEY NOT NULL,
    FOREIGN KEY (cedula_propietario) REFERENCES usuarios(cedula)
);


INSERT INTO usuarios (cedula, nombre, apellido, tipo_cuenta, limite_credito) VALUES
('10001','Pedro','Cajas','CORRIENTE',2500.00000),
('10002','Lucia','Martinez','AHORROS',1800.50000),
('10003','Andres','Quintero','CORRIENTE',9000.00000),
('10004','Daniela','Reyes','AHORROS',750.00000),
('10005','Hector','Garzon','CORRIENTE',5200.25000),
('10006','Natalia','Brito','AHORROS',1300.00000),
('10007','Felipe','Acosta','CORRIENTE',4100.75000),
('10008','Veronica','Delgado','AHORROS',600.00000),
('10009','Mateo','Jaramillo','CORRIENTE',7200.90000),
('10010','Carla','Velez','AHORROS',1500.00000);

INSERT INTO cuentas (numero_cuenta, cedula_propietario, fecha_creacion, saldo) VALUES
('C0001','10001','2022-08-21',500.00),
('C0002','10002','2022-08-22',800.00),
('C0003','10003','2022-08-22',100.00),
('C0004','10004','2022-09-05',300.00),
('C0005','10005','2022-11-18',540.00),
('C0006','10006','2022-12-01',950.00),
('C0007','10007','2023-01-22',430.00),
('C0008','10008','2023-02-27',200.00),
('C0009','10009','2023-03-11',790.00),
('C0010','10010','2023-09-03',400.00);
