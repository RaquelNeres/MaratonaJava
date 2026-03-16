package Lista.Desafio;

public class Bibliotecario extends AbsPessoa {


    @Override
    public void exibirInfo() {
        System.out.println("Bibliotecário: " + getNome());
    }
}
