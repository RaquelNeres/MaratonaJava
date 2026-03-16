Desafio Final — Sistema de Biblioteca

📖 Sistema de Gerenciamento de Biblioteca
Contexto: Você vai criar um sistema de console para gerenciar livros, usuários e empréstimos.


Pessoa (abstrata)
├── Usuario
└── Bibliotecario

Emprestavel (interface)
└── Livro (implementa)

Emprestimo
└── relaciona Usuario + Livro + datas

BibliotecaApp (main)