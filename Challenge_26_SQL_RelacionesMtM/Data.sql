-- ======================================================
-- TABLAS MUCHOS A MUCHOS
-- ======================================================

-- ------------------------------------------------------
-- 1. RELACIÓN MUCHOS A MUCHOS: USUARIOS ↔ GRUPO
-- ------------------------------------------------------

INSERT INTO usuarios (id, nombre, apellido, fecha_nacimiento) VALUES
    (1, 'Marilyn',     'Sagñay',   '2023-11-05'),
    (2, 'Romel',       'Chamba',   '2023-11-06'),
    (3, 'Mario',       'Guzñay',   '2023-11-05'),
    (4, 'Johann',      'Domo',     '2023-11-07'),
    (5, 'Monserrate',  'Vera',     '2023-11-05'),
    (6, 'Lucio',       'Vargas',   '2023-11-05'),
    (7, 'Martín',      'Arizaga',  '2023-11-05'),
    (8, 'Fricson',     'Erazo',    '2023-11-05'),
    (9, 'Jairo',       'Obando',   '2023-11-05'),
    (10,'Berni',       'Tomalá',   '2023-11-05');

INSERT INTO grupo (id, nombre, descripcion, fecha_creacion) VALUES
    (1, 'Maternal 1', 'Grupo de maternal matutino', '2020-03-08'),
    (2, 'Maternal 2', 'Grupo de maternal vepertino', '2020-03-08'),
    (3, 'Maternal 3', 'Grupo de maternal nocturno', '2020-03-08'),
    (4, 'Inicial 1',  'Grupo de inicial matutino',  '2021-03-15'),
    (5, 'Inicial 2',  'Grupo de inicial vespertino','2021-03-15'),
    (6, 'Inicial 3',  'Grupo de inicial nocturno',  '2021-03-15'),
    (7, 'Inicial intensivo', 'Inicial sábados',     '2021-03-15'),
    (8, 'Maternal intensivo 1','Maternal sábados AM','2022-03-15'),
    (9, 'Maternal intensivo 2','Maternal sábados PM','2022-03-15'),
    (10,'Maternal intensivo 3','Maternal sábados N','2022-03-15');

INSERT INTO usuario_grupo (us_id, gr_id) VALUES
    (1, 8),
    (2, 3),
    (3, 8),
    (4, 9),
    (5, 1),
    (6, 2),
    (7, 8),
    (8, 8),
    (9,10),
    (10,1);

-- ------------------------------------------------------
-- 2. RELACIÓN MUCHOS A MUCHOS: HABITACIONES ↔ HUÉSPEDES
-- ------------------------------------------------------

INSERT INTO habitaciones (id, precio, piso, capacidad) VALUES
    (1, 40.0, 4, 4),
    (2, 20.0, 4, 2),
    (3, 40.0, 4, 4),
    (4, 40.0, 3, 4),
    (5, 20.0, 3, 2),
    (6, 20.0, 3, 2),
    (7, 20.0, 2, 2),
    (8, 20.0, 2, 2),
    (9, 20.0, 2, 2),
    (10,15.0, 1, 1),
    (11,15.0, 1, 1),
    (12,15.0, 1, 1);

INSERT INTO huespedes (id, nombre, apellido, telefono, email) VALUES
    (1, 'Ricardo', 'Montero',   980658774,  'ricmontero@gmail.com'),
    (2, 'Sofía',   'Martinez',  9887563205, 'sofimar@gmail.com'),
    (3, 'Yamilteh','Guami',     998763298,  'yamguam@gmail.com'),
    (4, 'Esther',  'Contreras', 995783602,  'esthcontro@gmail.com'),
    (5, 'Wiliam',  'Mantilla',  9858796320, 'wmantilla@gmail.com'),
    (6, 'Carmen',  'Noguera',   995876321,  'cnoguera@gmail.com'),
    (7, 'Anika',   'Jimenez',   978965432,  'anijimenez@gmail.com'),
    (8, 'Belen',   'Orejuela',  996365748,  'borejuela@gmail.com'),
    (9, 'Diana',   'Monroy',    987963214,  'dianamroy@gmail.com'),
    (10,'Bryan',   'Moncada',   986325741,  'brmoncada@gmail.com');

INSERT INTO reservas (fecha_inicio, fecha_fin, habitacion_id, huesped_id) VALUES
    ('2023-05-11','2023-05-12', 2, 10),
    ('2023-05-11','2023-05-12', 2, 9),
    ('2023-06-22','2023-06-23', 1, 1),
    ('2023-06-22','2023-06-23', 1, 2),
    ('2023-06-22','2023-06-23', 1, 3),
    ('2023-06-22','2023-06-23', 1, 4),
    ('2023-01-01','2023-01-02',12, 5),
    ('2023-08-11','2023-08-12',11, 6),
    ('2023-05-11','2023-05-12',10, 7),
    ('2023-05-11','2023-05-12', 9, 8);

-- ------------------------------------------------------
-- 3. RELACIÓN MUCHOS A MUCHOS: MUNICIPIO ↔ PROYECTO
-- ------------------------------------------------------

INSERT INTO ciudad (id, nombre) VALUES
    (1,'Quito'),
    (2,'Ambato'),
    (3,'Guayaquil'),
    (4,'Machala'),
    (5,'Manta'),
    (6,'Loja'),
    (7,'Otavalo'),
    (8,'Cuenca'),
    (9,'Latacunga'),
    (10,'Tena');

INSERT INTO municipio (id, nombre, ciudad_id) VALUES
    (1, 'GAD MUNICIPAL QUITO',        1),
    (2, 'GAD MUNICIPAL DE CUENCA',    8),
    (3, 'GAD MUNICIPAL DE AMBATO',    2),
    (4, 'MUNICIPALIDAD DE MACHALA',   4),
    (5, 'MUNICIPIO DE GUAYAQUIL',     3),
    (6, 'MUNICIPIO DE OTAVALO',       7),
    (7, 'MUNICIPIO DE LOJA',          6),
    (8, 'MUNICIPIO DE MANTA',         5),
    (9, 'MUNICIPIO DE LATACUNGA',     9),
    (10,'MUNICIPIO DE TENA',         10);

INSERT INTO proyecto (id, nombre, presupuesto, fecha_inicio, fecha_fin) VALUES
    (1, 'Gestión Ambiental', 9543.327,  '2022-02-10','2023-02-10'),
    (2, 'Desarrollo Productivo',26553.264,'2022-06-25','2022-08-10'),
    (3, 'Cambio Climático', 1292.194,  '2021-02-01','2023-12-10');

INSERT INTO proyecto_municipio (proyecto_id, municipio_id) VALUES
    (1, 5),
    (3, 5),
    (1, 2),
    (2, 1),
    (1, 4),
    (2, 9),
    (1,10),
    (3, 6),
    (1, 3),
    (2, 7);
