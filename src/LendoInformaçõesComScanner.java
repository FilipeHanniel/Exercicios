import java.util.Scanner;

public class LendoInformaçõesComScanner {
    
    public static void main(String[] args) {
        
        double  distanciaPercorrida, deltaTempo, velocidadeMedia;

        System.out.println("=========================================================");
        Scanner leituraScanner = new Scanner(System.in);
        System.out.print("Digite a Distância: ");
        distanciaPercorrida = Double.parseDouble(leituraScanner.nextLine());
        System.out.print("Digite o tempo gasto para percorrer a distância informada: ");
        deltaTempo = Double.parseDouble(leituraScanner.nextLine());
        System.out.println("\n\n");
        System.out.println("Cálculo da Velocidade Média:");
        System.out.println("Variação de tempo = " + distanciaPercorrida + " Km");
        System.out.println("Variação de tempo = " + deltaTempo + " horas");
        System.out.println("Velocidade Média = " + distanciaPercorrida / deltaTempo + " Km/h");
        System.out.println("Fim!");
        System.out.println("==========================================================");

    }
}
