create table ciudad(
    id int PRIMARY KEY,
    nombre varchar(45) NOT NULL
);

create table municipio(
    id int PRIMARY KEY,
    nombre varchar(45),
    ciudad_id int,
    CONSTRAINT municipio_pk PRIMARY KEY(id),
    CONSTRAINT ciudad_fk FOREIGN KEY (ciudad_id) REFERENCES ciudad(id)
);

create table proyecto(
    id int PRIMARY KEY,
    proyecto varchar(50) NOT NULL,
    monto money not NULL,
    fecha_inicio date,
    fecha_entrega date
);

CREATE TABLE proyecto_municipio (
    proyecto_id INT NOT NULL,
    municipio_id INT NOT NULL,
    CONSTRAINT proyecto_municipio_pk PRIMARY KEY (proyecto_id, municipio_id),
    CONSTRAINT proyecto_fk FOREIGN KEY (proyecto_id) REFERENCES proyecto(id),
    CONSTRAINT municipio_fk FOREIGN KEY (municipio_id) REFERENCES municipio(id)
);

