# 🧮 Menu Interativo: Contador e Calculadora em Java 🎨

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)
![Plataforma](https://img.shields.io/badge/Plataforma-Console-blue?style=for-the-badge)
![Licença](https://img.shields.io/badge/Licença-MIT-yellow?style=for-the-badge)
![Contribuições](https://img.shields.io/badge/Contribuições-Bem--vindas-orange?style=for-the-badge)

Bem-vindo\! 👋 Este projeto foi meu desafio pessoal para consolidar os pilares do **Java**: lógica de programação, estruturas de repetição, condições e interatividade com o usuário.

O resultado é uma ferramenta de console que não é apenas funcional, mas também **visualmente agradável de usar**, graças à implementação de códigos de cores ANSI. É um ótimo exercício prático e uma ferramenta divertida para testar contagens e realizar cálculos rápidos.

## 🚀 Funcionalidades

O menu principal é o coração do programa, um loop `do-while` que oferece acesso fácil a duas seções principais:

### 🔢 Contador

  * **Contagem Crescente:** Você define o início, o fim e o passo. O programa faz o resto.
  * **Contagem Decrescente:** Perfeita para uma contagem regressiva personalizada\!

### 🧠 Calculadora

  * **Soma:** Adição simples entre dois números.
  * **Subtração:** Calcula a diferença entre dois valores.
  * **Multiplicação:** Realiza o produto entre dois números.
  * **Divisão:** Executa a divisão com **validação anti-erro**, impedindo ativamente que o divisor seja zero.
  * **Tabuada:** Exibe a tabuada completa (de 1 a 10) de qualquer número escolhido.

##🎨 A Experiência: Console com Cores

Para fugir do terminal monocromático, implementei **códigos ANSI** para dar vida à interface. Cada cor tem um propósito claro:

  * 🔵 **Azul:** Títulos e divisões principais do menu.
  * 🟡 **Amarelo:** Destaques, avisos e prompts de entrada.
  * 🟢 **Verde:** Resultados de sucesso e opções de ação.
  * 🔴 **Vermelho:** Mensagens de erro, alertas e a opção de sair.

Isso torna a navegação muito mais intuitiva e dinâmica, mesmo em um ambiente de console.

##⚙️ Como Executar

1.  Certifique-se de ter o **Java JDK** (versão 8 ou superior) instalado.

2.  Clone este repositório ou baixe o arquivo `Main.java`.

3.  Abra seu terminal na pasta do projeto.

4.  Compile o código:

    ```bash
    javac Main.java
    ```

5.  Execute o programa:

    ```bash
    java Main
    ```

6.  Pronto\! O menu aparecerá para você:

    ```text
    =====================
       MENU DO CONTADOR   
    =====================
    Escolha uma opção:
    --- Contador ---
    1 - Contagem Crescente
    2 - Contagem Decrescente
    --- Calculadora ---
    3 - Somar
    4 - Dividir
    5 - Multiplicação
    6 - Ver Tabuada
    7 - Subtração
    8 - Sair
    ```

> **Nota:** A exibição de cores é compatível com a maioria dos terminais modernos (Git Bash, Windows Terminal, terminais Linux/macOS).

## 🧠 O "Cérebro": Tecnologias e Conceitos

Este projeto foi 100% focado em **Java puro**, aplicando conceitos essenciais:

  * **Linguagem:** Java (JDK 8+)
  * **Entrada de Dados:** `java.util.Scanner`
  * **Estrutura Principal:** Loop `do-while` (para o menu) e `switch-case` (para a lógica de seleção).
  * **Lógica de Operação:** Loops `for` (para contagens e tabuada) e `if`/`while` (para validações, como a divisão por zero).
  * **Estilo:** Constantes `final String` armazenando códigos de escape ANSI para as cores.

### 🧑‍💻 Desenvolvido por Matheus S. Mariano

> *“A prática leva à evolução. Cada linha de código é um passo adiante.”*
