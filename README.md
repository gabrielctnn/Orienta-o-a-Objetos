# 🚀 Orientação a Objetos com Java

Repositório criado para documentar meus estudos sobre os pilares da Programação Orientada a Objetos (POO), focado em boas práticas, organização de código e segurança de dados.

## 📌 Sobre o Projeto
Este projeto simula um sistema de cadastro de pessoas (`Estudo.Person`), explorando como proteger dados de uma classe e como os objetos interagem entre si de forma segura.

---

## 🏗️ Conceitos Aplicados (Resumo)

* **Abstração:** Uso da classe `Estudo.Person` como molde para instanciar múltiplos objetos (`homem`, `mulher`) com estados independentes.
* **Encapsulamento 🛡️:** Uso do modificador `private` nos atributos para impedir acessos externos diretos, garantindo a integridade dos dados.
* **Getters & Setters:** Métodos públicos para leitura (**Get**) e escrita (**Set**) controlada, permitindo validações de regras de negócio.
* **Palavra-chave `this` ☝️:** Utilizada para referenciar atributos da própria classe e resolver conflitos de nomes com parâmetros de métodos.

---

## 🛠️ Tecnologias e Ferramentas
* **Java**
* **IntelliJ IDEA** (IDE)
* **Git/GitHub** (Versionamento)

---

## 📂 Estrutura do Código

O projeto está organizado em pacotes (packages) para separar os conceitos aprendidos dos exercícios práticos:

- **`src/Estudo/`**: Pasta principal onde exploramos os pilares da POO.
    - `Person.java`: Classe com atributos privados e métodos de acesso.
    - `Main.java`: Execução do fluxo de cadastro e teste dos conceitos.
- **`src/Exercicios/`**: Pasta dedicada à resolução de desafios.
    - `ex1/Main.java`: Resolução do primeiro exercício.
    - `ex2/Main.java`: Resolução do segundo exercício.
    - `ex3/Main.java`: Resolução do terceiro exercício.
- **`README.md`**: Documentação principal do repositório.
