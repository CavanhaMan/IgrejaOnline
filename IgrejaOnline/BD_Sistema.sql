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
-- Database: `sistema`
-- --------------------------------------------------------
-- Estrutura da tabela `usuarios`
--

CREATE TABLE usuarios (
  id int(11) primary key auto_increment,
  nome varchar(50) NOT NULL,
  senha varchar(10) NOT NULL,
  usuario varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
-- drop table usuarios;
--
-- Extraindo dados da tabela `usuarios`

INSERT INTO usuarios (id,nome,senha,usuario) VALUES
(1, 'teste2', 'teste', ''),
(2, 'edson', '123', 'angoti');

INSERT INTO usuarios (id,nome,senha,usuario) VALUES
(3, 'cavanha', 'cavanha', 'cavanha');

select * from usuarios;
--
-- Indexes for dumped tables
--
-- Indexes for table `usuarios`
--
-- ALTER TABLE usuarios
--  ADD PRIMARY KEY (id);
--
-- AUTO_INCREMENT for dumped tables
--
--
-- AUTO_INCREMENT for table `usuarios`
--
-- ALTER TABLE usuarios
--  MODIFY id int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
-- COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;