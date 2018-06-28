-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 28-Jun-2018 às 12:36
-- Versão do servidor: 5.7.19
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `banco`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carrinho`
--

DROP TABLE IF EXISTS `carrinho`;
CREATE TABLE IF NOT EXISTS `carrinho` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  `valorTotal` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `carrinho`
--

INSERT INTO `carrinho` (`id`, `descricao`, `valorTotal`) VALUES
(7, 'Big bao + Ovo', '15.5'),
(8, 'Big bao + Queijo', '13.0'),
(9, 'Big bao + Queijo', '13.0'),
(10, 'Big bao + Queijo', '13.0');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) NOT NULL,
  `email` varchar(150) NOT NULL,
  `endereco` varchar(150) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `email`, `endereco`, `telefone`) VALUES
(1, '1000', '2', '300', '4'),
(9, '2', '2', '2', '2'),
(10, 'aaa', 'ww', 'qqq', '333'),
(11, '11111qq', 'ee', 'wwwe', 'rrr'),
(12, '2222', 'email', 'endereco', 'tel'),
(14, 'aaaaaa1111', '111', '22222111111', '111'),
(15, 'JU', 'JU', 'email', 'JU');

-- --------------------------------------------------------

--
-- Estrutura da tabela `dadospedido`
--

DROP TABLE IF EXISTS `dadospedido`;
CREATE TABLE IF NOT EXISTS `dadospedido` (
  `idDadosPedido` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `Lanche_idLanche` int(10) UNSIGNED NOT NULL,
  `Pedido_idPedido` int(10) UNSIGNED NOT NULL,
  `Quantidade` int(10) UNSIGNED DEFAULT NULL,
  PRIMARY KEY (`idDadosPedido`),
  KEY `DadosPedido_FKIndex1` (`Pedido_idPedido`),
  KEY `DadosPedido_FKIndex2` (`Lanche_idLanche`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `idFuncionario` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) DEFAULT NULL,
  `sobrenome` varchar(150) DEFAULT NULL,
  `status` varchar(50) NOT NULL,
  PRIMARY KEY (`idFuncionario`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`idFuncionario`, `nome`, `sobrenome`, `status`) VALUES
(13, 'Laura Silva', 'llll', 'Demitido'),
(16, 'Ana Carolyne', 'a', 'Cadastrado'),
(17, 'luiz', 'a', 'Cadastrado'),
(18, 'w', 'w', 'Cadastrado'),
(19, 'Ana', 'França', 'Cadastrado');

-- --------------------------------------------------------

--
-- Estrutura da tabela `lanche`
--

DROP TABLE IF EXISTS `lanche`;
CREATE TABLE IF NOT EXISTS `lanche` (
  `idLanche` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `Nome` char(1) DEFAULT NULL,
  `Descricao` char(1) DEFAULT NULL,
  `Preco` double DEFAULT NULL,
  PRIMARY KEY (`idLanche`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

DROP TABLE IF EXISTS `pedido`;
CREATE TABLE IF NOT EXISTS `pedido` (
  `idPedido` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `Funcionario_idFuncionario` int(10) UNSIGNED NOT NULL,
  `dadosCliente_iddadosCliente` int(10) UNSIGNED NOT NULL,
  `ValorTotal` double DEFAULT NULL,
  PRIMARY KEY (`idPedido`),
  KEY `Pedido_FKIndex1` (`dadosCliente_iddadosCliente`),
  KEY `Pedido_FKIndex2` (`Funcionario_idFuncionario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
