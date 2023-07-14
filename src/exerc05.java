import java.util.Scanner;

public class exerc05 {

    public static void main(String[] args) {
        
        float valor;
        float somaValor = 0;
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println(" === VALOR MÉDIO ===");
        System.out.println("Digite ZERO para sair.");
        System.out.println("Digite quantos valores quiser e encontre o valor médio!");
                
        do {
            System.out.print("Digite um valor: ");
            valor = sc.nextFloat();
            if (valor != 0) {
                somaValor = somaValor + valor;
                cont += 1;
            }
           
        } while (valor != 0);
        
        System.out.println("A média dos valores digitados é: " + somaValor / cont);

        sc.close();

    }
    
}
