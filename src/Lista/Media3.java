package Lista;

import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 notas separados por espaço ou Enter:");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.print(String.valueOf((float) (n1 + n2 + n3) / 3));
    }
}
