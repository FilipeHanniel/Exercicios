import java.util.Scanner;

public class EstruturaDeDecisao {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================================");
        System.out.print("Informe o preço do produto: ");
        double preco = Double.parseDouble(sc.nextLine());
        boolean produtoAltoValor = preco >= 100;
        double percentualDesconto = 0;
        if (produtoAltoValor) {
            percentualDesconto = 5;
        } else {
            System.out.println("Não será aplicado desconto algum.");
        }
        double desconto = (preco * percentualDesconto) / 100;
        double precoComDesconto = preco - desconto;
        System.out.println("O preço final do produto é de R$ " + precoComDesconto + ".");
        System.out.println("Fim!");
        System.out.println("========================================");

        sc.close();
    }
    
}
