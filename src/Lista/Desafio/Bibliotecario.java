package Lista.Desafio;

public class Bibliotecario extends AbsPessoa {
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Bibliotecário: " + getMatricula());
    }
}
