-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 07-Maio-2023 às 18:21
-- Versão do servidor: 10.4.28-MariaDB
-- versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `Alunos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `Cadaluno`
--

CREATE TABLE `Cadaluno` (
  `RGM` int(10) NOT NULL,
  `Nome` varchar(30) NOT NULL,
  `eMail` varchar(20) NOT NULL,
  `DataNascimento` date DEFAULT NULL,
  `Rua` varchar(30) DEFAULT NULL,
  `Uf` varchar(3) DEFAULT NULL,
  `Municipio` varchar(35) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `Cpf` varchar(20) DEFAULT NULL,
  `Curso` int(11) NOT NULL DEFAULT 1,
  `Periodo` int(11) NOT NULL DEFAULT 1,
  `Turma` int(11) NOT NULL DEFAULT 1,
  `Campus` int(11) NOT NULL DEFAULT 1,
  `cep` varchar(12) DEFAULT NULL,
  `Num` varchar(20) NOT NULL,
  `Complemento` text DEFAULT NULL,
  `Semestre` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `Cadaluno`
--

INSERT INTO `Cadaluno` (`RGM`, `Nome`, `eMail`, `DataNascimento`, `Rua`, `Uf`, `Municipio`, `telefone`, `Cpf`, `Curso`, `Periodo`, `Turma`, `Campus`, `cep`, `Num`, `Complemento`, `Semestre`) VALUES
(134698, 'jkadhfkj', 'khafihugo', '2000-08-28', 'klhfall', '1', 'Sampa', '(19) 24780-1274', '182.749.138-69', 2, 3, 1, 1, '19824-619', '109', 'Perto de algum lugar', 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `Cadaluno`
--
ALTER TABLE `Cadaluno`
  ADD PRIMARY KEY (`RGM`) USING BTREE,
  ADD UNIQUE KEY `RGM_2` (`RGM`) USING BTREE,
  ADD UNIQUE KEY `Cpf` (`Cpf`),
  ADD KEY `Uf` (`Uf`) USING BTREE,
  ADD KEY `CursoId` (`Curso`) USING BTREE,
  ADD KEY `campusid` (`Campus`),
  ADD KEY `Periodo` (`Periodo`) USING BTREE,
  ADD KEY `Semestre` (`Semestre`),
  ADD KEY `turma-id` (`Turma`);

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `Cadaluno`
--
ALTER TABLE `Cadaluno`
  ADD CONSTRAINT `campusid` FOREIGN KEY (`Campus`) REFERENCES `Campus` (`Idcampus`),
  ADD CONSTRAINT `cursoid` FOREIGN KEY (`Curso`) REFERENCES `Cursos` (`Idcurso`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `periodoid` FOREIGN KEY (`Periodo`) REFERENCES `periodos` (`idperiodo`),
  ADD CONSTRAINT `turma-id` FOREIGN KEY (`Turma`) REFERENCES `Turma` (`turmaId`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
