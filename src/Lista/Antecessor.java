package Lista// - Leia um número inteiro e imprima seu antecessor e sucessor.

import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = scanner.nextInt();

        System.out.println("Seu antecessor é: " + (n - 1));
        System.out.println("Seu sucessor é: " + (n + 1));
    }
}
