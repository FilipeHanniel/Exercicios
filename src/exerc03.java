import java.util.Scanner;

public class exerc03 {

    public static void main(String[] args) {
        
        float valor;
        float maiorValor = -9999999;

        Scanner sc = new Scanner(System.in);

        System.out.println(" === Descubra o maior ===");
        System.out.println("Digite ZERO para sair.");
                
        do {
            System.out.print("Digite um valor: ");
            valor = sc.nextFloat();
            if (valor != 0) {
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
            }
           
        } while (valor != 0);

        System.out.println(" O maior valor é: " + maiorValor);

        sc.close();
    }
    
}
