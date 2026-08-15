# 01-java-thread

## Compilação

Para compilar cada exercício, acesse a pasta correspondente e execute:

```bash
javac *.java
```

## Execução

Depois da compilação, execute:

```bash
java Main
```

# Exercícios

Em Java, foram implementadas as aplicações utilizando a interface `Runnable` e a classe `Thread`.

---

## 1) Thread calculadora

### Solução

A classe `Tarefa` foi modificada para receber dois números e uma operação matemática (`+`, `-`, `*` ou `/`).

Durante a execução, são realizados três passos. Em cada passo, os valores utilizados no cálculo são modificados, produzindo um resultado diferente.

Foi utilizado um `switch` para identificar a operação escolhida e realizar o cálculo correspondente.

O resultado parcial de cada passo é exibido no console.

A tarefa é executada por uma `Thread` utilizando o método `start()`.

---

## 2) Thread jogo de adivinhação

### Solução

Neste exercício, cada `Tarefa` recebe o nome de um jogador e gera um número secreto aleatório entre 1 e 10 utilizando a classe `Random`.

Durante a execução, são realizados até três palpites aleatórios.

Após cada tentativa, o programa verifica o palpite em relação ao número secreto e informa se o palpite foi maior, menor ou se o jogador acertou.

Quando o número secreto é acertado, o jogo é finalizado.

Cada jogador possui sua própria `Tarefa` e sua própria `Thread`, permitindo que os jogos sejam executados de forma concorrente.

---

## 3) Thread contador de caracteres

### Solução

Neste exercício, a classe `Tarefa` recebe uma `String`.

Para descobrir a quantidade de caracteres, foi utilizado o método `length()` da classe `String`.

O programa exibe no console o texto recebido e a quantidade de caracteres encontrada.

Por exemplo, para a string `Programacao em Java`, o programa informa que existem 19 caracteres.

A tarefa é executada por uma `Thread`.

---

## 4) Thread soma de vetores

### Solução

Neste exercício, a classe `Tarefa` recebe dois vetores de inteiros.

O programa percorre os vetores utilizando um laço de repetição e soma os elementos que estão na mesma posição.

Por exemplo:

```text
Vetor 1: 1 2 3 4 5
Vetor 2: 5 4 3 2 1
Resultado: 6 6 6 6 6
```

O resultado parcial de cada índice é exibido no console.

Antes da soma, o programa verifica se os dois vetores possuem o mesmo tamanho.

### Paralelização

Para vetores grandes, essa tarefa pode ser dividida entre várias threads.

Por exemplo, um vetor com 1000 posições poderia ser dividido entre quatro threads. Cada thread poderia ficar responsável por uma parte dos índices.

Como cada posição do vetor pode ser calculada independentemente, as diferentes partes podem ser processadas de forma concorrente.

---

## 5) Thread soma de matrizes

### Solução

Neste exercício, a classe `Tarefa` recebe duas matrizes de inteiros.

O programa percorre as linhas e as colunas das matrizes e soma os elementos que possuem a mesma posição.

Por exemplo:

```text
Matriz 1:

1 2 3
4 5 6

Matriz 2:

6 5 4
3 2 1

Resultado:

7 7 7
7 7 7
```

O resultado parcial de cada posição é exibido no console.

Antes da operação, o programa verifica se as duas matrizes possuem as mesmas dimensões.

### Paralelização

Para matrizes grandes, a operação pode ser dividida entre várias threads.

Uma possibilidade é distribuir diferentes linhas da matriz entre as threads. Cada thread ficaria responsável por calcular uma parte das linhas.

Outra possibilidade seria dividir a matriz em blocos, fazendo com que cada thread processe uma determinada região.

Como a soma de cada posição da matriz é independente das demais, diferentes partes da matriz podem ser processadas simultaneamente.

---

## Conclusão

Os cinco exercícios foram implementados utilizando a interface `Runnable` e a classe `Thread`.

Cada exercício possui sua própria classe `Tarefa` e seu próprio `Main`, permitindo que as aplicações sejam executadas e testadas separadamente.

Os exercícios também demonstram como o processamento pode ser dividido entre diferentes threads, principalmente nas operações com vetores e matrizes.
