package Lista.Desafio;

public class Usuario extends AbsPessoa {
    private String numCadastro;
    private String nome;
    private String cpf;
    private String email;
    private String cel;

    public Usuario(String numCadastro, String nome, String cpf, String email, String cel, String dado, String s) {
        super(nome, cpf, email);
        this.numCadastro = numCadastro;
        this.cel = cel;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Usuário: " + nome);
    }
}
