--obtener el saldo promedio de todas las cuentas de un usurio especifico
SELECT AVG(c.saldo::numeric) AS saldo_promedio
FROM cuentas c
WHERE c.cedula_propietario = '10001';

--Obtener el numero total de cuentas de cada tipo de cuenta
SELECT 
    u.tipo_cuenta,
    COUNT(c.numero_cuenta) AS total_cuentas
FROM usuarios u, cuentas c
WHERE u.cedula = c.cedula_propietario
GROUP BY u.tipo_cuenta;