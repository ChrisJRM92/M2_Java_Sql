create table usuarios(
    id int PRIMARY KEY,
    nombre varchar(25) NOT NULL,
    apellido varchar(25) NOT NULL,
    fecha_nacimiento DATE
);

create table grupo(
    id int PRIMARY KEY,
    nombre varchar(25) NOT NULL,
    descripcion varchar(75),
    fecha_creacion DATE
);

CREATE TABLE usuario_grupo (
    us_id INT NOT NULL,
    gr_id INT NOT NULL,
    PRIMARY KEY (us_id, gr_id),
    FOREIGN KEY (us_id) REFERENCES usuarios(id),
    FOREIGN KEY (gr_id) REFERENCES grupo(id)
);

--Agregar la Data.sql antes de las sigueintes consultas