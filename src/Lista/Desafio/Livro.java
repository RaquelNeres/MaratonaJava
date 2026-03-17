package Lista.Desafio;

public class Livro implements Emprestavel {
    private String titulo;
    private String autor;
    private StatusLivro status;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = StatusLivro.DISPONIVEL;
    }

    @Override
    public void emprestar(Usuario usuario) {
        if (status == StatusLivro.DISPONIVEL) {
            this.status = StatusLivro.EMPRESTADO;
            System.out.println(titulo + " emprestado para " + usuario.getNumCadastro());
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