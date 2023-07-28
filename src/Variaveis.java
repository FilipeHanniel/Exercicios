public class Variaveis {

    public static void main(String[] args) {
        
        double precoProduto = 115.0;
        double descontoPercentual = 5.0;
        double desconto, precoComDesconto;

        System.out.println("========================================");
        System.out.println("--------------PRODUTOS---------------");
        
        System.out.println("O preço do produto é de R$" + precoProduto);
        System.out.println("_______________________________________________________________");
        System.out.println("O desconto será de " + descontoPercentual + "%.");
        desconto = (precoProduto * descontoPercentual) / 100;
        precoComDesconto = precoProduto - desconto;
        System.out.println("_________________________________________________________________");
        System.out.println("Com o desconto o preço final do produto será de: R$" + precoComDesconto );
        System.out.println("Fim!");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        

    }
    
}
