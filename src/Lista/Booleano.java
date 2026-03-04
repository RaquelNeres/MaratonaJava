package Lista;

// - Leia dois valores lógicos e determine se ambos são VERDADEIRO ou FALSO.
import java.util.Scanner;

public class Booleano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor lógico (true/false): ");
        boolean valor1 = scanner.nextBoolean();

        System.out.println("Digite o segundo valor lógico (true/false): ");
        boolean valor2 = scanner.nextBoolean();
        
        if (valor1 && valor2) {
            System.out.println("Ambos são VERDADEIRO");
        }  
        else if (!valor1 && !valor2) {
            System.out.println("Ambos são FALSO");
        }
        else {
            System.out.println("Um é VERDADEIRO e o outro é FALSO");
        }
        scanner.close();
    }
    
}
