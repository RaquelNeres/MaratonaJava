package Lista.Desafio;

public class Usuario extends AbsPessoa {
    private String numCadastro;
    private String cel;
    private String emprestimos;

    public Usuario(String numCadastro, String nome, String cpf, String email, String cel, String s) {
        super(nome, cpf, email);
        this.numCadastro = numCadastro;
        this.cel = cel;
        this.emprestimos = s;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Usuário: " + super.getNome());
    }
}
