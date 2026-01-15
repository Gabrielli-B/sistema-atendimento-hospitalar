# 🏥 Sistema de Atendimento Hospitalar — Java Puro

## 📌 Descrição do Projeto
Este projeto simula o funcionamento de um **sistema de atendimento hospitalar**, desenvolvido inteiramente em **Java puro (console)**, com o objetivo de consolidar os principais **fundamentos da linguagem Java** antes da utilização de frameworks como **Spring Boot**.

O sistema gerencia:
- Cadastro de pacientes
- Fila de atendimento por prioridade
- Controle de atendimentos realizados
- Tratamento de regras de negócio com exceções personalizadas

---

## 🎯 Objetivo
Reforçar conceitos essenciais de Java, como **Programação Orientada a Objetos**, **estruturas de dados**, **exceções**, **coleções** e **expressões lambda**, por meio de um projeto prático e organizado, voltado para **portfólio profissional**.

---

## 🧠 Conceitos Aplicados
- ✅ Programação Orientada a Objetos (POO)
    - Encapsulamento
    - Herança
    - Polimorfismo
    - Abstração
- ✅ Interfaces e classes abstratas
- ✅ Estruturas de dados
    - `HashSet`
    - `PriorityQueue`
    - `List`
- ✅ `enum` para regras de negócio
- ✅ Exceções personalizadas
- ✅ Tratamento de exceções (`try / catch`)
- ✅ Expressões Lambda
- ✅ Organização em camadas (packages)

---

## 🏗️ Estrutura do Projeto

src
├── exception
│ ├── FilaVaziaException.java
│ ├── PacienteDuplicadoException.java
│ └── PacienteNaoEncontradoException.java
│
├── model
│ ├── Atendimento.java
│ ├── AtendimentosRealizados.java
│ ├── Paciente.java
│ └── Pessoa.java
│
├── service
│ ├── Atender.java
│ ├── CadastroPaciente.java
│ ├── FilaPrioridade.java
│ └── Hospital.java
│
├── util
│ └── TipoAtendimento.java
│
└── Main.java


---

## 🏥 Regras de Negócio Implementadas
- Não é permitido cadastrar pacientes duplicados
- Não é permitido atender pacientes inexistentes
- Não é permitido atender com a fila vazia
- Os atendimentos seguem uma **ordem de prioridade**, baseada no tipo de atendimento
- Todas as regras são validadas por meio de **exceções personalizadas**

---

## 🚦 Tipos de Atendimento
Os pacientes são classificados conforme o nível de urgência:

- 🔴 **VERMELHO** — Atendimento imediato
- 🟠 **LARANJA** — Atendimento muito urgente
- 🟡 **AMARELO** — Atendimento urgente
- 🟢 **VERDE** — Atendimento pouco urgente
- 🔵 **AZUL** — Atendimento não urgente

A prioridade é aplicada automaticamente na fila de atendimento.

---

## ▶️ Execução do Sistema
O sistema é executado via **classe `Main`**, onde é simulada:
- A criação de pacientes
- O cadastro no sistema
- A inserção na fila de atendimento
- O atendimento conforme prioridade
- A exibição de dados no console

---

## 📈 Próximos Passos
- Evoluir o projeto para **Spring Boot**
- Implementar persistência com banco de dados
- Criar API REST para gerenciamento de atendimentos

---

