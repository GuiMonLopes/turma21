-- Criando o banco de dados
create database db_escola;

-- Acessando o banco de dados
use db_escola;

-- Criando a tabela alune
create table tb_alune(
id bigint(20) auto_increment,
nome varchar(255) not null,
idade int,
matricula varchar(255),
nota decimal (10,2),
ativo boolean,
primary key(id)
);

insert into tb_alune (nome, idade, nota) value ("João", 10, 10);
insert into tb_alune (nome, idade, nota) value ("Joana", 10, 8.55);
insert into tb_alune (nome, idade, nota) value ("Marcelo", 15, 7.55);
insert into tb_alune (nome, idade, nota) value ("Marcela", 16, 9.55);
insert into tb_alune (nome, idade, nota) value ("Guilherme", 17, 5.55);
insert into tb_alune (nome, idade, nota) value ("Guilhermina", 17, 8.55);
insert into tb_alune (nome, idade, nota) value ("Pedro", 8, 9.55);
insert into tb_alune (nome, idade, nota) value ("Pedrita", 8, 6.55);

 -- Select para notas maiores que 7
 
 select * from tb_alune where nota > 7;

 -- Select para notas menores que 7
 
select * from tb_alune where nota < 7;

-- Atualizando as informações
update tb_alune set nota = 10 where id =5;

select * from tb_alune;