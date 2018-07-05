create database Sistema;
use Sistema;
-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 13-Jun-2018 às 02:49
-- Versão do servidor: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
--
-- Database: 'sistema'
-- --------------------------------------------------------
-- Estrutura da tabela 'usuarios'
--
/*
CREATE TABLE usuarios (	//usar tabela abaixo
  id int(11) primary key auto_increment,
  nome varchar(50) NOT NULL,
  senha varchar(10) NOT NULL,
  usuario varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;*/
-- drop table usuarios;
--
-- Extraindo dados da tabela 'usuarios'

INSERT INTO usuarios (nome,senha,usuario) VALUES
('teste', 'teste', 'testeeee'),
('edson', '123', 'angoti'),
('cavanha', 'cavanha', 'cavanha');

select * from usuarios;
--
-- Indexes for dumped tables
--
-- Indexes for table 'usuarios'
--
-- ALTER TABLE usuarios
--  ADD PRIMARY KEY (id);
--
-- AUTO_INCREMENT for dumped tables
--
--
-- AUTO_INCREMENT for table 'usuarios'
--
-- ALTER TABLE usuarios
--  MODIFY id int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
-- COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

/*===============================================================================
  =	 					BANCO DE DADOS DO IGREJA ONLINE							=
  ===============================================================================
LOAD DATA local
	INFILE 'd:/teste/igreja.csv'
	INTO TABLE info_filme fields terminated by ';';*/

-- drop table usuarios;
CREATE TABLE usuarios (
	/*id int(11) primary key auto_increment,*/
	nome varchar(50) NOT NULL,
	usuario varchar(20) NOT NULL unique,
	senha varchar(10) NOT NULL,
	cpf char(11) primary key, /*NOT NULL UNIQUE,*/
    email varchar(30),
    endereco varchar(50),
    bairro varchar(30),
    telefone varchar(11),
    cargo varchar(20)
);
-- Alter table usuarios change usuario usuario varchar(20) NOT NULL unique;
select * from usuarios; 

Create table Igreja(
	cnpj char(15) Primary Key,
    nome varchar(50),
    endereco varchar(50),
    bairro varchar(30),
    telefone varchar(11)
);
select * from igreja;

-- drop table calendario;
Create table Calendario(
	cod_ca int Primary Key Auto_Increment,
    titulo varchar (30),
    data char(10),
    hora time,
    endereco varchar(50),/*alterar DIA para LOCAL*/
    bairro varchar(30),	
    cnpj char(15),
    Foreign Key (cnpj) References Igreja (cnpj)
);
select * from calendario;

-- drop table agenda;
Create table Agenda(
	cod_ag int Primary Key Auto_Increment,
    titulo varchar (30),
    data char(10),
    hora time, /*char(5),*/
	endereco varchar(50), /*ALTERAR TABELA ADD ENDEREÇO*/
    bairro varchar(30),
	cnpj char(15),
    Foreign Key (cnpj) References Igreja (cnpj)
);
select * from agenda;

-- Alter table Agenda     change data data char(10);
-- Alter table Calendario change data data char(10);
/*===============================================================================
  =	 					  INSERINDO DADOS PARA TESTE							=
  ===============================================================================*/

use Sistema;

INSERT INTO usuarios (nome,usuario,senha,cpf,email,endereco,bairro,telefone,cargo) VALUES
('Teste', 'teste', 'teste',	 '41234567185','teste@email.com','Rua 1 n 10','Centro','349123456','aaa'),
('Edson', 'angoti', 'angoti',		 '12345678901','angoti@email.com','Rua 2 n 20','Umuarama','3432131234','Professor'),
('Cavanha', 'cavanha', 'cavanha','03493757638','cavanhaman@hotmail.com','Rua Atilio Valentini','Santa Monica','992631234','Conselheiro UPA'),
('Rodrigo C. Baltazar','Conselheiro da UPA','eu','03412345678','cavanhaman@hotmail.com','Rua Atilio Valentini 1444','Santa Monica','3432218098'),
('Cavanha','Conselheiro UPA','cavanha','03493757638','cavanhaman@hotmail.com','Rua Atilio Valentini','Santa Monica','992631234');

INSERT INTO Igreja (cnpj,nome,endereco,bairro,telefone) VALUES
('17792169000124','Igreja Presbiteriana Central de Uberlândia','Av Floriano Peixoto, 364','Centro','3432353061'),
('17792169000125','Igrejaaaaa','afsafsafs','afsafsdf','23423423423'),
('17792169000128','Igreja dos Milagres nos Projetos Integradores','Rua 1 numero 2','Centro','3466666666'),
('18475384000164','SEGUNDA IGREJA PRESBITERIANA DE UBERLANDIA','R Angelo Zoccolli, 406','Centro','3432121234');

INSERT INTO Calendario (titulo,data,hora,endereco,bairro,cnpj) VALUES
('Culto','2021-12-18','19:00:00','adsfadsf','aaa','17792169000124'),
('Culto Legal 1','2018-11-10','18:00','Radfiasufsa','Bairro','17792169000124'),
('Culto Legal 2','2018-11-11','18:00','Radfiasufsa','Bairro','17792169000124'),
('Culto Legal 3','2018-11-12','18:00','Radfiasufsa','Bairro','17792169000124'),
('Culto Legal 4','2018-11-13','18:00','Radfiasufsa','Bairro','17792169000124'),
('Culto Legal 5','2018-11-14','18:00','Radfiasufsa','Bairro','17792169000124');

INSERT INTO Agenda(titulo,data,hora,endereco,bairro,cnpj) VALUES
('Cantata Coral','2018-08-18','18:00:00','Rua tal','seila','17792169000124'),
('TESTEEEE','2018-01-12','19:00:00','Rua Atilio Valentini 1444, 301','Centro','17792169000124'),
('IIIIIOOOOO','2018-12-25','18:00:00','Rua Atilio Valentini 1444, 301','teste','17792169000124'),
('Cantata do Shrek','2018-12-31','12:00:00','Praça em frente ao Pantano do Shrek','Pantanoso','17792169000124'),
('rrrrrrrrrrrr','1111-11-11','11:11:00','1111111111111111','11111111111','17792169000128'),
('Abobrinha','2018-12-15','14:00:00','casa','bairro','17792169000128'),
('Abobrinha','2018-12-15','14:00:00','casa','bairro','17792169000128');

select * from Calendario;

-- Update Calendario set data = '16/12/1976' where cod_ca = 8;

/*-------------------------------------------------------------------------------------*/
-- drop table pastor;
/*Create table Pastor(
	cod_pastor int Primary Key,
    cpf char(11),
    foreign key Pastor(cpf) references Usuarios(cpf)
);*/

/*Create table Entidade(
	cod_ent int Primary Key Auto_Increment,
    cnpj char(15),
	Foreign Key (cnpj) References Igreja (cnpj)
);*/
 -- drop table calendario_e;
/*Create table Calendario_E(
	cod_cae int Primary Key Auto_Increment,
	cod_ent int,
    cod_ca int,
	Foreign Key (cod_ent) References Entidade (cod_ent),
    Foreign Key (cod_ca) References Calendario (cod_ca)
);*/
/*Create table Agenda_E (
	cod_age int Primary Key Auto_Increment,
	cod_ent int,
    cod_ag int,
	Foreign Key (cod_ent) References Entidade (cod_ent),
    Foreign Key (cod_ag) References Agenda (cod_ag)
);*/
