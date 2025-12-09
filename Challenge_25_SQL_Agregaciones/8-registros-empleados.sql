--Obtener la cantidad total deregistros de entrada realizados por cada empleado
SELECT codigo_empleado, COUNT(*) AS total_registros
FROM registros_entrada
GROUP BY codigo_empleado;

--Obtener la fecha minima y maxima de los registros de entrada
SELECT 
    MIN(fecha) AS fecha_minima,
    MAX(fecha) AS fecha_maxima
FROM registros_entrada;
