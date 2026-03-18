package Lista.Desafio;

import java.io.*;
import java.util.Scanner;

public class OpenBancos {
    protected static void usuarios(){
        try {
            File f = new File("./src/Lista/Desafio/Banco/usuarios.txt");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dados = linha.split("; ");

                if (dados.length >= 6){
                    Usuario usuario = new Usuario(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], dados[6]);
                    usuario.exibirInfo();
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    protected static void livros(){
        try {
            File f = new File("./src/Lista/Desafio/Banco/livros.txt");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dados = linha.split("; ");

                if (dados.length >= 6){
                    Livro livro = new Livro(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5]);
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    protected static void bibliotecarios(){
        try {
            File f = new File("./src/Lista/Desafio/Banco/bibliotecarios.txt");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dados = linha.split("; ");

                if (dados.length >= 6){
                    Bibliotecario bibliotecario = new Bibliotecario(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5]);
                    bibliotecario.exibirInfo();
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
