--Obtener la cantidad total de plataformas disponibles para cada videojuego
SELECT 
    codigo_videojuego,
    COUNT(*) AS total_plataformas
FROM plataformas
GROUP BY codigo_videojuego;

--Obtener la valoracion de orimedio de todos los videojuegos
SELECT ROUND(AVG(valoracion), 2) AS valoracion_promedio
FROM videojuegos;
