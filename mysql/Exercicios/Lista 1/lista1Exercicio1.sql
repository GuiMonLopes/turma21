-- Criação do banco de dados
create database db_funcionarios;
-- Acessando o banco de dados
use db_funcionarios;
-- Criando a tabela funcionario
 create table tb_funcionario(
 id bigint auto_increment,
 nome varchar (255),
 salario double (20,2),
 primary key(id),
 departamento varchar(255),
 matricula int(10) 
 );
 
 -- Incluindo os daos na tabela funcionario
 insert into tb_funcionario (nome,salario) values ("Joana", 2000.00);
 insert into tb_funcionario (nome,salario) values ("João", 2000.00);
 insert into tb_funcionario (nome,salario) values ("Marcelo", 3000.00);
 insert into tb_funcionario (nome,salario) values ("Marcela", 4000.00);
 insert into tb_funcionario (nome,salario) values ("Danieli", 5000.00);
 
 -- Select para salarios maiores que R$ 2000.00
 select * from tb_funcionario where salario >=2000;
 
  -- Select para salarios menor que R$ 2000.00
   select * from tb_funcionario where salario <=2000;
   
   -- Atualizando as informações
   update tb_funcionario set nome = "Roberto", salario = 1000.00 where id = 3;
   
   select * from tb_funcionario;
   
   
 