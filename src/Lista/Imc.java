package Lista;

// - Leia peso e altura.
// Calcule o IMC: IMC = peso / (altura²)
// Classifique conforme a tabela:
// IMC	Condição
// < 18,5	Abaixo do peso
// 18,6 - 24,9	Peso ideal (parabéns)
// 25,0 - 29,9	Levemente acima do peso
// 30,0 - 34,9	Obesidade grau I
// 35,0 - 39,9	Obesidade grau II (severa)
// ≥ 40	Obesidade grau III (mórbida)

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double imc;

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        imc = peso / (altura * altura);
        
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }	
        else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso ideal (parabéns)");
        }
        else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Levemente acima do peso");
        }
        else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade grau I");
        }
            else if (imc >= 35.0 && imc <= 39.9){   
            System.out.println("Obesidade grau II (severa)");
        }
        else if (imc >= 40){
            System.out.println("Obesidade grau III (mórbida)");
        }

        scanner.close();
    }
    
}
