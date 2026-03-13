package Lista;

import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores de A e B, respectivamente: ");

        String valor1 = sc.next();
        String valor2 = sc.next();

        String valor3 = valor1;
        valor1 = valor2;

        System.out.println("Agora A e B são: ");
        System.out.println("A: " + valor1 + "\nB: " + valor3 );
    }
}
