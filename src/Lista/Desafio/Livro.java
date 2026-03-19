package Lista.Desafio;

public class Livro implements Emprestavel {
    private String titulo;
    private String autor;
    private String isbn;
    private String anoPub;
    private String genero;
    private StatusLivro status;

    public Livro(String titulo, String autor, String isbn, String anoPub, String genero, String statu) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPub = anoPub;
        this.genero = genero;
        this.status = StatusLivro.DISPONIVEL;
        if ("EMPRESTADO".equalsIgnoreCase(statu)) {
            this.status = StatusLivro.EMPRESTADO;
        }
    }

    public void check(){
        System.out.println("O Livro '" + titulo + "' esta: " + status);
    }

    @Override
    public void emprestar(Usuario usuario) {
        if (status == StatusLivro.DISPONIVEL) {
            this.status = StatusLivro.EMPRESTADO;
            System.out.println(titulo + " emprestado para " + usuario.getNome());
        } else {
            System.out.println("Livro indisponível!");
        }
    }

    @Override
    public void devolver() {
        this.status = StatusLivro.DISPONIVEL;
        System.out.println(titulo + " devolvido com sucesso!");
    }

    @Override
    public boolean isDisponivel() {
        return status == StatusLivro.DISPONIVEL;
    }
}