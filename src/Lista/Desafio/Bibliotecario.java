package Lista.Desafio;

public class Bibliotecario extends AbsPessoa {
    private String matricula;
    private String turno;
    private String cargo;
    
    public Bibliotecario( String matricula, String nome, String cpf, String email, String turno, String cargo) {
        super(nome, cpf, email);
        this.matricula = matricula;
        this.turno = turno;
        this.cargo = cargo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Bibliotecário: " + nome);
    }
}
