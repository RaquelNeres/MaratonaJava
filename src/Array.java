public class Array {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        // 31,28,31,30 dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 35;
        dias[1][1] = 26;
        dias[1][2] = 37;

        // modo 1
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dias[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // modo 2
        for(int[] arrBase: dias){ // variavel de referencia, cada interação recebe uma linha inteira do array
            for(int num: arrBase){ // percorre essa linha
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
