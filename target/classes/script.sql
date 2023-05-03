create table usuario(
	idusuario	serial		primary key,
	nome		varchar(100)	not null,
	telefone	varchar(11)		not null,
	email		varchar(40)		not null unique,
	login		varchar(40)		not null unique,
	senha		varchar(40)		not null
);

