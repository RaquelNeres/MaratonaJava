package Lista.Desafio;

import java.io.*;
import java.util.Scanner;

public class OpenBancos {
    public static void usuarios(){
        try {
            File f = new File("Banco/usuarios.txt");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. ");
            throw new RuntimeException(e);
        }
    }


}
