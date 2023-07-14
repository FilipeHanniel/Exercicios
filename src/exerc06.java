import java.util.Scanner;

public class exerc06 {

    public static void main(String[] args) {
        
        float valor;
        float somaValor = 0;
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println(" === MÉDIA SALARIAL ===");
        System.out.println("Digite ZERO para sair.");
        System.out.println("Digite quantos salários quiser e encontre o valor médio!");
                
        do {
            System.out.print("Digite o salário do funcionário: ");
            valor = sc.nextFloat();
            if (valor != 0) {
                somaValor = somaValor + valor;
                cont += 1;
            }
           
        } while (valor != 0);
        
        System.out.println("A média dos salários digitados é: " + somaValor / cont);

        sc.close();

    }
    
}
