package Lista.Desafio;

public class Usuario extends AbsPessoa {
    private int numCadastro;

    public int getNumCadastro() {
        return numCadastro;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Usuário: " + getNumCadastro());
    }
}
