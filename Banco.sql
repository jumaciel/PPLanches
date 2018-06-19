CREATE TABLE dadosCliente (
  iddadosCliente INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  endereco CHAR NULL,
  telefone INTEGER UNSIGNED NULL,
  email CHAR NULL,
  PRIMARY KEY(iddadosCliente)
);

CREATE TABLE DadosPedido (
  idDadosPedido INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Lanche_idLanche INTEGER UNSIGNED NOT NULL,
  Pedido_idPedido INTEGER UNSIGNED NOT NULL,
  Quantidade INTEGER UNSIGNED NULL,
  PRIMARY KEY(idDadosPedido),
  INDEX DadosPedido_FKIndex1(Pedido_idPedido),
  INDEX DadosPedido_FKIndex2(Lanche_idLanche)
);

CREATE TABLE Funcionario (
  idFuncionario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Nome CHAR NULL,
  email CHAR NULL,
  PRIMARY KEY(idFuncionario)
);

CREATE TABLE Lanche (
  idLanche INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Nome CHAR NULL,
  Descricao CHAR NULL,
  Preco DOUBLE NULL,
  PRIMARY KEY(idLanche)
);

CREATE TABLE Pedido (
  idPedido INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Funcionario_idFuncionario INTEGER UNSIGNED NOT NULL,
  dadosCliente_iddadosCliente INTEGER UNSIGNED NOT NULL,
  ValorTotal DOUBLE NULL,
  PRIMARY KEY(idPedido),
  INDEX Pedido_FKIndex1(dadosCliente_iddadosCliente),
  INDEX Pedido_FKIndex2(Funcionario_idFuncionario)
);


