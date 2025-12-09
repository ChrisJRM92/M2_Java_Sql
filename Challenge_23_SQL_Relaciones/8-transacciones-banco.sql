create table transacciones(
    codigo int PRIMARY KEY,
    numero_cuentas char(5) NOT NULL,
    monto money NOT NULL,
    tipo char(1) NOT NULL,
    fecha date,
    hora time
);

create table banco(
    codigo_banco int PRIMARY KEY,
    codigo_transaccion int,
    detalle varchar(100),
    FOREIGN KEY (codigo_transaccion) REFERENCES transacciones(codigo)
);

INSERT INTO transacciones VALUES
(1,'22001',300.00,'C','2023-01-10','09:20'),
(2,'22002',150.00,'C','2023-01-15','10:40'),
(3,'22003',500.00,'D','2023-01-20','14:10'),
(4,'22004',250.00,'C','2023-02-05','08:55'),
(5,'22001',700.00,'D','2023-02-10','11:25'),
(6,'22002',100.00,'D','2023-02-18','13:00'),
(7,'22003',900.00,'D','2023-02-25','16:40'),
(8,'22004',350.00,'D','2023-03-01','07:50'),
(9,'22001',120.00,'D','2023-03-12','12:15'),
(10,'22002',650.00,'D','2023-03-20','15:30');


INSERT INTO banco VALUES
(101,1,'Pago de servicio'),
(102,2,'Depósito en ventanilla'),
(103,3,'Transferencia externa'),
(104,4,'Compra con débito'),
(105,5,'Retiro en cajero'),
(106,6,'Cargo automático'),
(107,7,'Pago tarjeta de crédito'),
(108,8,'Depósito ATM'),
(109,9,'Débito por comisión'),
(110,10,'Transferencia interna');
