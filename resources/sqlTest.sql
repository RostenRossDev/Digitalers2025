SELECT
    empleado_id,
    COUNT(*) AS cantidad_atendidos
FROM
    pedidos
GROUP BY
    empleado_id
HAVING
    COUNT(*) > 3;

-----############################################################-----

SELECT *, precio * 1.25 as 'Precio con Aumento' FROM productos;

----################################################--
SELECT *, 'China' as Origen FROM productos;

----################################################--
SELECT nombre, email FROM clientes ORDER BY email DESC

---######################################################
SELECT nombre, email FROM clientes ORDER BY email DESC LIMIT 2

---######################################
SELECT nombre, email FROM clientes ORDER BY email DESC LIMIT 2  OFFSET 10
