--Productos
SELECT * FROM productos WHERE stock=10 AND precio::money <'10'::money;
SELECT nombre, stock FROM productos WHERE nombre LIKE '%m%' OR descripcion LIKE '% %';
SELECT nombre FROM productos WHERE descripcion IS NULL OR stock = 0;

--Cuentas
SELECT numero_cuenta, saldo FROM cuentas WHERE saldo::money > '100'::money and saldo::money < '1000'::money;
SELECT * FROM cuentas WHERE fecha BETWEEN (CURRENT_DATE - INTERVAL '1 year') AND CURRENT_DATE;
SELECT numero_cuenta FROM cuentas WHERE saldo::money = '0'::money OR cedula_propietario LIKE '%2';

--Estudiantes
SELECT nombre, apellido FROM estudiantes WHERE nombre LIKE 'M%' OR apellido LIKE '%Z';
SELECT nombre FROM estudiantes WHERE cedula LIKE '%32%' AND cedula LIKE '18%';
SELECT nombre, apellido FROM estudiantes WHERE cedula LIKE '%06' OR cedula LIKE '17%';

--Registros
SELECT * FROM registros WHERE (fecha >= '2024-09-01' AND fecha < '2024-10-01') OR cedula_empleado LIKE '17%';
SELECT * FROM registros WHERE fecha >= '2024-08-01' AND fecha <  '2024-09-01' AND cedula_empleado LIKE '17%' AND hora >= '08:00:00' AND hora <  '12:00:00';
SELECT *
FROM registros
WHERE
      (fecha >= '2024-08-01' AND fecha < '2024-09-01'
       AND cedula_empleado LIKE '17%'
       AND hora >= '08:00:00' AND hora < '12:00:00')
   OR
      (fecha >= '2024-09-01' AND fecha < '2024-10-01'
       AND cedula_empleado LIKE '08%'
       AND hora >= '09:00:00' AND hora < '13:00:00');

--videojuegos
SELECT * FROM videojuegos WHERE nombre LIKE '%C%' OR valoracion = 7;
SELECT * FROM videojuegos WHERE (codigo BETWEEN 3 AND 7) OR valoracion = 7;
SELECT * FROM videojuegos WHERE valoracion > 7 AND nombre LIKE 'C%' OR valoracion > 8 AND nombre LIKE 'D%';

--Transacciones
SELECT * FROM transacciones WHERE tipo = 'C' AND numero_cuenta BETWEEN 22004 AND 222001;
