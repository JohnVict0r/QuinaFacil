create database QuinaFacil;
use QuinaFacil;

create table concurso (
codConcurso int auto_increment,
numeroConcurso varchar(12) not null unique,
primary key (codConcurso)
);

select * from concurso;
select * from aposta;
drop table concurso;
drop table aposta;
SELECT * FROM concurso WHERE numeroConcurso = ?;
SELECT * FROM concurso ORDER BY codConcurso ASC;
SELECT * FROM concurso WHERE numeroConcurso = 4422;
SELECT a.*, c.* FROM aposta a INNER JOIN concurso c ON(a.concurso = c.codConcurso);


create table aposta (
codAposta int auto_increment,
concurso int not null,
nomeApostador varchar(100) not null,
valorAposta decimal(10,2) not null,
premio decimal (10,2) not null,
dataAposta date not null,
numero1 int not null,
numero2 int not null,
numero3 int not null,
numero4 int not null,
numero5 int not null,
numero6 int not null,
numero7 int not null,
numero8 int not null,
numero9 int not null,
numero10 int not null,
numero11 int not null,
numero12 int not null,
numero13 int not null,
numero14 int not null,
numero15 int not null,
numero16 int not null,
numero17 int not null,
numero18 int not null,
numero19 int not null,
numero20 int not null,
numero21 int not null,
numero22 int not null,
numero23 int not null,
numero24 int not null,
numero25 int not null,
numero26 int not null,
numero27 int not null,
numero28 int not null,
numero29 int not null,
numero30 int not null,
primary key(codAposta),
foreign key(concurso) references concurso(codConcurso)
);