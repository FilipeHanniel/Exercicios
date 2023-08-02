import java.util.Scanner;

public class calcularAlturaPeso {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        int altura = 0, peso = 0, maiorAltura = -1, menorAltura = 1000, maiorPeso = -1, menorPeso = 1000;

        boolean loop = true;

        while (loop) {
            System.out.println("Digite altura ou zero para sair:");
            altura = Integer.parseInt(sc.nextLine());
            System.out.println("\n");

            if (altura != 0) {
                
                System.out.println("Informe o peso: ");
                peso = Integer.parseInt(sc.nextLine());
                System.out.println("\n");

                if (altura > maiorAltura) {
                    maiorAltura = altura;
                }
            }
        }


        sc.close();
    }
    
}
