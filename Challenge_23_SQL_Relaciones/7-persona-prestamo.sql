CREATE TABLE persona(
    cedula char(10) PRIMARY KEY NOT NULL,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
    estatura decimal(10,2) NOT NULL,
    fecha_nacimiento date NOT NULL,
    hora_nacimiento time,
    cantidad_ahorrada money,
    numero_hijos int
);

create table prestamo(
    cedula char(10) PRIMARY KEY,
    monto money,
    fecha_prestamo date,
    hora_prestamo time,
    garante varchar(40),
    FOREIGN KEY (cedula) REFERENCES persona(cedula)
);

INSERT INTO persona VALUES 
('0102030401','Luis','Mora',1.75,'1990-03-10','08:15',550.00,2),
('0203040502','Ana','Lopez',1.62,'1985-07-22','12:30',200.00,1),
('0304050603','Carlos','Vera',1.80,'1992-11-05','06:40',900.00,0),
('0405060704','Maria','Santos',1.58,'1988-01-14','14:10',1200.00,3),
('0506070805','Jorge','Paredes',1.72,'1995-09-19','10:20',300.00,0),
('0607080906','Elena','Rios',1.65,'1991-06-02','09:00',450.00,2),
('0708091007','Sean','Martinez',1.78,'1993-12-12','07:55',800.00,0),
('0809101108','Ruben','Castro',1.70,'1987-04-18','16:45',150.00,4),
('0901011219','Gabriela','Torres',1.60,'1994-05-25','11:10',620.00,1),
('1001121314','Pedro','Salazar',1.82,'1989-10-08','05:50',700.00,2);


INSERT INTO prestamo VALUES
('0102030401',300.00,'2023-01-10','09:20','Ramon'),
('0203040502',750.00,'2023-02-14','13:10','Julia'),
('0304050603',500.00,'2023-03-03','08:00','Mario'),
('0405060704',900.00,'2023-04-22','15:15','Clara'),
('0506070805',150.00,'2023-05-30','10:40','Luis'),
('0607080906',650.00,'2023-06-11','07:55','Alicia'),
('0708091007',400.00,'2023-07-19','12:05','Rene'),
('0809101108',850.00,'2023-08-27','16:10','Tania'),
('0901011219',200.00,'2023-09-09','11:50','Sofia'),
('1001121314',950.00,'2023-10-13','06:30','Hector');