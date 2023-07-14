import java.util.Scanner;

public class exerc04 {

    public static void main(String[] args) {
        
        float valor;
        float maiorValor = -9999999;

        Scanner sc = new Scanner(System.in);

        System.out.println(" === Descubra se é Par ou Ímpar ===");
        System.out.println("Digite ZERO para sair.");
                
        do {
            System.out.print("Digite um valor: ");
            valor = sc.nextFloat();
            if (valor != 0) {
                if ((valor % 2) == 0) {
                    System.out.println(valor + " é par!");
                } else {
                    System.out.println(valor + " é ímpar!");
                }
            }
           
        } while (valor != 0);
        
        sc.close();
    }

    
    
}
