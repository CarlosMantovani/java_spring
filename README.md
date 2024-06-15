# Projeto de Exemplo com Spring Boot

Este é um projeto de exemplo criado com o auxílio do curso da Udemy "Java COMPLETO Programação Orientada a Objetos + Projetos
". O projeto implementa um simples sistema de gerenciamento de usuários com operações CRUD utilizando Spring Boot.

## Funcionalidades

- Listagem de usuários
- Busca de usuário por ID
- Criação de novo usuário
- Atualização de usuário existente
- Remoção de usuário

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- Banco de Dados H2
- Postman

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/CarlosMantovani/java_spring.git
   ```
2. Importe o projeto em sua IDE como um projeto Maven.

3. Execute a classe principal `CourseApplication`.

4. Os endpoints estarão disponíveis em `http://localhost:8080/users`.

5. Acessar Banco de dados h2 em `localhost:8080/h2-console`.

## Exemplo de Uso

### Listar Usuários
```bash
GET http://localhost:8080/users
```

### Buscar Usuário por ID
```bash
GET http://localhost:8080/users/1
```

### Criar Novo Usuário
```bash
POST http://localhost:8080/users
Content-Type: application/json

{
    "name": "Novo Usuário",
    "email": "novo.usuario@example.com"
}
```

### Atualizar Usuário Existente
```bash
PUT http://localhost:8080/users/1
Content-Type: application/json

{
    "name": "Usuário Atualizado",
    "email": "usuario.atualizado@example.com"
}
```

### Remover Usuário
```bash
DELETE http://localhost:8080/users/1
```

## Contribuição

Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Créditos

Este projeto foi desenvolvido com ajuda do curso "Java COMPLETO Programação Orientada a Objetos + Projetos" da Udemy, ministrado por "Nelio Alves".
