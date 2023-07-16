import java.util.Scanner;

public class exerc06 {

    public static void main(String[] args) {
        
        float valor;
        float somaValor = 0;
        int cont = 0;
        int ateMedia = 0;
        int acimaMedia = 0;
        float media = 0;

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
                media = somaValor / cont;
                if (valor <= media) {
                    ateMedia += 1;
                } else {
                    acimaMedia += 1;
                }
            }
           
        } while (valor != 0);
        
        System.out.println("A média dos salários digitados é: " + media);
        System.out.println("A quantidade de salários até a média são: " + ateMedia);
        System.out.println("A quantidade de salarios acima da media são: " + acimaMedia);

        sc.close();

    }
    
}
