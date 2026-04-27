# 🚀 Orientação a Objetos com Java

Repositório criado para documentar meus estudos sobre os pilares da Programação Orientada a Objetos (POO), focado em boas práticas, organização de código e segurança de dados.

## 📌 Sobre o Projeto
O projeto demonstra o estudo de orientação a objetos e a resolução de exercícios práticos para fixação dos conceitos.

---

## 🏗️ Conceitos Aplicados (Resumo)

* **Abstração:** Modelagem de entidades do mundo real (Pessoas, Pets, Máquinas) como classes Java.
* **Encapsulamento:** Uso do modificador private e métodos de acesso para garantir que os atributos só sejam alterados sob regras específicas
* **Getters & Setters:** Métodos de leitura e escrita controlada com validações de regras de negócio.
* **Palavra-chave `this`:** Referência clara aos atributos da instância, evitando ambiguidades no código.

---
## 📂 Detalhamento dos Exercícios

Baseado no roteiro de estudos de **Abstração e Encapsulamento**, os seguintes desafios foram implementados:

### 1. Sistema de Conta Bancária
**Operações:** Consultar saldo, consultar cheque especial, depositar, sacar, pagar boleto e verificar uso do cheque especial.
**Regras:**
* O limite do cheque especial é somado ao saldo.
* Definição do limite na criação:
  * Depósito inicial ≤ R$ 500,00: Cheque especial de R$ 50,00.
  * Depósito inicial > R$ 500,00: Cheque especial de 50% do valor depositado.
* Se o cheque especial for usado, deve ser cobrada uma taxa de 20% sobre o valor utilizado assim que houver saldo disponível.

### 2. Controle de Funções de um Carro 
**Operações:** Ligar/Desligar, acelerar, diminuir velocidade, virar (esquerda/direita), verificar velocidade e trocar marcha.
**Regras:**
* O carro inicia desligado, em ponto morto (marcha 0) e velocidade 0.
* Desligado, o carro não realiza nenhuma função.
* Aceleração/Frenagem: incrementos/decrementos de 1km/h (Mín 0, Máx 120).
* **Sistema de Marchas:** Possui 6 marchas + ponto morto. Não é permitido "pular" marchas.
* **Relação Marcha x Velocidade:**
  * Marcha 0: Não acelera.
  * 1ª: 0-20 km/h | 2ª: 21-40 km/h | 3ª: 41-60 km/h | 4ª: 61-80 km/h | 5ª: 81-100 km/h | 6ª: 101-120 km/h.
* Para desligar: Deve estar em ponto morto e velocidade 0.
* Para virar: Velocidade deve estar entre 1km/h e 40km/h.
### 3. Controle de Banho PetShop
**Operações:** Dar banho, abastecer insumos, verificar níveis, gerenciar ocupação do pet e limpar máquina.
**Regras:**
* Apenas 1 pet por vez.
* **Consumo por banho:** 10L de água e 2L de shampoo.
* **Capacidade Máxima:** 30L de água e 10L de shampoo.
* **Higiene:** Se o pet sair sujo, a máquina trava e exige limpeza antes do próximo uso.
* **Consumo de limpeza:** 3L de água e 1L de shampoo.
* **Abastecimento:** Permitido apenas 2L por acionamento.
---

## 🛠️ Tecnologias e Ferramentas
* **Java**
* **IntelliJ IDEA** (IDE)
* **Git/GitHub** (Versionamento)

---

## 📂 Estrutura do Código

O projeto está organizado em pacotes (packages) para separar os conceitos aprendidos dos exercícios práticos:


```text
src/
│
├── Estudo/              # Exploração teórica e primeiros conceitos
│   ├── Person.java
│   └── Main.java
│
└── Exercicios/          # Implementação dos exercícios práticos
    ├── ex1/             # Sistema de Conta Bancária
    │   ├── Conta.java
    │   └── Main.java
    ├── ex2/             # Controle de Funções de um Carro
    │   ├── Carro.java
    │   └── Main.java
    └── ex3/             # Controle de Banho PetShop
        ├── MaquinaDeBanho.java
        └── Main.java