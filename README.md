# Validador de Exames

Projeto desenvolvido em Java com Spring Boot para cadastrar pacientes e solicitações de exames, aplicando uma regra de validação para o exame PSA.

## Objetivo

O objetivo do projeto é praticar o desenvolvimento de APIs REST, a persistência de dados e a implementação de regras de negócio utilizando Java e Spring Boot.

## Funcionalidades

- Cadastro de pacientes.
- Cadastro de solicitações de exames.
- Relacionamento entre pacientes e exames.
- Bloqueio da solicitação do exame PSA para pacientes do sexo feminino.
- Tratamento de erros com resposta HTTP 400 e mensagem explicativa.

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## Como funciona

O sistema permite cadastrar pacientes e associar solicitações de exames a eles.

Antes de salvar uma solicitação, a aplicação busca o paciente pelo ID no banco de dados e verifica a regra de negócio.

Quando o exame solicitado é PSA e o paciente está cadastrado como sexo feminino, a solicitação é bloqueada. Para pacientes do sexo masculino, o cadastro é permitido.

## Endpoints

### Cadastrar paciente

`POST /pacientes`

Exemplo de requisição:

```json
{
  "nome": "Michele",
  "sexo": "Feminino"
}
```

### Cadastrar solicitação de exame

`POST /exames`

Exemplo de requisição:

```json
{
  "nomeExame": "PSA",
  "paciente": {
    "id": 2
  }
}
```

O ID deve corresponder a um paciente previamente cadastrado.

## Banco de dados

O projeto utiliza MySQL para armazenar os pacientes e as solicitações de exames.

O Hibernate é configurado para atualizar a estrutura das tabelas conforme as entidades JPA.

## Aprendizados

Este projeto foi desenvolvido como parte dos meus estudos em desenvolvimento backend Java, com foco em:

- Programação orientada a objetos.
- Desenvolvimento de APIs REST.
- Mapeamento objeto-relacional com JPA.
- Integração com banco de dados MySQL.
- Implementação de regras de negócio.
- Tratamento de exceções.
- Testes de requisições HTTP com Postman.

## Status do projeto

Versão inicial funcional, com cadastro de pacientes, cadastro de solicitações e validação da regra de negócio para o exame PSA.