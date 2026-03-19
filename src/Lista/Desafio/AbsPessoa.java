package Lista.Desafio;

public abstract class AbsPessoa {
    protected String nome;
    protected String cpf;
    protected String email;

    public AbsPessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public abstract void exibirInfo();

}
