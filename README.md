@AUTHOR: Auricelio Freitas
DATE: 30/03/2024
------------------------------

- DEPENDÊNCIAS 

  O projeto será implementado conforme abaixo: 
  
    IDE: Spring Boot (STS)
    Banco de Dados: H2
    Gerenciador de Dependências: Maven
    Linguagem: Java
    Versionamento: GitHub
    Testes da API: Postman



- CASO

  Uma Universidade precisa cadastrar o dados dos seus alunos, conforme segue abaixo:
  
    NOME
    CPF
    DATA DE NASCIMENTO
    RENDA 


- TESTES A SEREM REALIZADOS NO POSTMAN

  BUSCA PAGINA DE CLIENTES
  
    GET /clients?page=0&sort=name,asc
  
  BUSCA DE CLIENTE POR ID
  
    GET /clients/1
  
  INSERÇÃO DE NOVO CLIENTE
  
    POST /clients
    {
      "name": "Auricelio Freitas",
      "cpf": "12345678901",
      "birthDate": "1982-08-28T10:30:00Z",
      "income": 15089.0,
    }

  ATUALIZAÇÃO DE CLIENTE
  
    PUT /clients/1
    {
      "name": "Auricelio Moreira",
      "cpf": "12345678901",
      "birthDate": "1982-08-28T10:30:00Z",
      "income": 15089.0,
    }

  DELEÇÃO DE CLIENTE
  
   DELETE /clients/1


