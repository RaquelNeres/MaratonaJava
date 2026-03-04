// package Lista

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("O número " + a + " é par.");
        } else {
            System.out.println("O número " + a + " é ímpar.");
        }
        if (a > 0) {
            System.out.println("O número " + a + " é positivo.");
        } else if (a < 0) {
            System.out.println("O número " + a + " é negativo.");
        }

        scanner.close();
    }
}
