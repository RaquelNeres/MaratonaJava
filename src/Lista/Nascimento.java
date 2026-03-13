package Lista;

import java.util.Scanner;

public class Nascimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos anos voce tem ? ");
        int idade = sc.nextInt();

        int dias = idade * 365;
        int mes = idade * 12;

        System.out.printf("Voce tem " + dias + " dias e " + mes + " meses de vida");


    }
}
