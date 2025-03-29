# Parte 1 - Configuração do Ambiente de Desenvolvimento

## Exercício 1: Instalando e configurando o ambiente Java

### Enunciado

Você foi contratado como desenvolvedor júnior em uma startup e precisa configurar seu ambiente de desenvolvimento.

1. **Instale o JDK** mais recente e configure as variáveis de ambiente.
2. **Instale a IDE IntelliJ IDEA** e crie um projeto Java chamado `MinhaPrimeiraApp`.
3. Dentro do projeto, crie uma classe chamada `OlaMundo` e escreva um programa que imprime:

```
Olá, meu nome é [Seu Nome] e estou aprendendo Java!
```

4. **Faça o build do projeto** e execute o programa pelo console da IDE.

### Entrega

Capture prints de tela mostrando:
- O terminal com o comando `java -version`.
- A configuração do JDK na IntelliJ IDEA.
- A execução do programa no console da IDE.

---

# Parte 2 - Conceitos Básicos da Linguagem

## Exercício 2: Validação de Senha Segura

### Contexto
Sua empresa precisa de um sistema que valide senhas fortes antes do cadastro de novos usuários.

### Enunciado
Crie um programa que:
- Solicite ao usuário seu nome e uma senha.
- A senha deve:
  - Ter no mínimo **8 caracteres**.
  - Conter pelo menos **uma letra maiúscula**, **um número** e **um caractere especial** (@, #, $, etc.).
- Caso a senha seja inválida, o programa deve informar o erro específico e solicitar uma nova tentativa.

---

## Exercício 3: Calculadora de Impostos

### Contexto
Você precisa calcular o imposto de renda de uma pessoa com base no seu salário anual.

### Enunciado
Crie um programa que:
- Peça ao usuário seu nome e seu salário mensal.
- Aplique a seguinte tabela:

```
Até R$ 22.847,76 → Isento
De R$ 22.847,77 a R$ 33.919,80 → 7,5%
De R$ 33.919,81 a R$ 45.012,60 → 15%
Acima de R$ 45.012,61 → 27,5%
```

- O programa deve calcular e exibir o valor do imposto e o salário líquido.

---

## Exercício 4: Simulador de Empréstimo Bancário

### Contexto
Um banco deseja automatizar a simulação de empréstimos para clientes.

### Enunciado
- Solicite o nome do cliente e o valor do empréstimo.
- Pergunte em quantas parcelas ele deseja pagar (mínimo 6, máximo 48).
- Calcule o juro mensal fixo de **3%** e mostre:
  - O valor total pago.
  - O valor da parcela mensal.

---

## Exercício 5: Criando um Programa CGI em Java

### Contexto
Antes do surgimento de tecnologias como Servlets e frameworks web modernos, os servidores HTTP utilizavam o CGI (**Common Gateway Interface**) para gerar conteúdo dinâmico.

### Enunciado
Crie um programa em Java que:
- Imprima os headers necessários para uma resposta HTTP válida.
- Inclua o header obrigatório `Content-Type: text/html`.
- Exiba a seguinte mensagem no corpo da resposta:

```html
Content-Type: text/html

<html>
<head><title>Saudação CGI</title></head>
<body>
<h1>Olá, Terráqueos!</h1>
</body>
</html>
```

---

# Parte 3 - Classes e Objetos

## Exercício 6: Cadastro de Veículos

### Enunciado
Crie uma classe `Veiculo` com os seguintes atributos:
- **Placa** (String)
- **Modelo** (String)
- **Ano de fabricação** (int)
- **Quilometragem** (double)

Implemente os seguintes métodos:
- `exibirDetalhes()` - Exibe os dados do veículo.
- `registrarViagem(double km)` - Adiciona km ao total.

No `main()`, crie dois veículos com dados fictícios e registre viagens para testar o sistema.

---

## Exercício 7: Gerenciador de Alunos

### Enunciado
Crie a classe `Aluno` com os atributos: **nome**, **matrícula** e **três notas**. Implemente os métodos:
- `calcularMedia()` → Retorna a média das notas.
- `verificarAprovacao()` → Exibe se o aluno foi aprovado (média >= 7) ou reprovado.

No `main()`, peça os dados do aluno e exiba sua situação final.

---

# Parte 4 - Orientação a Objetos Avançada

## Exercício 8: Sistema de Funcionários

### Enunciado
Crie a classe `Funcionario` com:
- **nome**
- **salário base**

Crie duas subclasses:
- **Gerente**: Salário recebe um bônus de 20%.
- **Estagiario**: Salário tem um desconto de 10%.

No `main()`, crie um gerente e um estagiário e exiba os salários finais.

---

## Exercício 9: Conta Bancária com Encapsulamento

### Enunciado
Crie a classe `ContaBancaria` com:
- **titular** (String)
- **saldo** (double, privado)

Implemente os métodos:
- `depositar(double valor)`
- `sacar(double valor)` (somente se houver saldo suficiente)
- `exibirSaldo()`

Teste no `main()` criando uma conta e realizando operações.

---

# Parte 5 - Manipulação de Arquivos e Estruturas Avançadas

## Exercício 10: Registro de Compras em Arquivo

### Enunciado
- Peça ao usuário para cadastrar **3 compras** com: **produto**, **quantidade** e **preço unitário**.
- Salve os dados em um arquivo `compras.txt`.
- Leia o arquivo e exiba as compras registradas.

---

## Exercício 11: Simulação de Loteria

### Enunciado
- Gere **6 números aleatórios** entre **1 e 60**.
- Peça ao usuário para inserir **6 números**.
- Compare os números e informe quantos acertos ele teve.

---

## Exercício 12: Sistema de Chat Simples com Arrays

### Enunciado
Crie um programa em Java que permita que dois usuários troquem mensagens alternadamente através da linha de comando.

Ao final, exiba todas as mensagens trocadas e uma mensagem de despedida:

```
Obrigado por utilizarem o sistema! Boa sorte para vocês! 🚀
```
