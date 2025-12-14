create table ciudad(
    id int PRIMARY KEY,
    nombre varchar(45) NOT NULL
);

create table municipio(
    id int PRIMARY KEY,
    nombre varchar(45),
    ciudad_id int,
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

--Agregar la Data.sql antes de las sigueintes consultas
--=============
--CONSULTA 1
--=============
--Consulta
select municipio.nombre, proyecto.proyecto from municipio, proyecto, proyecto_municipio
where municipio.id=proyecto_municipio.municipio_id
and proyecto.id=proyecto_municipio.proyecto_id;

--Subconsulta
select proyecto from proyecto
where id in(
	select proyecto_id from proyecto_municipio
	where municipio_id=1
);

--Agregacion
select municipio.nombre, count(proyecto_municipio.proyecto_id) from municipio, proyecto_municipio
where municipio.id=proyecto_municipio.municipio_id
group by municipio.nombre;

--=============
--CONSULTA 2
--=============
--Consulta
select municipio.nombre, proyecto.proyecto from municipio, proyecto, proyecto_municipio
where municipio.id=proyecto_municipio.municipio_id
and proyecto.id=proyecto_municipio.proyecto_id
and municipio.nombre like '%GAD%';

--Agregacion
select municipio.nombre, min(proyecto_municipio.proyecto_id) from municipio, proyecto_municipio
where municipio.id=proyecto_municipio.municipio_id
group by municipio.nombre;

--=============
--CONSULTA 3
--=============
--Consulta
select municipio.nombre, ciudad.nombre from municipio, ciudad
where municipio.ciudad_id=ciudad.id;

--Subconsulta
select proyecto from proyecto
where id in(
	select proyecto_id from proyecto_municipio
	where municipio_id=3
);

--Agregacion
select municipio.nombre, max(proyecto_municipio.proyecto_id) from municipio, proyecto_municipio
where municipio.id=proyecto_municipio.municipio_id
group by municipio.nombre;