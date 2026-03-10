package Lista;

import java.util.Scanner;

public class MediaApro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 4 notas separados por espaço ou Enter:");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.next();

        float media = (float) (n1 + n2 + n3 + n4) / 4;

        if (media >= 7){
            System.out.printf(nome + " atingiu a media");
        }
        else {
            System.out.println("Não atingiu a media, nota: " + media);
        }
    }
}
