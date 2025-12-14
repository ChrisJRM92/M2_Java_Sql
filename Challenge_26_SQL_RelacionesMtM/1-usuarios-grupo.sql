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
--=============
--CONSULTA 1
--=============
--Consulta
select usuarios.nombre, grupo.nombre from usuarios, usuario_grupo, grupo
where usuarios.id=usuario_grupo.ud_id
and grupo.id=usuario_grupo.gr_id

--Subconsulta
select * from usuarios
where id in (
	select ud_id from usuario_grupo
	where gr_id = 1
)

--Agregacion
select grupo.nombre, count(usuario_grupo.ud_id) from grupo, usuario_grupo
where grupo.id=usuario_grupo.gr_id
group by grupo.nombre

--=============
----CONSULTA 2
--=============
--Consulta
select usuarios.nombre, grupo.nombre from usuarios, grupo, usuario_grupo
where usuarios.id=usuario_grupo.ud_id
and grupo.id=usuario_grupo.gr_id
and grupo.nombre like '%intensivo%'

--Subconsulta
select nombre from usuarios
where id in(
	select ud_id from usuario_grupo
	where gr_id=2
)

--Agregacion
select grupo.nombre, max(usuario_grupo.ud_id) from grupo, usuario_grupo
where grupo.id=usuario_grupo.gr_id
group by grupo.nombre

--=============
----CONSULTA 3
--=============
--Consulta
select usuarios.nombre, grupo.fecha_creacion from usuarios, grupo, usuario_grupo
where usuarios.id=usuario_grupo.ud_id
and grupo.id=usuario_grupo.gr_id
and grupo.fecha_creacion between '2020-03-08' and '2022-03-08'

--Subconsulta
select nombre from usuarios
where id in(
	select Ud_id from usuario_grupo
	where gr_id=3
)

--Agregacion
select grupo.descripcion, count(usuario_grupo.ud_id) from grupo, usuario_grupo
where grupo.id=usuario_grupo.gr_id
and grupo.descripcion like '%matutino%'
group by grupo.descripcion