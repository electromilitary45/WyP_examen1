-- COMANDOS DANGER------
drop SCHEMA  prueba_a;
drop table vehiculo;

-- CREACION BD------
CREATE SCHEMA prueba_a;
use prueba_a;
------ CERACION USUARIO------
create user 'cliente_a'@'%' identified by 'usuario_a';
grant all privileges on prueba_a.* to 'cliente_a'@'%';
flush privileges;

------ CREACION TABLAS------
CREATE TABLE prueba_a.vehiculo(
        id_vehiculo INT PRIMARY KEY AUTO_INCREMENT,
        descripcion VARCHAR(30),
        fecha_salida DATE,
        cilindros INT
)

------ Insertar datos------
insert into vehiculo(descripcion, fecha_salida, cilindros) values('Toyota', '2020-01-01', 4);
insert into vehiculo(descripcion, fecha_salida, cilindros) values('Nissan', '2020-01-01', 4);
insert into vehiculo(descripcion, fecha_salida, cilindros) values('Mazda', '2020-01-01', 4);
insert into vehiculo(descripcion, fecha_salida, cilindros) values('Honda', '2020-01-01', 4);

-- select

select * from vehiculo;