package Lista;

// - Leia dois valores inteiros A e B.
// - Se forem iguais, some-os; caso contrário, multiplique-os.
// - armazene o resultado em C e imprima.

import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0;

        System.out.println("Digite A: ");
        int a = scanner.nextInt();

        System.out.println("Digite B: ");
        int b = scanner.nextInt();

        if (a == b){
            c = (a + b);
        } else {
            c = (a * b);
        }
        
        System.out.println(c);

        scanner.close();
    }
    
}
