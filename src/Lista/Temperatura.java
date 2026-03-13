package Lista;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        int fah = sc.nextInt();

        float celsius = (float) 5 * (fah - 32) / 9;

        System.out.println("Temperatura em Celsius: " + celsius);

    }
}
