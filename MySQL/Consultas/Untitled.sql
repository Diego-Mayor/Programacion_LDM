-- 🟢 NIVEL 1 – MUY BÁSICO (SELECT)
-- Mostrar todos los clientes 
select * from clientes;

-- Mostrar todos los productos.
select * from productos;
 
-- Mostrar solo nombre y precios de los productos.
select nombre, precio  from  productos;

-- Mostrar las categorías existentes.
select * from categorias;

-- Mostrar los clientes que viven en Madrid.
select nombre, ciudad  from clientes where ciudad =  'Madrid';

-- Mostrar los productos con precio mayor a 20.
select nombre, precio from productos where precio > 20;

-- Mostrar los productos con stock menor a 50.
select nombre, stock from productos where stock < 50;

-- Mostrar los pedidos con estado "pagado".
select estado from pedidos where estado = 'pagado'; 

-- Mostrar los clientes ordenados por nombre.
select nombre from clientes order by nombre asc;

-- Mostrar los productos ordenados por precio de mayor a menor
select nombre, precio from productos order by precio desc;

				-- 🟢 NIVEL 2 – FILTROS (WHERE, AND, OR, BETWEEN, LIKE)
                
-- Mostrar los clientes registrados después del 2025-02-01.
select nombre,fecha_registro from clientes where fecha_registro > '2025-02-01';

-- Mostrar los productos con precio entre 15 y 30.
select nombre, precio from productos where precio between 15 and 30 order by precio asc; 

-- Mostrar los productos de la categoría Tecnología.
select nombre from categorias where nombre = 'Tecnologia';

-- Mostrar los clientes que viven en Madrid o Barcelona.
select nombre, ciudad from clientes where ciudad = 'Madrid' or ciudad = 'Barcelona';

-- Mostrar los productos cuyo nombre empiece por “C”.
select nombre from productos where nombre like 'C%';

-- Mostrar los pedidos no cancelados.
select estado from pedidos where estado != 'cancelado';

-- Mostrar los productos con stock entre 30 y 80.
select nombre , stock from productos where stock between 30 and 80;

-- Mostrar los clientes cuyo email contenga “@email.com”.
select nombre, email from clientes where email like '%@email.com%';

-- Mostrar los pedidos realizados en abril de 2025.
select fecha_pedido from pedidos where fecha_pedido >= '2025-04-01' and fecha_pedido <= '2025-04-30';

-- Mostrar los productos que no cuestan 25.
select nombre, precio from productos where precio != 25; 



-- 🟡 NIVEL 3 – FUNCIONES Y AGREGACIÓN
-- Mostrar el precio máximo de los productos.


-- Mostrar el precio mínimo de los productos.


-- Mostrar el precio promedio de los productos.


-- Contar cuántos clientes hay por ciudad.


-- Contar cuántos productos hay por categoría.


-- Mostrar el total de pedidos realizados.


-- Mostrar cuántos pedidos hay por estado.


-- Mostrar el stock total de todos los productos.


-- Mostrar el precio promedio de los productos de Tecnología.


-- Mostrar las ciudades con más de un cliente.



-- 🟡 NIVEL 4 – JOINS (MUY IMPORTANTE)
-- Mostrar cada producto junto con su categoría.


-- Mostrar los pedidos con el nombre del cliente.


-- Mostrar el detalle de los pedidos (producto, cantidad y precio).


-- Mostrar los pedidos con cliente y estado.


-- Mostrar los productos vendidos en cada pedido.


-- Mostrar los clientes que han hecho pedidos.


-- Mostrar los clientes que NO han hecho pedidos.


-- Mostrar los pedidos con productos de la categoría Ropa.


-- Mostrar el nombre del cliente y la fecha de su pedido.


-- Mostrar los productos junto con la cantidad vendida.



-- 🟠 NIVEL 5 – CÁLCULOS Y GROUP BY
-- Calcular el total de dinero por pedido.


-- Calcular el total gastado por cada cliente.


-- Mostrar los clientes que han gastado más de 50.


-- Mostrar el producto más vendido.


-- Mostrar los 3 productos más vendidos.


-- Mostrar el ingreso total de la tienda.


-- Mostrar el ingreso total por categoría.


-- Mostrar cuántos productos se vendieron por categoría.


-- Mostrar el pedido con el importe más alto.


-- Mostrar los clientes ordenados por dinero gastado.



-- 🔴 NIVEL 6 – SUBCONSULTAS (DESAFÍO)
-- Mostrar los productos con precio mayor al promedio.


-- Mostrar los clientes que han hecho más pedidos que el promedio.


-- Mostrar los productos que nunca se han vendido.


-- Mostrar los clientes que no tienen pedidos cancelados.


-- Mostrar el pedido con más productos distintos.


-- Mostrar el cliente que más ha gastado.


-- Mostrar la categoría con mayores ingresos.


-- Mostrar los productos vendidos en pedidos pagados.


-- Mostrar los clientes que compraron Auriculares.


-- Mostrar los pedidos cuyo total sea mayor al promedio.



