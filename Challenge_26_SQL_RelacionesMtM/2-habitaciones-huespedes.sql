create table habitaciones(
    habitacion_numero int PRIMARY KEY,
    precio_por_noche decimal NOT NULL,
    piso int NOT NULL,
    max_personas int
);

create table huespedes(
    id int PRIMARY KEY,
    nombres varchar(45) NOT NULL,
    apellidos varchar(45) NOT NULL,
    telefono char(10),
    correo varchar(45),
    direccio varchar(45),
    ciudad varchar(45),
    pais varchar(45)
);

CREATE TABLE reservas (
    inicio_fecha DATE NOT NULL,
    fin_fecha DATE NOT NULL,
    habitacion INT NOT NULL,
    huesped_id INT NOT NULL,
    PRIMARY KEY (habitacion, huesped_id),
    FOREIGN KEY (habitacion) REFERENCES habitaciones(habitacion_numero),
    FOREIGN KEY (huesped_id) REFERENCES huespedes(id)
);

--Agregar la Data.sql antes de las sigueintes consultas
--=============
--CONSULTA 1
--=============
--Consulta
select habitaciones.habitacion_numero, huespedes.nombres, huespedes.apellidos from habitaciones, huespedes, reservas
where habitaciones.habitacion_numero=reservas.habitacion
and huespedes.id=reservas.huespedes_id;

--Subconsulta
select nombres, apellidos from huespedes
where id in (
	select huespedes_id from reservas
	where habitacion=2
);

--Agregacion
select habitaciones.habitacion_numero, count(reservas.huespedes_id) from habitaciones, reservas
where habitaciones.habitacion_numero=reservas.habitacion
group by habitaciones.habitacion_numero;

--=============
--CONSULTA 2
--=============
--Consulta
select habitaciones.habitacion_numero, habitaciones.piso, huespedes.nombres, huespedes.apellidos from habitaciones, huespedes, reservas
where habitaciones.habitacion_numero=reservas.habitacion
and huespedes.id=reservas.huespedes_id
and habitaciones.piso=4;

--Subconsulta
select nombres, apellidos from huespedes
where id in(
	select huespedes_id from reservas
	where habitacion=3
);

--Agregacion
select habitaciones.habitacion_numero, avg(reservas.huespedes_id) from habitaciones, reservas
where habitaciones.habitacion_numero=reservas.habitacion
group by habitaciones.habitacion_numero;

--=============
--CONSULTA 3
--=============
--Consulta
select habitaciones.habitacion_numero, huespedes.nombres, huespedes.apellidos from habitaciones, huespedes, reservas
where habitaciones.habitacion_numero=reservas.habitacion
and huespedes.id=reservas.huespedes_id;

--Subconsulta
select nombres, apellidos from huespedes
where id in(
	select huespedes_id from reservas
	where habitacion=4
);

--Agregacion
select habitaciones.habitacion_numero, sum(habitaciones.precio_por_noche) from habitaciones, reservas
where habitaciones.habitacion_numero=reservas.habitacion
group by habitaciones.habitacion_numero;