-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24-Set-2022 às 17:03
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bdnp`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `id` bigint(20) NOT NULL,
  `valor` double DEFAULT NULL,
  `autor` varchar(255) DEFAULT NULL,
  `capa` varchar(255) DEFAULT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `editora` varchar(255) DEFAULT NULL,
  `qtd_pagina` varchar(5) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pedido`
--

INSERT INTO `pedido` (`id`, `valor`, `autor`, `capa`, `categoria`, `editora`, `qtd_pagina`, `titulo`) VALUES
(1, 49.99, 'Viola Davis', 'https://img.travessa.com.br/livro/BA/a8/a8f68ccd-52d9-47b3-9a72-ec85231a6dae.jpg', 'Biográfico', 'Best Seller', '390', 'EM BUSCA DE MIM - 1ªED.(2022)'),
(10, 33, 'Ivo Patarra', 'https://img.travessa.com.br/livro/BA/e5/e52d3cc1-026b-498a-aa64-1c98e5954f67.jpg', 'Comunicação', 'Historia Real', '500', '20 ANOS DE CORRUPÇAO: OS ESCANDALOS QUE...1ªED.(2022)'),
(11, 459, 'Mariana', 'https://img.travessa.com.br/livro/BA/e5/e52d3cc1-026b-498a-aa64-1c98e5954f67.jpg', 'Ciência de Dados', 'SENAC', '2450', 'teste');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
