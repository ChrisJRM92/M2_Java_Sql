--Obtener la cantidad total de estudiantes asigandos a cada profesor
SELECT 
    p.codigo,
    p.nombre,
    COUNT(e.cedula) AS total_estudiantes
FROM profesores p, estudiantes e
WHERE p.codigo = e.codigo_profesor
GROUP BY p.codigo, p.nombre;


--Obtener la edad promedio de los estudiantes
SELECT 
    ROUND(AVG(EXTRACT(YEAR FROM AGE(CURRENT_DATE, fecha_nacimiento))), 0) 
    AS edad_promedio
FROM estudiantes;

