-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 19-Dez-2017 às 17:43
-- Versão do servidor: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sisvendas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `caixa`
--

CREATE TABLE `caixa` (
  `CODIGO` int(10) UNSIGNED NOT NULL,
  `DINHEIRO` float NOT NULL DEFAULT '0',
  `CHEQUE` float NOT NULL DEFAULT '0',
  `CARTAO` float NOT NULL DEFAULT '0',
  `VALE` float NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `caixa`
--

INSERT INTO `caixa` (`CODIGO`, `DINHEIRO`, `CHEQUE`, `CARTAO`, `VALE`) VALUES
(1, 2623.76, 577.4, 32.55, 114.06);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cidade`
--

CREATE TABLE `cidade` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(50) CHARACTER SET latin1 NOT NULL,
  `fk_cod_estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cidade`
--

INSERT INTO `cidade` (`codigo`, `nome`, `fk_cod_estado`) VALUES
(1, 'Ubá', 11),
(2, 'Tocantins', 11),
(3, 'Vicosa', 11);

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `ENDERECO` varchar(255) DEFAULT NULL,
  `BAIRRO` varchar(60) DEFAULT NULL,
  `COD_CIDADE` int(11) DEFAULT NULL,
  `COD_ESTADO` int(11) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `TELEFONE` varchar(20) DEFAULT NULL,
  `CPF_CNPJ` varchar(100) CHARACTER SET utf8 NOT NULL,
  `OBSERVACAO` varchar(300) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`CODIGO`, `NOME`, `ENDERECO`, `BAIRRO`, `COD_CIDADE`, `COD_ESTADO`, `CEP`, `TELEFONE`, `CPF_CNPJ`, `OBSERVACAO`) VALUES
(1, 'BALCAO', 'RUA 1', 'CENTRO', 1, 11, '000', '0000000000', '000.000.000-00', 'teste da observação'),
(2, 'JOÃO ALFREDO DA SILVA', 'RUA: PEDRO BOTARO, 100', 'CENTRO', 1, 11, '36500-000', '(32) 3531-9999', '000.000.000-00', 'testando 1'),
(3, 'MARIA DA SILVA FREITAS', 'RUA: MATIAS BARBOSA, 35', 'SANTANA', 2, 11, '36750-000', '(32)3531-0000', '000.000.000-00', 'obra 2'),
(4, 'FERNANDO DA SILVA', 'RUA: DEODORO, 222', 'CENTRO', 1, 11, '36500-000', '323531-0000', '000.000.000-00', 'obra 3');

-- --------------------------------------------------------

--
-- Estrutura da tabela `compras`
--

CREATE TABLE `compras` (
  `CODIGO` bigint(20) UNSIGNED NOT NULL,
  `VALOR_TOTAL` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `compras`
--

INSERT INTO `compras` (`CODIGO`, `VALOR_TOTAL`) VALUES
(1, 6);

-- --------------------------------------------------------

--
-- Estrutura da tabela `compras_produtos`
--

CREATE TABLE `compras_produtos` (
  `CODIGO` bigint(20) UNSIGNED NOT NULL,
  `COD_COMPRAS` int(11) NOT NULL,
  `COD_PRODUTO` int(11) NOT NULL,
  `VALOR_CUSTO` double NOT NULL,
  `VALOR_VENDA` double NOT NULL,
  `QUANTIDADE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `compras_produtos`
--

INSERT INTO `compras_produtos` (`CODIGO`, `COD_COMPRAS`, `COD_PRODUTO`, `VALOR_CUSTO`, `VALOR_VENDA`, `QUANTIDADE`) VALUES
(6, 1, 0, 1, 1, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `contas_pagar`
--

CREATE TABLE `contas_pagar` (
  `PK_CODIGO` int(10) NOT NULL,
  `FK_CODIGO_PESSOA` int(10) NOT NULL,
  `DESCRICAO` varchar(500) NOT NULL,
  `DATA` date NOT NULL,
  `VENCIMENTO` date NOT NULL,
  `FK_TIPO_PAGAMENTO` int(11) NOT NULL,
  `OBSERVACAO` varchar(500) NOT NULL,
  `SITUACAO` smallint(1) NOT NULL,
  `VALOR` float NOT NULL,
  `PAGAMENTO` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `contas_pagar`
--

INSERT INTO `contas_pagar` (`PK_CODIGO`, `FK_CODIGO_PESSOA`, `DESCRICAO`, `DATA`, `VENCIMENTO`, `FK_TIPO_PAGAMENTO`, `OBSERVACAO`, `SITUACAO`, `VALOR`, `PAGAMENTO`) VALUES
(1, 1, 'conta de luz', '2014-10-16', '2014-10-16', 1, '', 1, 50, '2014-10-16'),
(2, 1, 'suporte remoto', '2014-10-16', '2014-10-16', 1, 'teste', 1, 250, '2014-10-16'),
(3, 1, 'CONTA TELEFONE FIXO', '2014-10-17', '2014-10-17', 1, 'teste', 0, 28.9, '2014-10-17'),
(4, 1, 'conta teste', '2015-03-03', '2015-03-03', 1, '', 1, 150, '2015-03-03'),
(5, 1, 'CONTA TESTE 2', '2015-03-03', '2015-03-03', 1, '', 0, 325, '2015-03-03'),
(6, 1, 'teste', '2017-12-18', '2017-12-18', 1, '', 1, 100, '2017-12-18');

-- --------------------------------------------------------

--
-- Estrutura da tabela `contas_receber`
--

CREATE TABLE `contas_receber` (
  `PK_CODIGO` int(10) NOT NULL,
  `FK_CODIGO_PESSOA` int(10) NOT NULL,
  `DESCRICAO` varchar(500) NOT NULL,
  `DATA` date NOT NULL,
  `VENCIMENTO` date NOT NULL,
  `FK_TIPO_PAGAMENTO` int(11) NOT NULL,
  `OBSERVACAO` varchar(500) NOT NULL,
  `SITUACAO` smallint(1) NOT NULL,
  `VALOR` float NOT NULL,
  `PAGAMENTO` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `contas_receber`
--

INSERT INTO `contas_receber` (`PK_CODIGO`, `FK_CODIGO_PESSOA`, `DESCRICAO`, `DATA`, `VENCIMENTO`, `FK_TIPO_PAGAMENTO`, `OBSERVACAO`, `SITUACAO`, `VALOR`, `PAGAMENTO`) VALUES
(1, 3, 'FORMATAÇÃO COMPUTADOR', '2014-10-16', '2014-10-16', 1, '', 1, 90, '2014-10-16'),
(2, 1, 'PLACA DE VIDEO', '2014-10-16', '2014-10-16', 1, '', 1, 230, '2014-10-16'),
(3, 2, 'MOUSE USB SEM FIO', '2014-10-16', '2014-10-16', 1, '', 1, 21.9, '2014-10-16'),
(4, 1, 'conta celular', '2014-10-17', '2014-10-17', 1, 'teste da obs', 1, 180, '2017-12-18');

-- --------------------------------------------------------

--
-- Estrutura da tabela `empresa`
--

CREATE TABLE `empresa` (
  `CODIGO` int(10) UNSIGNED NOT NULL,
  `RAZAO_SOCIAL` varchar(300) NOT NULL,
  `NOME_FANTASIA` varchar(300) NOT NULL,
  `ENDERECO` varchar(300) NOT NULL,
  `BAIRRO` varchar(300) NOT NULL,
  `COD_CIDADE` int(10) UNSIGNED NOT NULL,
  `COD_ESTADO` int(10) UNSIGNED NOT NULL,
  `CEP` varchar(30) NOT NULL,
  `TELEFONE` varchar(30) NOT NULL,
  `CNPJ` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `empresa`
--

INSERT INTO `empresa` (`CODIGO`, `RAZAO_SOCIAL`, `NOME_FANTASIA`, `ENDERECO`, `BAIRRO`, `COD_CIDADE`, `COD_ESTADO`, `CEP`, `TELEFONE`, `CNPJ`) VALUES
(1, 'PEG E PAGA DO JOSE DIAS ME', 'PEG E PAGA DO JOSE DIAS', 'RUA: 15 DE NOVEMBRO, 111', 'CENTRO', 1, 11, '36500-000', '(32)3531-0000', '000.000/0001-09');

-- --------------------------------------------------------

--
-- Estrutura da tabela `estado`
--

CREATE TABLE `estado` (
  `codigo` int(11) NOT NULL,
  `uf` varchar(2) CHARACTER SET utf8 NOT NULL,
  `nome` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `estado`
--

INSERT INTO `estado` (`codigo`, `uf`, `nome`) VALUES
(1, 'AC', 'Acre'),
(2, 'AL', 'Alagoas'),
(3, 'AM', 'Amazonas'),
(4, 'AP', 'Amapá'),
(5, 'BA', 'Bahia'),
(6, 'CE', 'Ceará'),
(7, 'DF', 'Distrito Federal'),
(8, 'ES', 'Espírito Santo'),
(9, 'GO', 'Goiás'),
(10, 'MA', 'Maranhão'),
(11, 'MG', 'Minas Gerais'),
(12, 'MS', 'Mato Grosso do Sul'),
(13, 'MT', 'Mato Grosso'),
(14, 'PA', 'Pará'),
(15, 'PB', 'Paraíba'),
(16, 'PE', 'Pernambuco'),
(17, 'PI', 'Piauí'),
(18, 'PR', 'Paraná'),
(19, 'RJ', 'Rio de Janeiro'),
(20, 'RN', 'Rio Grande do Norte'),
(21, 'RO', 'Rondônia'),
(22, 'RR', 'Roraima'),
(23, 'RS', 'Rio Grande do Sul'),
(24, 'SC', 'Santa Catarina'),
(25, 'SE', 'Sergipe'),
(26, 'SP', 'São Paulo'),
(27, 'TO', 'Tocantins');

-- --------------------------------------------------------

--
-- Estrutura da tabela `forma_pagamento`
--

CREATE TABLE `forma_pagamento` (
  `codigo` int(10) UNSIGNED NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `desconto` float NOT NULL,
  `quantidade_parcelas` int(11) NOT NULL,
  `observacao` varchar(300) CHARACTER SET utf8 NOT NULL,
  `situacao` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `forma_pagamento`
--

INSERT INTO `forma_pagamento` (`codigo`, `descricao`, `desconto`, `quantidade_parcelas`, `observacao`, `situacao`) VALUES
(1, 'A VISTA', 0, 0, 'PAGAMENTO A VISTA', 1),
(2, 'CARTÃO 30/60 DIAS', 0, 0, '', 1),
(3, 'CARTÃO 30/60/90 DIAS', 0, 0, '', 1),
(4, 'CARTÃO 30/60/90/120 DIAS', 0, 0, '', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedores`
--

CREATE TABLE `fornecedores` (
  `CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `ENDERECO` varchar(255) DEFAULT NULL,
  `BAIRRO` varchar(60) DEFAULT NULL,
  `COD_CIDADE` int(11) DEFAULT NULL,
  `COD_ESTADO` int(11) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `TELEFONE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fornecedores`
--

INSERT INTO `fornecedores` (`CODIGO`, `NOME`, `ENDERECO`, `BAIRRO`, `COD_CIDADE`, `COD_ESTADO`, `CEP`, `TELEFONE`) VALUES
(1, 'FD FORNECEDORES LTDA', 'RUA 2', 'CENTRO 2', 1, 11, '234', '234234'),
(2, 'ENERGISA MG DISTRIBUIDORA DE ENERGIA SA', 'centro', 'rua das neves, 000', 2, 11, '36500-000', '(32)3531-0000');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `CODIGO` int(11) NOT NULL,
  `FORNECEDORES_CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `VALOR` double DEFAULT NULL,
  `VALOR_CUSTO` double NOT NULL DEFAULT '0',
  `ESTOQUE` float DEFAULT NULL,
  `CODIGO_BARRAS` varchar(100) DEFAULT '0',
  `UNIDADE_MEDIDA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`CODIGO`, `FORNECEDORES_CODIGO`, `NOME`, `VALOR`, `VALOR_CUSTO`, `ESTOQUE`, `CODIGO_BARRAS`, `UNIDADE_MEDIDA`) VALUES
(1, 1, 'Fubá Da Roça', 1.5, 1, 1, '1', 1),
(2, 1, 'Arroz Tio João', 9.5, 8, 8, '2', 1),
(3, 1, 'Fermento em Pó Bicalho', 3.8, 0, 11, '3', 1),
(4, 1, 'Açucar União pacote 5kg', 6.4, 0, 13, '4', 1),
(5, 1, 'Café Negão 500g', 5.8, 0, 2, '5', 2),
(6, 1, 'Farinha de Trigo', 1, 0, 3, '6', 1),
(7, 1, 'SUCO DE UVA TIAL', 1.99, 0, 1, '7', 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_usuarios`
--

CREATE TABLE `tbl_usuarios` (
  `pk_codigo` int(10) UNSIGNED NOT NULL,
  `nome` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbl_usuarios`
--

INSERT INTO `tbl_usuarios` (`pk_codigo`, `nome`, `login`, `senha`) VALUES
(1, 'ADMINISTRADOR', 'admin', '123'),
(3, 'LEANDRO', 'le', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `unidade_medida`
--

CREATE TABLE `unidade_medida` (
  `codigo` bigint(20) UNSIGNED NOT NULL,
  `abreviacao` varchar(5) CHARACTER SET utf8 DEFAULT NULL,
  `descricao` varchar(100) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `unidade_medida`
--

INSERT INTO `unidade_medida` (`codigo`, `abreviacao`, `descricao`) VALUES
(1, 'KG', 'Quilograma'),
(2, 'G', 'Grama'),
(4, 'L', 'Litro'),
(5, 'UN', 'Unidade');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario_permissao`
--

CREATE TABLE `usuario_permissao` (
  `pk_codigo` int(10) UNSIGNED NOT NULL,
  `fk_codigo_usuario` int(10) UNSIGNED NOT NULL,
  `permissao` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario_permissao`
--

INSERT INTO `usuario_permissao` (`pk_codigo`, `fk_codigo_usuario`, `permissao`) VALUES
(32, 0, 'null'),
(111, 1, 'cliente'),
(112, 1, 'produto'),
(113, 1, 'fornecedor'),
(114, 1, 'usuario'),
(115, 1, 'venda'),
(116, 1, 'pagar'),
(117, 1, 'receber'),
(118, 1, 'empresa'),
(119, 1, 'fornecedor'),
(120, 1, 'cidade'),
(121, 1, 'unidade'),
(122, 1, 'pagamento'),
(123, 1, 'orcamento'),
(124, 1, 'caixa'),
(125, 4, 'cliente'),
(126, 4, 'produto'),
(127, 4, 'usuario'),
(128, 4, 'venda'),
(129, 4, 'pagar'),
(130, 4, 'receber'),
(131, 4, 'empresa'),
(132, 1, 'compras'),
(133, 3, 'cliente'),
(134, 3, 'produto'),
(135, 3, 'fornecedor'),
(136, 3, 'venda'),
(137, 3, 'orcamento');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `CODIGO` int(11) NOT NULL,
  `CLIENTES_CODIGO` int(11) NOT NULL,
  `DATA_VENDA` date DEFAULT NULL,
  `VALOR_TOTAL` float DEFAULT NULL,
  `DESCONTO` float DEFAULT NULL,
  `TIPO_PAGAMENTO` int(10) UNSIGNED DEFAULT '1',
  `TIPO` tinyint(1) NOT NULL,
  `OBSERVACAO` varchar(2000) CHARACTER SET utf8 NOT NULL DEFAULT ' '
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas_produto`
--

CREATE TABLE `vendas_produto` (
  `CODIGO` int(11) NOT NULL,
  `CODIGO_PRODUTO` int(11) DEFAULT NULL,
  `CODIGO_VENDA` int(11) DEFAULT NULL,
  `QUANTIDADE` float DEFAULT NULL,
  `VALOR_UNITARIO` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `caixa`
--
ALTER TABLE `caixa`
  ADD PRIMARY KEY (`CODIGO`) USING BTREE;

--
-- Indexes for table `cidade`
--
ALTER TABLE `cidade`
  ADD PRIMARY KEY (`codigo`),
  ADD UNIQUE KEY `codigo` (`codigo`),
  ADD KEY `FK_cidades_1` (`fk_cod_estado`);

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `compras`
--
ALTER TABLE `compras`
  ADD UNIQUE KEY `CODIGO` (`CODIGO`);

--
-- Indexes for table `compras_produtos`
--
ALTER TABLE `compras_produtos`
  ADD PRIMARY KEY (`CODIGO`),
  ADD UNIQUE KEY `CODIGO` (`CODIGO`);

--
-- Indexes for table `contas_pagar`
--
ALTER TABLE `contas_pagar`
  ADD PRIMARY KEY (`PK_CODIGO`);

--
-- Indexes for table `contas_receber`
--
ALTER TABLE `contas_receber`
  ADD PRIMARY KEY (`PK_CODIGO`);

--
-- Indexes for table `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `forma_pagamento`
--
ALTER TABLE `forma_pagamento`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `fornecedores`
--
ALTER TABLE `fornecedores`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`CODIGO`),
  ADD KEY `FK_produtos_1` (`FORNECEDORES_CODIGO`);

--
-- Indexes for table `tbl_usuarios`
--
ALTER TABLE `tbl_usuarios`
  ADD PRIMARY KEY (`pk_codigo`);

--
-- Indexes for table `unidade_medida`
--
ALTER TABLE `unidade_medida`
  ADD PRIMARY KEY (`codigo`),
  ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indexes for table `usuario_permissao`
--
ALTER TABLE `usuario_permissao`
  ADD PRIMARY KEY (`pk_codigo`);

--
-- Indexes for table `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`CODIGO`),
  ADD KEY `FK_vendas_1` (`CLIENTES_CODIGO`);

--
-- Indexes for table `vendas_produto`
--
ALTER TABLE `vendas_produto`
  ADD PRIMARY KEY (`CODIGO`),
  ADD KEY `FK_vendas_produto_1` (`CODIGO_PRODUTO`),
  ADD KEY `FK_vendas_produto_2` (`CODIGO_VENDA`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `caixa`
--
ALTER TABLE `caixa`
  MODIFY `CODIGO` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `cidade`
--
ALTER TABLE `cidade`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `compras`
--
ALTER TABLE `compras`
  MODIFY `CODIGO` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `compras_produtos`
--
ALTER TABLE `compras_produtos`
  MODIFY `CODIGO` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `contas_pagar`
--
ALTER TABLE `contas_pagar`
  MODIFY `PK_CODIGO` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `contas_receber`
--
ALTER TABLE `contas_receber`
  MODIFY `PK_CODIGO` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `empresa`
--
ALTER TABLE `empresa`
  MODIFY `CODIGO` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `estado`
--
ALTER TABLE `estado`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT for table `forma_pagamento`
--
ALTER TABLE `forma_pagamento`
  MODIFY `codigo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `fornecedores`
--
ALTER TABLE `fornecedores`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `tbl_usuarios`
--
ALTER TABLE `tbl_usuarios`
  MODIFY `pk_codigo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `unidade_medida`
--
ALTER TABLE `unidade_medida`
  MODIFY `codigo` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `usuario_permissao`
--
ALTER TABLE `usuario_permissao`
  MODIFY `pk_codigo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=138;
--
-- AUTO_INCREMENT for table `vendas`
--
ALTER TABLE `vendas`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `vendas_produto`
--
ALTER TABLE `vendas_produto`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `cidade`
--
ALTER TABLE `cidade`
  ADD CONSTRAINT `FK_cidades_1` FOREIGN KEY (`fk_cod_estado`) REFERENCES `estado` (`codigo`);

--
-- Limitadores para a tabela `produtos`
--
ALTER TABLE `produtos`
  ADD CONSTRAINT `FK_produtos_1` FOREIGN KEY (`FORNECEDORES_CODIGO`) REFERENCES `fornecedores` (`CODIGO`);

--
-- Limitadores para a tabela `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `FK_vendas_1` FOREIGN KEY (`CLIENTES_CODIGO`) REFERENCES `clientes` (`CODIGO`);

--
-- Limitadores para a tabela `vendas_produto`
--
ALTER TABLE `vendas_produto`
  ADD CONSTRAINT `FK_vendas_produto_1` FOREIGN KEY (`CODIGO_PRODUTO`) REFERENCES `produtos` (`CODIGO`),
  ADD CONSTRAINT `FK_vendas_produto_2` FOREIGN KEY (`CODIGO_VENDA`) REFERENCES `vendas` (`CODIGO`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
