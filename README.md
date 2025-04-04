# 🏦 Simulador de Conta Bancária no Terminal

Este projeto consiste em um **simulador de conta bancária**, desenvolvido em Java para rodar no terminal. O usuário informa seus dados pessoais e realiza um **depósito inicial**, recebendo de volta uma mensagem formatada com os dados da conta gerada automaticamente. Este desafio faz parte do bootcamp da **Digital Innovation One (DIO).**

## 📌 Funcionalidades

- Coleta de nome completo e data de nascimento do usuário
- Geração automática de:
  - Número da conta
  - Código da agência
- Registro de depósito inicial
- Exibição formatada das informações da conta
- Execução simples e interativa via terminal

## 💻 Tecnologias Utilizadas

- **Java 17+**
- **Scanner (java.util)** para entrada de dados no terminal
- **Lógica condicional e de formatação** para exibição personalizada

## 🚀 Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/andrearraesDev/desafio-dio-banco-terminal.git
   ```

2. **Compile o projeto**:
   ```bash
   javac ContaTerminal.java
   ```

3. **Execute no terminal**:
   ```bash
   java ContaTerminal
   ```

## 🧠 Conceitos Aplicados

- Leitura de dados com `Scanner`
- Manipulação de tipos (`String`, `int`, `double`)
- Geração de números aleatórios (`Math.random()`)
- Formatação de valores monetários
- Estrutura sequencial de execução

## 📷 Demonstração

```bash
Seu Nome: Usuário
Data de Nascimento (dd/mm/aaaa): 11/03/1998
Depósito inicial: R$ 500.00

Olá, Usuário! Sua conta foi criada com sucesso.
Agência: 1234-5 | Conta: 78910-2
Saldo disponível: R$ 500.00
```

## 📚 Aprendizados

Este projeto foi fundamental para consolidar conhecimentos básicos da linguagem Java, como:

- Entrada e saída de dados
- Organização e legibilidade do código
- Separação de responsabilidades
- Boas práticas de desenvolvimento em pequenos projetos

### Desenvolvido com ❤️ por André Arraes como parte do bootcamp da DIO.
