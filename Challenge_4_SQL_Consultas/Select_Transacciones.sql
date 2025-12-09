SELECT * FROM transacciones WHERE tipo LIKE 'D';

SELECT * FROM transacciones WHERE monto::numeric BETWEEN 200 and 2000;

SELECT codigo, monto, tipo, fecha FROM transacciones WHERE fecha IS NOT NULL;