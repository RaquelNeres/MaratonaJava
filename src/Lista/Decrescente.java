package Lista// - Leia três valores inteiros diferentes e imprima-os em ordem decrescente.

import java.util.Scanner;

public class Decrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int um = 0, dois = 0, tres = 0;

        for (int i = 1; i <= 3; i ++){
            System.out.println("Digite o " + i + " numero: ");

            int valor = scanner.nextInt();

            if (valor > um){
                tres = dois;
                dois = um;
                um = valor;
            }
            else if (valor > dois){
                tres = dois;
                dois = valor;
            }
            else {
                tres = valor;
            }
        }

        System.out.println(um + " " + dois + " " + tres);
    }    
}
