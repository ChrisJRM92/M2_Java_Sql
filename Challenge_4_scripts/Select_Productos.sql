SELECT * FROM productos WHERE nombre LIKE 'Q%';

SELECT * FROM productos WHERE descripcion IS NULL;

SELECT * FROM productos WHERE precio::numeric BETWEEN 2 AND 3;