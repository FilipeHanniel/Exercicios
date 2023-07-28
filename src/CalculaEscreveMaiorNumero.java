import java.util.Scanner;

public class CalculaEscreveMaiorNumero {

    public static void main(String[] args) {
        

        int numero1, numero2, numero3;

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================================\n===================================================");
        System.out.println("===============++++ TESTE DE MAIOR NÚMERO ++++============================\n");
        System.out.print("Digite o primeiro número: ");
        numero1 = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o segundo núemro: ");        
        numero2 = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o terceiro número: ");
        numero3 = Integer.parseInt(sc.nextLine());

        System.out.println("RESULTADO:\n");

        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("O maior número é " + numero1 + ".");
            } else if (numero2 > numero3) {
                System.out.println("O maior núero é " + numero2 + ".");
            } else {
                System.out.println("O maior núero é " + numero3 + ".");
            }
        } else if (numero2 > numero3) {
            System.out.println("O maior núero é " + numero2 + ".");
        } else {
            System.out.println("O maior núero é " + numero3 + ".");
        }

        sc.close();

        System.out.println("=========================================");

    }
    
}
