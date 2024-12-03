# Sistema de Cadastro de Usuários - CRUD com Spring Boot

Este repositório contém um sistema CRUD (Create, Read, Update, Delete) para gerenciamento de usuários, desenvolvido em Java utilizando o Spring Framework e Spring Boot para a lógica de negócios, com H2 Database como banco de dados em memória. O sistema permite a criação, leitura, atualização e exclusão de informações sobre usuários, como nome, email, CPF, telefone e endereço. Este projeto aplica conceitos de Programação Orientada a Objetos (POO) e Spring Boot.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Spring Data JPA**: Para interação com o banco de dados usando JPA (Java Persistence API).
- **H2 Database**: Banco de dados em memória utilizado para armazenar os dados.
- **Thymeleaf**: Motor de template para renderização de páginas HTML.
- **Maven**: Gerenciador de dependências e construção de projetos.

## Funcionalidades

- **Adicionar Usuários**: Insere novos usuários no sistema.
- **Visualizar Usuários**: Lista os usuários cadastrados com seus detalhes.
- **Atualizar Informações**: Permite editar os dados de um usuário, como nome, email, telefone e endereço.
- **Remover Usuários**: Exclui usuários do sistema.
- **Busca por ID**: Recupera as informações de um usuário específico.
- **Gerenciamento Avançado**: Integração com o banco de dados H2 para armazenamento persistente dos dados.

## Campos do Usuário

- **ID**: Identificação única do usuário.
- **Nome**: Nome completo do usuário.
- **Email**: E-mail do usuário.
- **CPF**: CPF do usuário.
- **Telefone**: Número de telefone.
- **Data de Nascimento**: Data de nascimento do usuário.
- **Endereço**: Endereço completo do usuário.

## Endpoints da API

### Usuários

- **GET /usuarios**: Lista todos os usuários cadastrados.
- **POST /usuarios**: Adiciona um novo usuário.
- **GET /usuarios/{id}**: Busca um usuário pelo ID.
- **PUT /usuarios/{id}**: Atualiza as informações de um usuário.
- **DELETE /usuarios/{id}**: Deleta um usuário pelo ID.

### Interface do Usuário

- **GET /usuarios-view**: Exibe a lista de usuários em uma interface web.
- **GET /usuarios-view/novo**: Exibe o formulário para adicionar um novo usuário.
- **POST /usuarios-view/salvar**: Salva um novo usuário ou atualiza um existente.
- **GET /usuarios-view/editar/{id}**: Exibe o formulário para editar um usuário.
- **GET /usuarios-view/deletar/{id}**: Deleta um usuário e redireciona para a lista de usuários.

## Como Executar

### Pré-requisitos

- **Java JDK 17**
- **H2 Database** (Não é necessário instalar, pois está configurado para usar em memória)
- **Maven**
- **IDE como IntelliJ IDEA, Eclipse ou VS Code**

### Instruções de Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/EOLucas-Martins/cadastro-usuarios.git
   cd cadastro-usuarios
2. Compile e execute a aplicação
3. Acesse a aplicação no navegador em: http://localhost:8080/usuarios.

### Licença
Este projeto está licenciado sob a MIT License.

###Contato
Para mais informações, você pode entrar em contato com os autores do projeto através dos e-mails:

lucas.martins54@fatec.sp.gov.br
pedro.aguiar@fatec.sp.gov.br
pedro.silva317@fatec.sp.gov.br


