# Sistema de Gerenciamento Bancário

Este projeto em Java simula um sistema bancário simples que permite a criação e gerenciamento de contas correntes e contas poupança. O sistema permite operações básicas como depósitos, saques e transferências entre contas, e inclui uma estrutura para gerenciar clientes e suas respectivas contas.

## Estrutura do Projeto

### Classes e Interfaces

- **Banco**
  - Representa uma instituição bancária.
  - Armazena e gerencia uma lista de contas.
  - Métodos principais:
    - `adicionarConta(Conta conta)`: Adiciona uma conta à lista do banco.
    - `listarContas()`: Lista todos os extratos das contas no banco.

- **Conta**
  - Classe abstrata que define a estrutura básica de uma conta bancária.
  - Atributos:
    - `agencia`: Número da agência (fixo em 1).
    - `numero`: Número sequencial da conta.
    - `saldo`: Saldo atual da conta.
    - `cliente`: Cliente associado à conta.
  - Métodos principais:
    - `sacar(double valor)`: Realiza um saque na conta.
    - `depositar(double valor)`: Realiza um depósito na conta.
    - `transferir(double valor, Conta contaDestino)`: Transfere dinheiro para outra conta.
    - `imprimirExtrato()`: Imprime o extrato da conta.
    - `imprimirInfosComuns()`: Imprime informações comuns da conta.

- **ContaCorrente**
  - Extende a classe `Conta`.
  - Representa uma conta corrente.
  - Implementa o método `imprimirExtrato()` para exibir o extrato da conta corrente.

- **ContaPoupanca**
  - Extende a classe `Conta`.
  - Representa uma conta poupança.
  - Implementa o método `imprimirExtrato()` para exibir o extrato da conta poupança.

- **Cliente**
  - Representa um cliente do banco.
  - Atributos:
    - `nome`: Nome do cliente.
    - `contas`: Lista de contas associadas ao cliente.
  - Métodos principais:
    - `adicionarConta(Conta conta)`: Adiciona uma conta à lista de contas do cliente.
    - `listarContas()`: Lista todos os extratos das contas associadas ao cliente.

- **IConta**
  - Interface que define os métodos que devem ser implementados pelas classes de contas.
  - Métodos:
    - `sacar(double valor)`: Realiza um saque na conta.
    - `depositar(double valor)`: Realiza um depósito na conta.
    - `transferir(double valor, Conta contaDestino)`: Transfere dinheiro para outra conta.
    - `imprimirExtrato()`: Imprime o extrato da conta.

