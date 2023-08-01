import java.util.Scanner;

public class matrizTeste {

    public static void main(String[] args) {
        
        int[][] matrizValores = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Matriz M[3][3]\n"); //i -> linha matriz; j -> coluna matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Insira o elemento M[%d][%d]: ", i+1, j+1);
                matrizValores[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("\nA Matriz ficou: \n");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t %d \t", matrizValores[i][j]);
            }
            System.out.println("|");
        }
        sc.close();

    }
    
}
