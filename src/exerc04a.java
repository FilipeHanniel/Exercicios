import java.util.Scanner;

public class exerc04a {
    
    public static void main(String[] args) {
        
        float valor;
        float maiorValor = -9999999;
        int laco;

        Scanner sc = new Scanner(System.in);

        System.out.println(" === Descubra se é Par ou Ímpar ===");
        System.out.print("Digite quantos números deseja digitar: ");
        laco = sc.nextInt();
        
        for (int i = 0; i < laco; i++) {
            System.out.print("Digite um valor: ");
            valor = sc.nextFloat();
            if (valor != 0) {
                if ((valor % 2) == 0) {
                    System.out.println(valor + " é par!");
                } else {
                    System.out.println(valor + " é ímpar!");
                }
            }
        }
        
        
        sc.close();
    }
}
