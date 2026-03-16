package Lista;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero para a tabuada: ");
        int num = sc.nextInt();

        int i = 1;

        while (i < 11) {
            System.out.println(num + " * " + i + " = " + (num*i));

            i++;
        }
    }
}
