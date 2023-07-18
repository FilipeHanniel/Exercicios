import java.util.Scanner;

public class exerc06a {
    public static void main(String[] args) {
        
        float valor;
        float somaValor = 0;
        int cont = 0;
        int ateMedia = 0;
        int acimaMedia = 0;
        float media = 0;
        int laco;

        Scanner sc = new Scanner(System.in);

        System.out.println(" === MÉDIA SALARIAL ===");
        System.out.print("Digite quantos salários deseja digitar: ");
        laco = sc.nextInt();
        
        for (int i = 0; i < laco; i++) {
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
        }
        
        
        System.out.println("A média dos salários digitados é: " + media);
        System.out.println("A quantidade de salários até a média são: " + ateMedia);
        System.out.println("A quantidade de salarios acima da media são: " + acimaMedia);

        sc.close();

    }
}
