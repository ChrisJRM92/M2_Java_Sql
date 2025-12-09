--Script 1
create table productos (
	codigo integer PRIMARY KEY NOT NULL,
	nombre varchar(50) NOT NULL,
	descripcion varchar(200),
	precio money NOT NULL,
	stock integer NOT NULL	
);