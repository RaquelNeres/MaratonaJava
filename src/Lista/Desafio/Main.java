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
                System.out.println("Preguiça");
                break;
            case 2:
                System.out.println("Digite o nome do livro: ");
                String busca = sc.next();
                sc.nextLine();

                System.out.println(">> Livros encontrados: ");
                for (Livro livro : listaLivros) {
                    String titulo = livro.getTitulo();

                    if (titulo.toLowerCase().contains(busca.toLowerCase())) {
                        System.out.println(titulo);
                    }
                }

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
                System.out.println("Digite o nome do livro que voce quer ler: ");
                String buscaL = sc.next();
                sc.nextLine();

                System.out.println(">> Livros encontrados: ");
                for (Livro livro : listaLivros) {
                    String titulo = livro.getTitulo();

                    if (titulo.toLowerCase().contains(buscaL.toLowerCase())) {
                        System.out.println(titulo);
                        System.out.println("Quer ler esse livro ? True or False");
                        boolean resposta = sc.nextBoolean();

                        if (resposta){
                            System.out.println("Quem é você? ");
                            String nome = sc.next();

                            for (Usuario usuario : listaUsuarios){
                                String n = usuario.getNome();

                                if (n.toLowerCase().contains(nome.toLowerCase())){
                                    livro.emprestar(usuario);

                                }
                            }
                        }
                    }
                }

                break;
            case 5:
                System.out.println("Digite o livro que voce quer devolver: ");
                String livr = sc.next();

                System.out.println(">> Livros encontrados: ");
                for (Livro livro : listaLivros) {
                    String titulo = livro.getTitulo();

                    if (titulo.toLowerCase().contains(livr.toLowerCase())) {
                        System.out.println(titulo);
                        System.out.println("Quer devolver esse livro ? True or False");
                        boolean resposta = sc.nextBoolean();

                        if (resposta){
                            System.out.println("Quem é você? ");
                            String nome = sc.next();

                            for (Usuario usuario : listaUsuarios){
                                String n = usuario.getNome();

                                if (n.toLowerCase().contains(nome.toLowerCase())){
                                    livro.devolver();

                                }
                            }
                        }
                    }
                }

                break;
            default:  // (nenhuma das opções)
                System.out.println("Nenhuma das opções foi selecionadas");
        }

        sc.close();
    }
}
