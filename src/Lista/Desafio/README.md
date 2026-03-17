# Desafio Final — Sistema de Biblioteca

## 📖 Sistema de Gerenciamento de Biblioteca
Contexto: Você vai criar um sistema de console para gerenciar livros, usuários e empréstimos.

## Requisitos obrigatórios:
Orientação a Objetos (aplica aulas 60–95)

- Classe abstrata Pessoa com herança para Usuario e Bibliotecario
- - Classe base entre as classes hereditarias
- Interface Emprestavel implementada pela classe Livro
- -  Metodo obrigatorio pelo Livro
- Enum StatusLivro com DISPONIVEL, EMPRESTADO, RESERVADO
- Polimorfismo no método exibirInfo() em cada classe

## Lógica (aplica aulas 1–59)

- Cadastrar, buscar e listar livros
- Realizar e devolver empréstimos
- Calcular multa por atraso (R$ 1,00/dia)
- Validações com if/else, loops e arrays/ArrayList

## Bônus desafiador:

- Persistir dados em arquivo .txt com leitura e escrita
- Adicionar menu interativo no console com Scanner
- Tratar exceções com try/catch para entradas inválidas

```
Estrutura esperada de classes:
Pessoa (abstrata)
├── Usuario
└── Bibliotecario

Emprestavel (interface)
└── Livro (implementa)

Emprestimo
└── relaciona Usuario + Livro + datas

BibliotecaApp (main)
```
