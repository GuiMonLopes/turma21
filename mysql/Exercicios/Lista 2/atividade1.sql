
create database db_generation_game_online;

use db_generation_game_online;

-- Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos relevantes da classe.
 create table tb_classe(
 id bigint auto_increment,
 nome varchar (255) not null,
 bonus_classe varchar(255),
 magia boolean,
 primary key (id)
 );
 
 -- Crie uma tabela tb_personagem  e utilizando a habilidade de abstração e determine 5 atributos relevantes
 create table tb_personagem(
 id bigint auto_increment,
 nome varchar (255) not null,
 idade int,
 raca varchar(255),
 classe_id bigint not null,
 primary key(id),
 foreign key (classe_id) references tb_classe(id)
  );
  
  -- Popule esta tabela classe com até 5 dados.
  insert into tb_classe (nome,bonus_classe, magia) values ("Guerreiro", "Atk +1", false);
  insert into tb_classe (nome,bonus_classe, magia) values ("Mago", "ML +1", true);
  insert into tb_classe (nome,bonus_classe, magia) values ("Druida", "ML +1", true);
  insert into tb_classe (nome,bonus_classe, magia) values ("Ranger", "Destreza +1", false);
  insert into tb_classe (nome,bonus_classe, magia) values ("Clerigo", "Atk + 1", true);
  
  select * from tb_classe;
  
-- Popule esta tabela personagem com até 8 dados.
insert into tb_personagem (nome, idade, raca, classe_id) values ("João", 400, "Elfo", 2);
insert into tb_personagem (nome, idade, raca, classe_id) values ("Joana", 18, "Humano", 1);
insert into tb_personagem (nome, idade, raca, classe_id) values ("Marcelo", 30, "Orc", 5);
insert into tb_personagem (nome, idade, raca, classe_id) values ("Marcela", 25, "Humano", 4);
insert into tb_personagem (nome, idade, raca, classe_id) values ("Rafael", 500, "Elfo", 3);
insert into tb_personagem (nome, idade, raca, classe_id) values ("Rafaela", 40, "Humamo", 1);
insert into tb_personagem (nome, idade, raca, classe_id) values ("Pedro", 21, "Humamo", 2);
insert into tb_personagem (nome, idade, raca, classe_id) values ("Pamela", 600, "Elfo", 5);

select * from tb_personagem;

-- Faça um select  utilizando LIKE buscando os personagens com a letra C
select * from tb_personagem where tb_personagem.nome like "%C%";

-- Faça um um select com Inner join entre  tabela classe e personagem.
select * from tb_classe inner join tb_personagem on tb_personagem.classe_id = tb_classe.id;

-- Faça um select onde traga todos os personagem de uma classe específica

select tb_personagem.nome, tb_classe.nome, tb_personagem.raca 
from tb_classe 
inner join tb_personagem on tb_personagem.classe_id = tb_classe.id where tb_classe.nome like "%Mago%";
 
 