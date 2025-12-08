create table profesores(
    codigo int PRIMARY KEY NOT NULL,
    nombre varchar(50) NOT NULL
);

create table estudiantes(
    cedula char(10) PRIMARY KEY NOT NULL,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
    email varchar(50) NOT NULL,
    fecha_nacimiento date,
    codigo_profesor int,
    FOREIGN KEY (codigo_profesor) REFERENCES profesores(codigo)
);

INSERT INTO profesores (codigo, nombre) VALUES
(1, 'Francisco'),
(2, 'Miguel'),
(3, 'Roberto'),
(4, 'Luis'),
(5, 'Javier');

INSERT INTO estudiantes (cedula, nombre, apellido, email, fecha_nacimiento, codigo_profesor) VALUES
('0102030405', 'Ana', 'Naranjo', 'ana.naranjo@mail.com', '1999-05-10', 1),
('0203040506', 'Carlos', 'Benitez', 'carlos.benitez@mail.com', '1998-03-22', 1),
('0304050607', 'Daniel', 'Canching', 'daniel.canching@mail.com', '2000-11-01', 2),
('0405060708', 'Maria', 'Luna', 'maria.luna@mail.com', '1997-07-15', 3),
('0506070809', 'Jorge', 'Montenegro', 'jorge.montenegro@mail.com', '1996-01-09', 4),
('0607080901', 'Lucia', 'Perez', 'lucia.perez@mail.com', '2001-09-19', 2),
('0708090102', 'Erick', 'Rivas', 'erick.rivas@mail.com', '1995-04-12', 3),
('0809010203', 'Paola', 'Mena', 'paola.mena@mail.com', '1999-12-30', 5),
('0901020304', 'Rosa', 'Nevarez', 'rosa.nevarez@mail.com', '2002-08-21', 4),
('1002030405', 'Ivan', 'Santos', 'ivan.santos@mail.com', '1994-10-03', 5);
