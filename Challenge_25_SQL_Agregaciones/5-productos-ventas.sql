--Obtener el maximo precio de todos los productos
SELECT MAX(precio) AS maximo_precio
FROM productos;

--Obtener la suma total de la cantidad de productos vendidos
SELECT SUM(cantidad) AS total_vendido
FROM ventas;
