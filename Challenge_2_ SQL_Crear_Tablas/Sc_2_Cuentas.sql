CREATE TABLE cuentas (
	numero_cuenta VARCHAR(5) PRIMARY KEY NOT NULL,
	cedula_propietario VARCHAR(5) NOT NULL,
	fecha_creacion DATE NOT NULL,
	saldo MONEY NOT NULL
);
