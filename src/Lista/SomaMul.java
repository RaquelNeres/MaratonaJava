package Lista;

// - Leia dois valores inteiros A e B.
// - Se forem iguais, some-os; caso contrário, multiplique-os.
// - armazene o resultado em C e imprima.

import java.util.Scanner;

public class SomaMul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite A: ");
        int a = scanner.nextInt();

        System.out.println("Digite B: ");
        int b = scanner.nextInt();

        int c = 0;
        if (a == b){
            c = (a + b);
        } else {
            c = (a * b);
        }

        System.out.println(c);

        scanner.close();
    }
    
}
