--Obtener la cantidad total de transacciones de tipo C (credito)
SELECT COUNT(*) AS total_transacciones_credito
FROM transacciones
WHERE tipo = 'C';

--Obtener el promedio de montos de transacciones para cada nmero de cuenta
SELECT 
    numero_cuentas,
    AVG(monto) AS promedio_montos
FROM transacciones
GROUP BY numero_cuentas;
