package Lista;

// - Leia os valores de `A`, `B` e `C`.
// - Imprima a soma de `A` e `B` e verifique se o resultado é menor que `C`.

// nextInt() para inteiros, 
// nextDouble() para números de ponto flutuante 
// nextLine()

import java.util.Scanner;

public class SomaComp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B");
        int b = scanner.nextInt();

        System.out.println("Digite o valor de C");
        int c = scanner.nextInt();

        System.out.println("A + B = " + (a + b));
        if ((a + b) < c) {
            System.out.println("A soma de A e B é menor que C");
        } else {
            System.out.println("A soma de A e B não é menor que C");
        }

        scanner.close();
    }
}