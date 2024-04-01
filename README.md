@AUTHOR: Auricelio Freitas, Miguel Soares

DATA: 30/03/2024

-----------------------------------------------------------

- DEPENDÊNCIAS 

    O projeto será implementado conforme abaixo: 
    
      IDE: Spring Tool Suite 4 (STS)

      Banco de Dados: H2

      Gerenciador de Dependências: Maven

      Linguagem: Java (JDK-20)

      Versionamento: GitHub

      Testes da API: Postman



- CASO

    Uma Universidade precisa cadastrar os seus alunos, conforme segue abaixo:
  
      NOME
  
      CPF
  
      DATA DE NASCIMENTO
  
      RENDA 


- TESTES A SEREM REALIZADOS NO POSTMAN

    BUSCA PAGINA DE ALUNOS
    
      GET /students?page=0&sort=name,asc
    
    BUSCA DE ALUNO POR ID
    
      GET /students/1
    
    INSERIR NOVO ALUNO
    
      POST /students
      {
        "name": "Auricelio Freitas",
        "cpf": "12345678901",
        "birthDate": "1982-08-28T10:30:00Z",
        "income": 15089.0,
      }
  
    ATUALIZAR ALUNO
    
      PUT /students/1
      {
        "name": "Auricelio Moreira",
        "cpf": "12345678901",
        "birthDate": "1982-08-28T10:30:00Z",
        "income": 15089.0,
      }
  
    DELETAR ALUNO
    
       DELETE /clients/1
  

