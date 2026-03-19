package Lista.Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Usuario> listaUsuarios = OpenBancos.usuarios();
        List<Bibliotecario> listaBibliotecarios = OpenBancos.bibliotecarios();
        List<Livro> listaLivros = OpenBancos.livros();

        System.out.println("-----------Sistema da biblioteca-----------");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Buscar livro");
        System.out.println("3 - Listar livros");

        System.out.println("4 - Pegar livro");
        System.out.println("5 - Devolver livro");

        System.out.println();
        System.out.println("Digite sua ação: ");
        int acao = sc.nextInt();

        switch (acao) {
            case 1:
                System.out.println();
                break;
            case 2:
                break;
            case 3:
                if (listaLivros.isEmpty()) {
                    System.out.println("Nenhum livro encontrado no banco de dados.");
                } else {
                    System.out.println("--- Lista de Livros ---");
                    for (Livro livro : listaLivros) {
                        livro.check(); // Exibe as informações do livro
                    }
                    System.out.println("-----------------------");
                }
                break;
            case 4:
                break;
            case 5:
                break;
            default:  // (nenhuma das opções)
                System.out.println("Nenhuma das opções foi selecionadas");
        }

        sc.close();
    }
}
