select us.nombre, cu.numero_cuenta, cu.saldo 
from usuarios us, cuentas cu 
where us.cedula = cu.cedula_propietario
AND cu.saldo::numeric BETWEEN 100 AND 1000;

select cu.numero_cuenta, cu.fecha_creacion, cu.saldo, cu.cedula_propietario  
from usuarios us, cuentas cu 
WHERE us.cedula = cu.cedula_propietario
AND cu.fecha_creacion::date BETWEEN '2022-09-21' AND '2023-09-21';