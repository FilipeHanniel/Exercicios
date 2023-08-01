public class OperadoresLogicos {

    public static void main(String[] args) {
        
        System.out.println("==============================================");
        boolean usuariVip = true;
        boolean  comprasAltoValor = true, menorDeIdade = true, temBebidaAlcool = true;
        System.out.println("Usuário é VIP? -> " + usuariVip);
        System.out.println("A compra é de alto valor? -> " + comprasAltoValor);
        System.out.println("Cliente é menor de idade? -> " + menorDeIdade);
        System.out.println("Tem Bebida alcóolica no carrinho? -> " + temBebidaAlcool);
        System.out.println("============================================");
        boolean aplicarDesconto = usuariVip && comprasAltoValor;

        System.out.println("O desconto deve ser aplicado? -> " + "(usuariVip && comprasAltoValor): " + aplicarDesconto);
        aplicarDesconto = usuariVip || comprasAltoValor;
        System.out.println("O desconto deve ser aplicado? -> " + "(UsuarioVip || comprasAltoValor): " + aplicarDesconto);
        boolean permiteConcluirCompra = !menorDeIdade || !temBebidaAlcool;
        System.out.println("Pode concluir a compra? " + "(!menorDeIdade || !temBebidaAlcool): " + permiteConcluirCompra);
        System.out.println("Fim!");
        System.out.println("===================================================================");
    }
    
}
