SELECT 
    p.nombre,
    p.stock,
    v.cantidad
FROM productos p, ventas v
WHERE p.codigo = v.codigo_producto
AND (p.nombre ILIKE '%m%' OR p.descripcion = '0');

SELECT 
    p.nombre,
    p.stock
FROM productos p, ventas v
WHERE p.codigo = v.codigo_producto
AND v.cantidad = 5;

