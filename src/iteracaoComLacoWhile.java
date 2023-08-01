import java.util.Random;
import java.util.Scanner;

public class iteracaoComLacoWhile {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Random valorRandomico = new Random();
        System.out.println("==============================================");
        int numeroAleatorio = valorRandomico.nextInt(10);
        boolean tentarNovamente = true;
        System.out.println("Aperte CTRL+C, a qualquer momento para 'sair'.");
        while (tentarNovamente) {
            System.out.print("Tente adivinhar o número de 0 a 9: ");
            int num = Integer.parseInt(sc.nextLine());
            tentarNovamente = numeroAleatorio != num;
            if (tentarNovamente) {
                System.out.println("Errado!");
            }
        }
        System.out.println("Parabéns! Era o número " + numeroAleatorio + " mesmo.");
        System.out.println("Fim!");
        System.out.println("===========================================");
        sc.close();

    }
}
