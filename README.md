# Maratona Java
Nesse repositório eu busco documentar meu aprendizado e evolução durante minha rotina de estudos da linguagem Java.

Estou usando como meio de estudo o curso online de Java disponibilizado pelo canal [DevDojo](https://youtube.com/playlist?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&si=6YcxOOm5Ft0dyOFG).
****
## Aula 01 (Compilação Java)
Essa aula apresentou conceitos básicos da linguagem, principalmente como funcionava sua compilação.

![img.png](img.png)

## Aula 02 e 03 (Tipos Primitivos)
 Em Java os tipos primitivos são os dados básicos não orientados a objetos e armazenados diretamente na memória, utilizados em operações aritméticas e lógicas. 
 
Aqui foram apresentados os 8 tipos primitivos do Java:

1. **byte:** Utilizado pra economizar memória em operações com números pequenos.
2. **short:** Similar ao byte, porém tem um intervalo maior.
3. **int:** Tipo padrão para números inteiros.
4. **long:** Utilizado para números inteiros muito grandes. É declarado com um L no final do número (ex: `1241414211443L`)
5. **float:** Utilizado para números decimais de precisão moderada. É declarado com F no final. (ex:`3.14F`)
6. **double:** Assim como o float é utilizado para números decimais, porém como uma maior precisão, alcançando um maior intervalo. 
7. **char:** Utilizado para armazenar um **único** caractere unicode (ex:`'A' = \u0041'` ) 
8. **boolean:** Uso em lógicas e condicionais, o seu resultado sempre vai ser ou `true` ou `false`


## Aula 04 (Operadores)

### Operadores Aritméticos
- Utilizados para expressões matemáticas

1. `+`: adição
2. `-`: subtracação
3. `*`: multiplicação
4. `/`: divisão simples
5. `%`: resto da divisão

#### Exemplo:
- `int soma = n1 + n2;` // Soma de dois números
- `int resto = n1 % n2;` // Resto da divisão de n1 por n2

### Operadores Relacionais
- Fazem comparações para retornar valores boolenos

1. `>`: maior que
2. `<`: menor que
3. `==`: igual a
4. `!=`: diferente de
5. `>=`: maior igual a
6. `<=`: menor igual a 

#### Exemplo:
- `boolean isMaior = n1 > n2;` // Verifica se n1 é maior que n2
- `boolean isIgual = n1 == n2;` // Verifica se n1 é igual a n2

### Operadores Lógicos
- Utilizados para combinações de expressões booleanas mais complexas

1. `&& (AND)`: Para retornar true é necessário que todas as condições sejam verdadeiras
2. `|| (OR)`: É necessário apenas uma condição ser verdadeira para ele retornar true
3. `! (NOT)`: É utilizada para inverter o valor booleano

#### Exemplo:
- `boolean isPermitido = idade >= 18 && saldo >= 500;` // Verifica se a idade é >= 18 E o saldo é >= 500
- `boolean isCompravel = saldo1 >= valor || saldo2 >= valor;` // Verifica se o valor é comprável com um dos saldos

### Operadores de Atribuição
- Utilizados para facilitar a atribuições de valores a variáveis, combinando um operador aritmético com o sinal de atribuição(`=`)

#### Exemplo:
- `saldo += 1000;` // Adiciona 1000 ao saldo atual

### Operadores de Incremento e Decremento
- Aumenta ou diminui o valor de uma variável em uma unidade 

- `++`: Incremento
- `--`: Decremento 

#### Exemplo:
- `contador++;` // Incrementa o contador em 1 
  - **OBS:** A ordem de utilização do operador afeta o resultado:
    - `++contador`: Incrementa o valor **antes** da utilização
    - `contador++`: Incrementa o valor **após** a utilização

## Aula 05 (Estruturas Condicionais)
- As estruturas condicionais permitem que o programa tome decições a partir de condições estabelecidas.

### Estrutura IF

- Executa o código caso a condição seja verdadeira
  - Sintaxe: 
      ```java
      if (condicao) {
        // código a ser executado
        }
      ```

### Estrutura IF-ELSE

- Executa um bloco de código caso a condição seja verdadeira e outro caso ela seja falsa 
  - Sintaxe: 
      ```java
        if (condicao) {
              // código executado se for VERDADEIRA
        } 
        else {
              // código executado se for FALSA
        }
      ```

### Operador Ternário 

- É uma meneira de comprimir a estrutura IF-ELSE em apenas uma linha
  - Sintaxe: `(condicao) ? valorSeVerdadeiro : valorSeFalso;`

### Estrutura IF-ELSE para múltiplas condições

- Ele vai avaliar mais de duas condições e retornar a primeira verdadeira
  - Sintaxe: 
       ``` java
      if (condicao1) {
           código executado se condicao1 for verdadeira
      } else if (condicao2) {
          // código executado se condicao2 for verdadeira
      } else {
          // código executado se nenhuma das condições anteriores for verdadeira}
      ```
### Estrutura Switch

O `switch` é uma alternativa para simplificar condições encadeadas (como `if-else`), especialmente quando se compara **uma única variável** contra múltiplos valores.

### **Sintaxe Básica**
```java
switch (variável) {
    case valor1:
        // Código se variável == valor1
        break;
    case valor2:
        // Código se variável == valor2
        break;
    default:
        // Código se nenhum case for atendido
}
```
## Aula 06 (Estruturas de Repetição)

### Estrutura While
- Executa um bloco de código enquanto uma condição for verdadeira.
- **Uso ideal:** Quando não se sabe quantas iterações serão necessárias (ex.: ler entradas até que o usuário digite "sair").
- **Cuidado:** Condições mal formuladas podem causar loops infinitos!
#### **Sintaxe Básica**
```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contagem: " + contador);
    contador++;
}
```

### Estrutura Do-While
- Similar ao while, mas garante pelo menos uma execução (a condição é verificada no final).
- Uso ideal: Menus interativos ou validação de entrada.

#### **Sintaxe Básica**
```java
int numero;
do {
    System.out.println("Digite um número positivo:");
    numero = scanner.nextInt();
} while (numero <= 0);
```

### Estrutura For
- Estrutura compacta para loops com contador controlado.
- Componentes:
  - Inicialização: int i = 0 (executa uma vez).

  -  Condição: i < 10 (verificada a cada iteração).

  -  Incremento: i++ (executa após cada ciclo).
- Uso ideal: Iterações com número definido (ex.: percorrer arrays).

#### **Sintaxe Básica**
```java
for (int i = 0; i < 10; i++) {
    System.out.println("Número: " + i);
}
```

### Estrutura Foreach
- Simplifica a iteração em coleções (arrays, listas, etc.).
- Vantagem: Elimina a necessidade de contadores manual.
- Limitação: Não permite modificar a coleção durante a iteração.

#### **Sintaxe Básica**
```java
String[] frutas = {"Maçã", "Banana", "Pêra"};
for (String fruta : frutas) {
    System.out.println("Fruta: " + fruta);
}
```

### ⚠️ Dicas Importantes

- Evite loops infinitos: Sempre atualize a variável de condição!

- break e continue: Use para sair prematuramente (break) ou pular iterações (continue).

#### **Sintaxe Básica**
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break; // Sai do loop quando i for 5
    if (i % 2 == 0) continue; // Pula números pares
    System.out.println("Ímpar: " + i);
}
```

## Aula 07 e 08 (Arrays e Arrays Multidimensionais)
- Estruturas para armazenar múltiplos valores do mesmo tipo em uma única variável.

### 1. Declaração e Inicialização
```java
// Forma 1: Declaração + tamanho  
int[] numeros = new int[5]; // [0, 0, 0, 0, 0]  

// Forma 2: Declaração com valores iniciais  
String[] frutas = {"Maçã", "Banana", "Pêra"};  
```
- Tamanho fixo: Definido na criação e não pode ser alterado.

- Valores padrão:

  - 0 para números.

  - null para objetos.

### 2. Acesso e Modificação

````java
numeros[0] = 10; // Atribui valor à posição 0  
System.out.println(frutas[1]); // Imprime "Banana"  
````
- Índices: Começam em 0.

- Erro comum: ArrayIndexOutOfBoundsException (tentar acessar índice inválido).

### 3. Percorrendo Arrays

#### Com for tradicional
````java
  for (int i = 0; i < numeros.length; i++) {
        System.out.println("Posição " + i + ": " + numeros[i]);  
}  
````

#### Com foreach
````java
for (String fruta : frutas) {  
    System.out.println(fruta);  
}  
````
- .length: Propriedade que retorna o tamanho do array.

### 4. Arrays Multidimensionais

````java
// Matriz 2x3  
int[][] matriz = {  
    {1, 2, 3},  
    {4, 5, 6}  
};  
System.out.println(matriz[1][2]); // Imprime 6  
````
- Uso comum: Tabelas, grids ou estruturas com linhas/colunas.





