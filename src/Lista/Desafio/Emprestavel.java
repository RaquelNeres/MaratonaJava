package Lista.Desafio;

public interface Emprestavel {
    void emprestar(Usuario usuario);
    void devolver();
    boolean isDisponivel();
}