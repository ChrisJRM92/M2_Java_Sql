-- Productos
DELETE FROM productos WHERE descripcion IS NULL;

--Cuentas
DELETE FROM cuentas WHERE cedula_propietario LIKE '10%';

--Estudiantes
DELETE FROM estudiantes WHERE cedula LIKE '%05';

--REgistros
DELETE FROM registros WHERE fecha >= '2024-06-01' AND fecha < '2024-07-01';

--Videojuegos
DELETE FROM videojuegos WHERE valoracion < 7;

--Transacciones
DELETE FROM transacciones
WHERE fecha LIKE '2025-08-%'
  AND hora >= '14:00:00'
  AND hora <  '18:00:00';
