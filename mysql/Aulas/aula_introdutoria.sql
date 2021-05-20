-- Criar um banco de dados
create database db_quitanda;

-- Acessar o banco de dados
use db_quitanda;

-- cria tabela
create table tb_produtos(
id bigint auto_increment,
nome varchar(255),
preco float not null,
primary key (id)
);

-- busca dados
select * from tb_produtos;

-- insert
insert into tb_produtos (nome,preco) values ("laranja",2);

-- atualização
update tb_produtos set preco = 7 where id=4;

-- excluir
delete from tb_produtos where id=4;

-- Alterar tabela
alter table tb_produtos
add descricao varchar(255);

alter table tb_produtos change descricao descricao_produto varchar(255);

alter table tb_produtos
drop column descricao_produto;


