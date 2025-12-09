create table estudiantes(
    cedula varchar(10) PRIMARY KEY NOT NULL,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
    email varchar(50) NOT NULL,
    fecha_nacimiento date
);