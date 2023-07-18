import java.util.Scanner;

public class exerc05a {
    public static void main(String[] args) {
        
        float valor;
        float somaValor = 0;
        int cont = 0;
        int laco;

        Scanner sc = new Scanner(System.in);

        System.out.println(" === VALOR MÉDIO ===");        
        System.out.print("Digite quantos números deseja digitar: ");
        laco = sc.nextInt();
        
        for (int i = 0; i < laco; i++) {
            System.out.print("Digite um valor: ");
            valor = sc.nextFloat();
            if (valor != 0) {
                somaValor = somaValor + valor;
                cont += 1;
            }
        }
        
        
        System.out.println("A média dos valores digitados é: " + somaValor / cont);

        sc.close();

    }
}
