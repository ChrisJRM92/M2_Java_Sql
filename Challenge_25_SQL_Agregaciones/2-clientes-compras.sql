--Obtener el monto toal de compras realizadas por cada cliente
SELECT 
    c.cedula,
    c.nombre,
    c.apellido,
    SUM(co.monto) AS total_compras
FROM clientes c, compras co
WHERE c.cedula = co.cedula
GROUP BY c.cedula, c.nombre, c.apellido;


--Obtener la cantidad total de compras en una fecha especifica
SELECT 
    COUNT(*) AS total_compras
FROM compras
WHERE fecha_compra = '2024-05-18';

