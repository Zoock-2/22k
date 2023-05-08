-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 08-Maio-2023 às 04:20
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
  `eMail` varchar(35) NOT NULL,
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
  `Semestre` int(4) NOT NULL,
  `disp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `Cadaluno`
--

INSERT INTO `Cadaluno` (`RGM`, `Nome`, `eMail`, `DataNascimento`, `Rua`, `Uf`, `Municipio`, `telefone`, `Cpf`, `Curso`, `Periodo`, `Turma`, `Campus`, `cep`, `Num`, `Complemento`, `Semestre`, `disp`) VALUES
(124780, 'Felipe Bomfim', 'Thezookcman@gmail', '2000-08-20', 'ihsfak', 'sp', 'São Paulo', '(11) 94568-6567', '125.710.835-71', 2, 3, 2, 1, '12471-987', '209', 'jahfdk', 1, 1),
(134698, 'jkadhfkj', 'khafihugo', '2000-08-28', 'klhfall', 'rj', 'Sampa', '(19) 24780-1274', '182.749.138-69', 2, 3, 1, 1, '19824-619', '109', 'Perto de algum lugar', 1, 1),
(30291778, 'LuizFelipe BOmfim', 'Thexkjik', '2000-03-15', 'jfdkslhfk', 'UU', 'São PAulo', '(28) 34792-8537', '   .   .   -  ', 1, 3, 3, 1, '12947-109', 'idbhfik', '1809', 0, 1),
(156898089, 'Felipe Bomfasss', '890357293fj', '2000-08-27', '390275ruefhdks', 'sp', 'sap', '(28) 35293-8572', '138.579.287-20', 2, 1, 2, 1, '12571-029', '39', 'djaehdf', 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Campus`
--

CREATE TABLE `Campus` (
  `Idcampus` int(11) NOT NULL,
  `Nome` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `Campus`
--

INSERT INTO `Campus` (`Idcampus`, `Nome`) VALUES
(1, 'Tatuapé'),
(2, 'Pinheiros'),
(3, 'Online');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Cursos`
--

CREATE TABLE `Cursos` (
  `Idcurso` int(11) NOT NULL,
  `Nome` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `Cursos`
--

INSERT INTO `Cursos` (`Idcurso`, `Nome`) VALUES
(1, 'ADS'),
(2, 'CC'),
(3, 'ES');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Disciplina`
--

CREATE TABLE `Disciplina` (
  `idDisciplina` int(11) NOT NULL,
  `Nome` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `Disciplina`
--

INSERT INTO `Disciplina` (`idDisciplina`, `Nome`) VALUES
(1, 'Poo'),
(2, 'Matematica Discreta');

-- --------------------------------------------------------

--
-- Estrutura da tabela `notas`
--

CREATE TABLE `notas` (
  `idnota` int(11) NOT NULL,
  `nota` float(5,2) NOT NULL,
  `data` date NOT NULL,
  `Rgm` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `periodos`
--

CREATE TABLE `periodos` (
  `idperiodo` int(11) NOT NULL,
  `periodo` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `periodos`
--

INSERT INTO `periodos` (`idperiodo`, `periodo`) VALUES
(1, 'Matutino'),
(2, 'Diurno'),
(3, 'Noturno');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Presença`
--

CREATE TABLE `Presença` (
  `presenca` varchar(10) NOT NULL DEFAULT 'Presente',
  `data` date NOT NULL,
  `Rgm` int(11) NOT NULL,
  `disciplina` int(11) NOT NULL,
  `curso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `Presença`
--

INSERT INTO `Presença` (`presenca`, `data`, `Rgm`, `disciplina`, `curso`) VALUES
('Presente', '2023-05-08', 124780, 1, 2),
('Presente', '2023-05-08', 124780, 1, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Semestre`
--

CREATE TABLE `Semestre` (
  `idSem` int(11) NOT NULL,
  `Sem` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `Semestre`
--

INSERT INTO `Semestre` (`idSem`, `Sem`) VALUES
(1, '1°'),
(2, '2°'),
(3, '3°'),
(4, '4°'),
(5, '5°'),
(6, '6°'),
(7, '7°'),
(8, '8°');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Turma`
--

CREATE TABLE `Turma` (
  `turmaId` int(11) NOT NULL,
  `Turma` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `Turma`
--

INSERT INTO `Turma` (`turmaId`, `Turma`) VALUES
(1, 'A'),
(2, 'B'),
(3, 'C'),
(4, 'D'),
(5, 'E');

-- --------------------------------------------------------

--
-- Estrutura da tabela `uf`
--

CREATE TABLE `uf` (
  `iduf` int(11) NOT NULL,
  `ufnome` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `uf`
--

INSERT INTO `uf` (`iduf`, `ufnome`) VALUES
(1, 'SP');

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
  ADD KEY `turma-id` (`Turma`),
  ADD KEY `disp` (`disp`) USING BTREE;

--
-- Índices para tabela `Campus`
--
ALTER TABLE `Campus`
  ADD PRIMARY KEY (`Idcampus`);

--
-- Índices para tabela `Cursos`
--
ALTER TABLE `Cursos`
  ADD PRIMARY KEY (`Idcurso`);

--
-- Índices para tabela `Disciplina`
--
ALTER TABLE `Disciplina`
  ADD PRIMARY KEY (`idDisciplina`);

--
-- Índices para tabela `notas`
--
ALTER TABLE `notas`
  ADD PRIMARY KEY (`idnota`),
  ADD UNIQUE KEY `Rgm` (`Rgm`);

--
-- Índices para tabela `periodos`
--
ALTER TABLE `periodos`
  ADD PRIMARY KEY (`idperiodo`);

--
-- Índices para tabela `Presença`
--
ALTER TABLE `Presença`
  ADD KEY `idcurso` (`curso`),
  ADD KEY `Rgm` (`Rgm`) USING BTREE,
  ADD KEY `disciplina` (`disciplina`) USING BTREE;

--
-- Índices para tabela `Semestre`
--
ALTER TABLE `Semestre`
  ADD PRIMARY KEY (`idSem`);

--
-- Índices para tabela `Turma`
--
ALTER TABLE `Turma`
  ADD PRIMARY KEY (`turmaId`);

--
-- Índices para tabela `uf`
--
ALTER TABLE `uf`
  ADD KEY `iduf` (`iduf`) USING BTREE;

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `Campus`
--
ALTER TABLE `Campus`
  MODIFY `Idcampus` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `Cursos`
--
ALTER TABLE `Cursos`
  MODIFY `Idcurso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `Disciplina`
--
ALTER TABLE `Disciplina`
  MODIFY `idDisciplina` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `notas`
--
ALTER TABLE `notas`
  MODIFY `idnota` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `periodos`
--
ALTER TABLE `periodos`
  MODIFY `idperiodo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `Semestre`
--
ALTER TABLE `Semestre`
  MODIFY `idSem` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `uf`
--
ALTER TABLE `uf`
  MODIFY `iduf` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `Cadaluno`
--
ALTER TABLE `Cadaluno`
  ADD CONSTRAINT `campusid` FOREIGN KEY (`Campus`) REFERENCES `Campus` (`Idcampus`),
  ADD CONSTRAINT `cursoid` FOREIGN KEY (`Curso`) REFERENCES `Cursos` (`Idcurso`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `dispip` FOREIGN KEY (`disp`) REFERENCES `Disciplina` (`idDisciplina`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `periodoid` FOREIGN KEY (`Periodo`) REFERENCES `periodos` (`idperiodo`),
  ADD CONSTRAINT `turma-id` FOREIGN KEY (`Turma`) REFERENCES `Turma` (`turmaId`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `notas`
--
ALTER TABLE `notas`
  ADD CONSTRAINT `rgm_id` FOREIGN KEY (`Rgm`) REFERENCES `Cadaluno` (`RGM`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `Presença`
--
ALTER TABLE `Presença`
  ADD CONSTRAINT `idcurso` FOREIGN KEY (`curso`) REFERENCES `Cursos` (`Idcurso`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `iddisciplina` FOREIGN KEY (`disciplina`) REFERENCES `Disciplina` (`idDisciplina`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idrgm` FOREIGN KEY (`Rgm`) REFERENCES `Cadaluno` (`RGM`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
