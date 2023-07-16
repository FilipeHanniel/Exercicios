import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {
        
        
        float valor;
        char sexo;
        int idade;

        float somaValor = 0;
        int cont = 0;
        int ateMedia = 0;
        int acimaMedia = 0;
        float media = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println(" === PESQUISA ELEITORAL GOIÂNIA ===");
        System.out.println("Digite ZERO para sair.");
        System.out.println("Digite os dados, Nº DO CANDIDATO, SEXO e IDADE DO ELEITOR.");
                
        do {
            do {
                System.out.print("Digite o número do candidato: ");
                valor = sc.nextFloat();
                if ((valor != 10) & (valor != 20) & (valor != 30) & (valor != 40) & (valor != 50)) {
                    System.out.println("Nº do candidato inválido, por gentiliza digite um valor válido");
                    System.out.println("Nº 10; Nº 20; Nº 30; Nº 40; Nº 50");
                }
            } while ((valor == 10) | (valor == 20) | (valor == 30) | (valor == 40) | (valor == 50));
            if (valor != 0) {
                System.out.println("Digite o Sexo do eleitor (masculino='m'/feminino = 'f'): ");
                sexo = sc.next().charAt(0);
                System.out.println("Digite a idade do eleitor: ");
                idade = sc.nextInt();
                /*
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
