package Lista
// - Leia um valor e aplique um reajuste de 5%.

import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor original: ");
        double valorOriginal = scanner.nextDouble();

        double reajuste = valorOriginal * 0.05;
        double valorFinal = valorOriginal + reajuste;
        
        System.out.printf("Valor original: %.2f\n", valorOriginal);
        System.out.printf("Reajuste de 5%%: %.2f\n", reajuste);
        System.out.printf("Valor final com reajuste: %.2f\n", valorFinal);
        
        scanner.close();    
    }
    
}
