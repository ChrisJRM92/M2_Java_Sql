CREATE TABLE transacciones(
    codigo integer PRIMARY KEY NOT NULL,
    numero_cuenta varchar(5) NOT NULL,
    monto money NOT NULL,
    tipo varchar(1) NOT NULL,
    fecha date NOT NULL,
    hora time NOT NULL
);