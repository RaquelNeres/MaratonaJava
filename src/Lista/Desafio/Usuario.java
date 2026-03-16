package Lista.Desafio;

public class Usuario extends AbsPessoa {

    @Override
    public void exibirInfo() {
        System.out.println("Usuário: " + getNome());
    }
}
