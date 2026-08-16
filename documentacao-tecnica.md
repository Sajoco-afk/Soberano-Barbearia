# Soberano Barber System

## Documentação Técnica

**Projeto:** Projeto Integrador I
**Responsável:** Samuel Covalski
**Versão:** 1.0
**Nome do sistema:** Soberano Barber System

---

## 1. Apresentação

O **Sistema de Gerenciamento de Barbearia** foi desenvolvido para a barbearia **Soberano**, tendo em vista facilitar a administração de uma barbearia, organizando o agendamento de clientes, o controle dos serviços realizados, o cadastro de barbeiros, o cadastro de produtos e o gerenciamento financeiro.

O objetivo é substituir anotações em papel por um sistema mais moderno, seguro e eficiente, proporcionando um melhor atendimento aos clientes e mais praticidade para os funcionários.

---

## 2. Descrição do Projeto e Usuários

O sistema contará com funcionalidades para cadastrar clientes, barbeiros, serviços, produtos e agendamentos, além de controlar pagamentos e gerar relatórios.

### 2.1 Cadastros

O sistema permitirá o cadastro de:

* Clientes
* Barbeiros
* Serviços
* Produtos
* Agendamentos
* Pagamentos

---

## 3. Usuários e suas Permissões

### 3.1 Administrador

O administrador terá acesso completo ao sistema.

Permissões:

* Cadastrar, editar e excluir clientes, barbeiros, serviços e produtos.
* Gerenciar usuários e suas permissões.
* Visualizar relatórios financeiros e de desempenho.
* Controlar o estoque de produtos.
* Realizar backup e restaurar o banco de dados.

### 3.2 Recepcionista

Permissões:

* Cadastrar e editar clientes.
* Agendar, alterar e cancelar horários.
* Registrar pagamentos.
* Consultar a agenda dos barbeiros.
* Consultar o estoque de produtos, sem permissão para alterá-lo.
* Emitir comprovantes de atendimento.

### 3.3 Barbeiro

Permissões:

* Visualizar sua agenda de atendimentos.
* Consultar os dados dos clientes agendados.
* Registrar a conclusão dos serviços realizados.
* Informar os produtos utilizados durante o atendimento.
* Atualizar o status do atendimento:

  * Em andamento
  * Finalizado
  * Cancelado

### 3.4 Estoquista

Permissões:

* Cadastrar produtos.
* Atualizar o estoque.
* Registrar entrada e saída de produtos.
* Consultar relatórios de estoque.
* Não possui acesso às informações financeiras nem ao gerenciamento de usuários.

### 3.5 Cliente

Permissões:

* Consultar horários disponíveis.
* Solicitar agendamentos.
* Visualizar seus próprios agendamentos.

---

## 4. Requisitos Funcionais

### RF001 – Cadastro de Clientes

Permitir cadastrar:

* Nome
* Telefone
* E-mail
* Data de nascimento

### RF002 – Cadastro de Barbeiros

Permitir cadastrar barbeiros e suas informações profissionais.

### RF003 – Cadastro de Serviços

Permitir cadastrar serviços como:

* Corte de cabelo
* Barba
* Sobrancelha

Também deverão ser cadastrados os respectivos valores dos serviços.

### RF004 – Cadastro de Produtos

Permitir cadastrar produtos utilizados ou vendidos pela barbearia, como:

* Pomadas
* Shampoos
* Óleos para barba
* Outros itens

Para cada produto deverão ser informados:

* Nome
* Categoria
* Quantidade em estoque
* Preço de custo
* Preço de venda

### RF005 – Agendamento de Horários

Permitir que o recepcionista ou administrador realize o agendamento de serviços para os clientes, selecionando:

* Cliente
* Barbeiro
* Data
* Horário
* Serviço

### RF006 – Registro de Pagamentos

Permitir registrar:

* Forma de pagamento
* Valor pago pelo cliente

### RF007 – Consulta de Agendamentos

Permitir visualizar os horários disponíveis e os atendimentos agendados.

### RF008 – Controle de Estoque

Permitir atualizar automaticamente a quantidade de produtos em estoque após uma venda e consultar a disponibilidade de cada produto.

### RF009 – Emissão de Relatórios

Permitir gerar relatórios de:

* Faturamento
* Atendimentos realizados
* Serviços mais procurados
* Produtos vendidos

### RF010 – Login

Permitir que os usuários acessem o sistema utilizando login e senha.

### RF011 – Histórico de Atendimentos

Permitir consultar o histórico de atendimentos realizados por cada cliente.

---

## 5. Requisitos Não Funcionais

### RNF001 – Segurança

O sistema deverá exigir login e senha para acesso.

### RNF002 – Banco de Dados

Todas as informações deverão ser armazenadas em um banco de dados **MySQL**.

### RNF003 – Backup

O sistema deverá realizar backup automático diariamente.

### RNF004 – Desempenho

As consultas e agendamentos deverão ser processados em até **2 segundos**.

### RNF005 – Usabilidade

A interface deverá ser intuitiva e de fácil utilização por funcionários com pouco conhecimento em informática.

### RNF006 – Disponibilidade

O sistema deverá estar disponível durante todo o horário de funcionamento da barbearia.

---

## 6. Observações Técnicas

O sistema será desenvolvido utilizando:

* **Java** como linguagem de programação.
* **MySQL** como banco de dados.
* **Git** para controle de versão.

A interface será desenvolvida com foco na simplicidade e na facilidade de uso.

O sistema contará com:

* Autenticação de usuários.
* Controle de permissões.
* Backup automático das informações.
* Segurança dos dados.

Além disso, o sistema contará com cinco telas principais:

1. Administrador
2. Recepcionista
3. Barbeiro
4. Estoquista
5. Cliente

---

## 7. Regras de Negócio

### RN001 – Conflito de Agendamento

O sistema deverá impedir o agendamento de dois clientes para o mesmo barbeiro no mesmo horário.

Essa regra tem como objetivo evitar conflitos na agenda e garantir a correta organização dos atendimentos.

---

## 8. Tecnologias

| Tecnologia | Utilização               |
| ---------- | ------------------------ |
| Java       | Linguagem de programação |
| MySQL      | Banco de dados           |
| Git        | Controle de versão       |

---

## 9. Versão do Documento

| Informação  | Detalhe                |
| ----------- | ---------------------- |
| Projeto     | Projeto Integrador I   |
| Sistema     | Soberano Barber System |
| Responsável | Samuel Covalski        |
| Versão      | 1.0                    |
