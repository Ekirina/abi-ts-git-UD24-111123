CREATE TABLE trabajador(
	id INT auto_increment,
	nombre VARCHAR(50),
    salario DOUBLE default null,
    trabajo enum ('barman', 'chef', 'camarero') not null,
    primary key (id)
);

INSERT INTO trabajador (nombre, salario, trabajo) values ('Juan Carlos', 17000, 'barman');
INSERT INTO trabajador (nombre, salario, trabajo) values ('Alejandro', 17000, 'chef');
INSERT INTO trabajador (nombre, salario, trabajo) values ('Marc', 15000, 'camarero');
