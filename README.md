# 👑 Soberano Barbearia

Projeto de uma barbearia desenvolvido inicialmente como **site responsivo em HTML e CSS** e posteriormente expandido com uma **aplicação Java de console**, trazendo conceitos de programação e Programação Orientada a Objetos (POO) para o projeto.

> Projeto desenvolvido para estudos, prática de desenvolvimento web, Java e organização de sistemas.

## 📌 Sobre o projeto

A **Soberano Barbearia** apresenta uma experiência digital para uma barbearia, com informações sobre serviços, preços, contato, localização e agendamento.

O projeto possui atualmente duas partes:

- 🌐 **Site:** interface da barbearia desenvolvida com HTML e CSS.
- ☕ **Java:** sistema de console para cadastro de serviços e gerenciamento de agendamentos.

## ✂️ Serviços

O catálogo utilizado no sistema Java foi baseado nos serviços apresentados no site:

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

O arquivo `SoberanoBarbearia.java` transforma o projeto da barbearia em uma aplicação de console.

### Funcionalidades

- 📋 Listagem de serviços e preços
- 👤 Cadastro do nome do cliente no agendamento
- 📅 Agendamento de horários
- 🚫 Verificação de horário já ocupado
- 📑 Consulta dos agendamentos cadastrados
- 💰 Exibição do valor do serviço
- 📍 Informações da barbearia
- 🕐 Horário de funcionamento
- 💳 Informações sobre formas de pagamento

### Conceitos de Java praticados

- Classes e objetos
- Construtores
- Encapsulamento básico
- `ArrayList`
- `Scanner`
- Métodos
- Estruturas condicionais
- `switch`
- Estruturas de repetição
- Validação de entrada
- Organização de dados em objetos

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

## 📂 Estrutura atual

```text
Soberano-Barbearia/
├── index.html
├── styles.css
├── SoberanoBarbearia.java
└── README.md
```

## ▶️ Como executar o sistema Java

É necessário ter o **JDK (Java Development Kit)** instalado.

Abra o terminal na pasta onde está o arquivo e compile:

```bash
javac SoberanoBarbearia.java
```

Depois execute:

```bash
java SoberanoBarbearia
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

## 🎯 Objetivo de aprendizado

Este projeto faz parte da minha evolução nos estudos de desenvolvimento de sistemas.

A proposta é pegar um projeto web já desenvolvido e evoluí-lo gradualmente, adicionando lógica de programação e conceitos de Java e POO.

### Próximas melhorias

- [ ] Separar as classes Java em arquivos individuais
- [ ] Criar a classe `Cliente`
- [ ] Criar a classe `Servico`
- [ ] Criar a classe `Agendamento`
- [ ] Criar a classe `Barbearia`
- [ ] Implementar cancelamento de agendamento
- [ ] Implementar alteração de agendamento
- [ ] Persistir os dados em banco de dados
- [ ] Criar integração entre aplicação Java e banco de dados

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

⭐ Se este projeto foi útil para você, considere deixar uma estrela no repositório!
