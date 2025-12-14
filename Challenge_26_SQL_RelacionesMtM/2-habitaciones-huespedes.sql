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
