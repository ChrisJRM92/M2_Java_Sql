SELECT 
    re.cedula_empleado,
    re.fecha,
    e.nombre
FROM registros_entrada re, empleado e
WHERE re.codigo_empleado = e.codigo_empleado
AND (
        -- Bloque 1
        (re.fecha BETWEEN '2023-08-01' AND '2023-08-31')

        OR

        -- Bloque 2
        (re.cedula_empleado LIKE '17%' 
         AND re.hora BETWEEN '08:00' AND '12:00')

        OR

        -- Bloque 3
        (re.fecha BETWEEN '2023-10-06' AND '2023-10-20'
         AND re.cedula_empleado LIKE '08%'
         AND re.hora BETWEEN '09:00' AND '13:00')
    );


SELECT *
FROM empleado
WHERE codigo_empleado = (
    SELECT codigo_empleado
    FROM registros_entrada
    WHERE cedula_empleado = '2201'
);
