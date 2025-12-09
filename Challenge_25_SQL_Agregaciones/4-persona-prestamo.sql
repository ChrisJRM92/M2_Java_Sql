--Obtener la suma de los montos de prestamo para cada persona 
SELECT 
    p.cedula,
    p.nombre,
    p.apellido,
    SUM(pr.monto) AS total_prestamos
FROM persona p
JOIN prestamo pr ON p.cedula = pr.cedula
GROUP BY p.cedula, p.nombre, p.apellido;


--Obtener la cantidad total de personas que tienen mas de un hijo
SELECT COUNT(*) AS personas_con_mas_de_un_hijo
FROM (
    SELECT cedula, COUNT(*) AS total_hijos
    FROM hijos
    GROUP BY cedula
    HAVING COUNT(*) > 1
) t;
