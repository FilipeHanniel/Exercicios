import java.util.Scanner;

public class exerc03a {
    
    public static void main(String[] args) {
        
        float valor;
        float maiorValor = -9999999;
        int laco;

        Scanner sc = new Scanner(System.in);

        System.out.println(" === Descubra o maior ===");        
        System.out.print("Digite quantos números deseja digitar: ");
        laco = sc.nextInt();
        for (int i = 0; i < laco; i++) {
            System.out.print("Digite um valor: ");
            valor = sc.nextFloat();
            if (valor != 0) {
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
            }
        }
       
        System.out.println(" O maior valor é: " + maiorValor);

        sc.close();
    }
}
