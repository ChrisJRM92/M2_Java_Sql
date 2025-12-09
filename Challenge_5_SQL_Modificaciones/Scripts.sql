-- Productos
UPDATE productos SET stock=0 WHERE descripcion IS NULL;

-- Cuentas
UPDATE cuentas SET saldo = '10'::money WHERE cedula_propietario LIKE '17%';

-- Estudiantes
update estudiantes set apellido = 'Hernandez' where cedula like '17%';

-- Registros
UPDATE registros SET cedula_empleado = '082345679' WHERE EXTRACT(MONTH FROM fecha) = 8;

-- Videojuegos
UPDATE videojuegos SET descripcion='Mejor puntuado' WHERE valoracion>9;

-- Transacciones
update transacciones set tipo='T' 
where monto>100::money
and monto<500::money
and extract(month from fecha) = 9
and hora between '14:00' and '20:00';