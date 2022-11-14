/*Script para criação do banco de dados e tabelas
Só é possível executar uma única vez, depois de criado não se
cria objetos com mesmo nome.
Se precisar criar novamente tem que apagar o anterior
Apagar Banco de Dados: DROP DATABASE sistema_vendas;
*/
/*Criando banco de dados sistema_vendas*/
CREATE DATABASE IF NOT EXISTS sistema_vendas;

/*Criando tabela cliente no banco de dados sistema_vendas*/
CREATE TABLE IF NOT EXISTS `sistema_vendas`.`Cliente` (
  `cod_cliente` INT NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `endereco` VARCHAR(150) NOT NULL,
  `cidade` VARCHAR(100) NOT NULL,
  `cep` DECIMAL NULL,
  `uf` CHAR(2) NOT NULL,
  `cnpj` VARCHAR(16) NOT NULL,
  `ie` INT NULL,
  PRIMARY KEY (`cod_cliente`))
ENGINE = InnoDB;

/*Criando tabela vendedor no banco de dados sistema_vendas*/
CREATE TABLE IF NOT EXISTS `sistema_vendas`.`vendedor` (
  `cod_vendedor` INT NOT NULL,
  `nome` VARCHAR(100) NULL,
  `salario` FLOAT NULL,
  `faixa_comissao` CHAR(1) NULL,
  PRIMARY KEY (`cod_vendedor`))
ENGINE = InnoDB;

/*Criando tabela produto no banco de dados sistema_vendas*/
CREATE TABLE IF NOT EXISTS `sistema_vendas`.`produto` (
  `cod_produto` INT NOT NULL,
  `unidade` VARCHAR(10) NULL,
  `descricao` VARCHAR(200) NULL,
  `valor` FLOAT NULL,
  PRIMARY KEY (`cod_produto`))
ENGINE = InnoDB;

/*Criando tabela pedido no banco de dados sistema_vendas*/
CREATE TABLE IF NOT EXISTS `sistema_vendas`.`pedido` (
  `numero` DECIMAL NOT NULL,
  `prazo_entrega` DECIMAL NULL,
  `cod_cliente` INT NOT NULL,
  `cod_vendedor` INT NOT NULL,
  PRIMARY KEY (`numero`),
  INDEX `fk_Pedido_Cliente_idx` (`cod_cliente` ASC) VISIBLE,
  INDEX `fk_Pedido_Vendedor1_idx` (`cod_vendedor` ASC) VISIBLE,
  CONSTRAINT `fk_Pedido_Cliente`
    FOREIGN KEY (`cod_cliente`)
    REFERENCES `sistema_vendas`.`Cliente` (`cod_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Vendedor1`
    FOREIGN KEY (`cod_vendedor`)
    REFERENCES `sistema_vendas`.`Vendedor` (`cod_vendedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

/*Criando tabela item_pedido no banco de dados sistema_vendas*/
CREATE TABLE IF NOT EXISTS `sistema_vendas`.`item_pedido` (
  `numero_pedido` DECIMAL NOT NULL,
  `cod_produto` INT NOT NULL,
  `quantidade` VARCHAR(45) NULL,
  PRIMARY KEY (`numero_pedido`, `cod_produto`),
  INDEX `fk_Pedido_has_Produto_Produto1_idx` (`cod_produto` ASC) VISIBLE,
  INDEX `fk_Pedido_has_Produto_Pedido1_idx` (`numero_pedido` ASC) VISIBLE,
  CONSTRAINT `fk_Pedido_has_Produto_Pedido1`
    FOREIGN KEY (`numero_pedido`)
    REFERENCES `sistema_vendas`.`Pedido` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_has_Produto_Produto1`
    FOREIGN KEY (`cod_produto`)
    REFERENCES `sistema_vendas`.`Produto` (`cod_produto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;