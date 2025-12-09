SELECT *
FROM transacciones
WHERE tipo = 'C'
AND numero_cuentas BETWEEN '22001' AND '22004';

SELECT *
FROM transacciones
WHERE codigo = (
    SELECT codigo_transaccion
    FROM banco
    WHERE codigo_banco = 1
);
