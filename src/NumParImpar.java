import java.util.Scanner;

public class NumParImpar {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("=====================");

        double moduloResto;
        int numeroQualquer;
        boolean loop = true;

        do {
            System.out.println("Digite um número qualquer ou zero para sair: ");
            numeroQualquer = Integer.parseInt(sc.nextLine());
            System.out.println("\n");
            if (numeroQualquer == 0) {
                loop = false;
            } else {
                moduloResto = numeroQualquer % 2;
                if (moduloResto == 0) {
                    System.out.println("O número " + numeroQualquer + " é par.");
                } else {
                    System.out.println("O número " + numeroQualquer + " é ímpar.");
                }
            }
        } while (loop);
        sc.close();
    }
    
}
