SELECT pr.codigo, pr.nombre 
FROM profesores pr, estudiantes es 
WHERE es.nombre LIKE '%n%';

SELECT pr.codigo, es.nombre, es.apellido 
FROM profesores pr, estudiantes es 
WHERE pr.codigo = es.codigo_profesor
AND es.apellido LIKE '%n%';

SELECT * FROM estudiantes es, profesores pr 
WHERE pr.codigo = es.codigo_profesor
AND pr.nombre LIKE 'Francisco';