package Lista.Desafio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OpenBancos {
    protected static List<Usuario> usuarios() {
        var path = Path.of("./src/Lista/Desafio/Banco/usuarios.txt");

        try (Stream<String> lines = Files.lines(path)) {
            return lines.skip(1)
                    .map(linha -> linha.split(";"))
                    .filter(dados -> dados.length >= 5)
                    .map(d -> {
                        String livros = (d.length > 5) ? d[5] : "Nenhum";

                        return new Usuario(d[0], d[1], d[2], d[3], d[4], livros);
                    })
                    .toList();

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    protected static List<Livro> livros(){
        var path = Path.of("./src/Lista/Desafio/Banco/livros.txt");

        // declara a variavel e recebe/mapeia o anterior
        try (Stream<String> lines = Files.lines(path)) {
            return lines.skip(1)
                .map(linha -> linha.split(";"))
                    .filter(dados -> dados.length >= 6)
                    .map(d -> {
                        return new Livro(d[0], d[1], d[2], d[3], d[4], d[5]);
                    })
                    .toList();

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    protected static List<Bibliotecario> bibliotecarios(){
        var path = Path.of("./src/Lista/Desafio/Banco/bibliotecarios.txt");

        try (Stream<String> lines = Files.lines(path)) {
            return lines.skip(1)
                    .map(linha -> linha.split(";"))
                    .filter(dados -> dados.length >= 6)
                    .map(d -> {
                        return new Bibliotecario(d[0], d[1], d[2], d[3], d[4], d[5]);
                    })
                    .toList();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
