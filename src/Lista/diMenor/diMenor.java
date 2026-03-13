package Lista.diMenor;

import java.util.Scanner;

public class diMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome e idade do individuo ");

        String nome = sc.next();
        int idade = sc.nextInt();

        Pessoa p1 = new Pessoa(nome, idade);

        if (p1.idade >= 18) {
            System.out.println(p1.nome + " é maior de idade");
        }
        else {
            System.out.println(p1.nome + " não é maior de idade");
        }
    }
}
