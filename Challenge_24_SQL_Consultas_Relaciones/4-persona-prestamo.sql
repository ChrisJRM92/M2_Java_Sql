SELECT per.cantidad_ahorrada, pres.monto, pres.garante FROM persona per, prestamo pres 
WHERE per.cedula = pres.cedula AND pres.monto::numeric BETWEEN 100 and 1000;

SELECT * 
FROM persona
WHERE cedula = (
    SELECT cedula
    FROM persona
    WHERE nombre = 'Sean'
);
