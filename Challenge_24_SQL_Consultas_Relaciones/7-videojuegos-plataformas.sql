SELECT 
    v.nombre,
    v.descripcion,
    v.valoracion,
    p.nombre_plataforma
FROM videojuegos v, plataformas p
WHERE v.codigo = p.codigo_videojuego
AND (
        (v.descripcion ILIKE '%Guerra%' AND v.valoracion > 7)
        OR
        (v.nombre ILIKE 'C%' AND v.valoracion > 8 AND p.nombre_plataforma ILIKE 'D%')
    );
    

SELECT *
FROM plataformas
WHERE codigo_videojuego = (
    SELECT codigo
    FROM videojuegos
    WHERE nombre = 'God of war'
);

