# 👑 Soberano Barbearia

Projeto de uma barbearia desenvolvido inicialmente como **site responsivo em HTML e CSS** e posteriormente evoluído para uma **aplicação Java de console**, aplicando conceitos de Programação Orientada a Objetos (POO).

> Projeto desenvolvido para estudos, prática de desenvolvimento web, Java, POO e organização de sistemas.

## 📌 Sobre o projeto

A **Soberano Barbearia** apresenta uma experiência digital para uma barbearia, com serviços, preços, contato, localização e agendamento.

O projeto possui atualmente duas partes:

- 🌐 **Site:** interface desenvolvida com HTML5 e CSS3.
- ☕ **Java:** sistema de console para serviços, clientes e agendamentos.

## ✂️ Serviços

| Serviço | Preço |
|---|---:|
| Degrade com desenho | R$ 45,90 |
| Degrade clássico | R$ 40,90 |
| Barba desenhada | R$ 25,50 |
| Social | R$ 20,98 |
| Técnica à tesoura | R$ 35,90 |
| Degrade navalhado | R$ 50,00 |
| Alinhamento e acabamento | R$ 15,90 |
| Sobrancelha e remoção de pelos nasais | R$ 20,00 |

## ☕ Sistema Java

A versão Java foi organizada em classes independentes para praticar **POO e separação de responsabilidades**.

### Funcionalidades

- 📋 Listagem de serviços e preços
- 👤 Criação de clientes
- 📅 Agendamento de horários
- 🚫 Verificação de horário já ocupado
- 📑 Consulta dos agendamentos
- 💰 Exibição do valor do serviço
- 📍 Informações da barbearia
- 🕐 Horário de funcionamento
- 💳 Formas de pagamento

### Estrutura Java

```text
Soberano-Barbearia/
├── index.html
├── styles.css
├── Main.java
├── Cliente.java
├── Servico.java
├── Agendamento.java
└── README.md
```

### Classes

**`Main.java`**

Responsável pelo fluxo principal da aplicação, menu, entrada de dados e operações de agendamento.

**`Cliente.java`**

Representa o cliente da barbearia e utiliza encapsulamento com atributo privado, construtor, getter e setter.

**`Servico.java`**

Representa os serviços oferecidos pela barbearia, armazenando nome, preço e descrição.

**`Agendamento.java`**

Relaciona um `Cliente` a um `Servico`, armazenando também a data e o horário escolhidos.

## 🧠 Conceitos de Java praticados

- Programação Orientada a Objetos (POO)
- Classes e objetos
- Construtores
- Encapsulamento
- Atributos `private`
- Getters e setters
- Relacionamento entre classes
- `ArrayList`
- `Scanner`
- Métodos
- Estruturas condicionais
- `switch`
- Estruturas de repetição
- Validação de entrada
- Sobrescrita do método `toString()`

## ▶️ Como executar o sistema Java

É necessário ter o **JDK (Java Development Kit)** instalado.

Abra o terminal na pasta do projeto e compile os arquivos:

```bash
javac Main.java Cliente.java Servico.java Agendamento.java
```

Depois execute:

```bash
java Main
```

### Menu do sistema

```text
========================================
          SOBERANO BARBEARIA 👑
========================================
1 - Ver serviços e preços
2 - Agendar horário
3 - Ver agendamentos
4 - Informações da barbearia
0 - Sair
========================================
```

## 📅 Exemplo de agendamento

```text
========== NOVO AGENDAMENTO ==========
Nome do cliente: Samuel

Escolha o número do serviço: 1
Data do agendamento (dd/mm/aaaa): 10/09/2026
Horário (ex.: 14:00): 14:00

✓ Agendamento realizado com sucesso!
```

## 🌐 Site

O site apresenta:

- Página inicial
- Apresentação da barbearia
- Catálogo de cortes e serviços
- Preços
- Botão de agendamento via WhatsApp
- Informações de contato
- Endereço
- Horário de funcionamento

## 🛠️ Tecnologias

### Web

- HTML5
- CSS3

### Java

- Java
- Programação Orientada a Objetos
- `Scanner`
- `ArrayList`

## 🎯 Objetivo de aprendizado

Este projeto representa uma etapa da minha evolução nos estudos de Desenvolvimento de Sistemas.

A proposta é evoluir um projeto web para uma aplicação Java, aplicando conceitos de lógica de programação e POO de forma prática.

### 🚀 Próximas melhorias

- [x] Separar as classes Java em arquivos individuais
- [x] Criar a classe `Cliente`
- [x] Criar a classe `Servico`
- [x] Criar a classe `Agendamento`
- [x] Criar a classe `Main`
- [ ] Criar a classe `Barbearia`
- [ ] Implementar cancelamento de agendamento
- [ ] Implementar alteração de agendamento
- [ ] Validar formato de data e horário
- [ ] Persistir os dados em banco de dados
- [ ] Criar integração entre Java e MySQL
- [ ] Criar uma interface gráfica

## 📍 Informações da barbearia

**Soberano Barbearia** 👑

- 📞 Telefone: (41) 9 9806-4023
- 🕐 Terça a sábado, das 09:00 às 19:00
- 📍 R. Cascavel, 881 - Colombo/PR
- 💳 Dinheiro, cartão ou Pix

## 👨‍💻 Autor

**Samuel Jorge Covalski**

Estudante de Desenvolvimento de Sistemas, em transição para a área de tecnologia e construindo projetos para desenvolver conhecimentos em programação.

---

⭐ Projeto desenvolvido para fins de estudo e portfólio.
