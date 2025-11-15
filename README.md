# Teste de Caixa Branca  
Projeto da disciplina: UX/UI e Testes de Software 

Este repositório contém o código analisado durante a atividade, teste de caixa branca, grafo de fluxo, complexidade ciclomática, caminhos básicos.

---

## 📌 1. Código-fonte analisado e comentado 

Arquivo analisado: **User.java**

📁 Repositório:  
[TESTECAIXABRANCAINDIVIDUAL](https://github.com/LucasYoshidaX86/TESTECAIXABRANCAINDIVIDUAL)

## 1.1 Planilha de Teste Caixa Branca
Planilha Excel utilizada para responder perguntas sobre análise do código:

![Fonte: Lucas Yoshida](https://github.com/LucasYoshidaX86/TESTECAIXABRANCAINDIVIDUAL/blob/main/PlanilhaTesteCaixaBranca.png)

--- 

## 📌 2. Notação de Grafo de Fluxo
Grafo de Fluxo criado para representar o código:

![Fonte: Lucas Yoshida](https://github.com/LucasYoshidaX86/TESTECAIXABRANCAINDIVIDUAL/blob/main/GrafoFluxo.png)

Identificação dos Nós:

![Fonte: Lucas Yoshida](https://github.com/LucasYoshidaX86/TESTECAIXABRANCAINDIVIDUAL/blob/main/Identifica%C3%A7%C3%A3o%20dos%20N%C3%B3s.jpg)

---

## 📌 3. Complexidade Ciclomática
A Complexidade Ciclomática mede o número de caminhos independentes que existem no código, baseado no Grafo de Fuxo construído, foi calculado:

**Fórmula utilizada:**
**M = E - N + 2P**

**Para o grafo, temos:** 
- N = número de nós (9)
- E = número de arestas (9)
- P = número de componentes (1)

**Aplicando os valores**

M = 9 - 9 + 2 * 1

M = 9 - 9 + 2

M = 2

**Complexidade Ciclomática: M = 2**

---

## 📌 4. Caminhos Básicos
Com base no resultado encontrado no cálculo de Complexidade Ciclomática, existem 2 caminhos básicos:

**Caminho 1 - False (usuário não encontrado)**

**N1 -> N2 -> N3 -> N4 -> N5 -> N6 -> N7(false) -> N9**

Este caminho é o fluxo em que se consulta o Banco de Dados e não encontra nenhum usuário, indo direto ao retorno final.

**Caminho 2 - True (usuário encontrado)**

**N1 -> N2 -> N3 -> N4 -> N5 -> N6 -> N7(true) -> N8 -> N9**

Este caminho é o fluxo em que se consulta o Banco de Dados e encontra um usuário. Aqui o "result" é true, atribui o nome ao usuário e finaliza retornando o valor.

---

## 👨‍💻 Autor

**Lucas Yoshida - 248200**

Aluno em Análise e Desenvolvimento de Sistemas (FACENS)

Ano: 2025










