package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float valorFinal = 0;

        List<String> formas = new ArrayList<>(List.of(
                "Dinheiro/Pix à vista",
                "Cartão à vista",
                "Cartão em 2x",
                "Cartão 3x ou mais"
        ));

        System.out.println("Digite o valor do produto: ");
        float valor = sc.nextFloat();
        sc.nextLine();

        System.out.println("\nFormas de pagamento:");
        for (String forma : formas) {
            System.out.println(forma);
        }

        System.out.println("Selecione a forma de pagamento:");
        String pagamento = sc.nextLine();

        switch (pagamento) {
            case "Dinheiro/Pix à vista":
                valorFinal = (float) (valor - (valor * 0.15));
                break;

            case "Cartão à vista":
                valorFinal = (float) (valor - (valor * 0.10));
                break;

            case "Cartão em 2x":
                valorFinal = valor;
                break;

            case "Cartão 3x ou mais":
                valorFinal = (float) (valor + (valor * 0.10));
                break;

            default:
                System.out.println("Pagamento inválido");
                return;
        }

        System.out.println("O valor final ficou: " + valorFinal);
    }
}