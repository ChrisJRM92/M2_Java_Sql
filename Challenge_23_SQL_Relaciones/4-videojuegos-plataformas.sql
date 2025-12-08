create table videojuegos(
    codigo int PRIMARY KEY NOT NULL,
    nombre varchar(100) NOT NULL,
    descripcion varchar(300),
    valoracion int NOT NULL
);

create table plataformas(
    id_plataforma int PRIMARY KEY NOT NULL,
    nombre_plataforma varchar(50) NOT NULL,
    codigo_videojuego int,
    FOREIGN KEY (codigo_videojuego) REFERENCES videojuegos(codigo)
);

INSERT INTO videojuegos (codigo, nombre, descripcion, valoracion) VALUES
(1, 'Call of Duty', 'Videojuego de Guerra moderna', 9),
(2, 'God of War', 'Aventura épica basada en mitología', 10),
(3, 'Civilization VI', 'Estrategia por turnos, no relacionado con Guerra directa', 8),
(4, 'Dark Souls', 'Acción y dificultad elevada', 9),
(5, 'Commandos', 'Estrategia táctica de Guerra', 8),
(6, 'Doom Eternal', 'Acción intensa, combate extremo', 9),
(7, 'Gears of War', 'Acción militar y Guerra futurista', 9),
(8, 'Crash Bandicoot', 'Plataformas clásico', 7),
(9, 'Dead Space', 'Terror y acción espacial', 8),
(10, 'Company of Heroes', 'Estrategia en tiempo real basada en Guerra', 9);

INSERT INTO plataformas (id_plataforma, nombre_plataforma, codigo_videojuego) VALUES
(1, 'PC', 1),
(2, 'PlayStation', 2),
(3, 'Xbox', 3),
(4, 'Nintendo Switch', 8),
(5, 'PC', 5),
(6, 'PlayStation', 4),
(7, 'Xbox', 7),
(8, 'PC', 6),
(9, 'PlayStation', 9),
(10, 'PC', 10);
