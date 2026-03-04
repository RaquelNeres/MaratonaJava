package Lista;

// - Leia o salário mínimo (R$ 1.293,20) e o salário de um usuário.
// - Calcule quantos salários mínimos ele ganha.

import java.util.Scanner;

public class Salario {
    // public static final float salario_min = 1293.20f; // variavel estatica que pode ser usada em qualquer lugar do codigo 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;

        System.out.println("Digite o valor do salario minimo: ");
        float salario_min = scanner.nextFloat();

        System.out.println("Digite seu salario: ");
        int salario = scanner.nextInt();

        while (salario > salario_min){
            cont += 1;
            salario -= salario_min;
        }

        System.out.println("Voce ganha " + cont + " salario minimo");
        
        scanner.close();
    }
}
