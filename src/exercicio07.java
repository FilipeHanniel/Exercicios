import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {
        
        
        float valor;
        char sexo;
        int idade;
        int contMasc = 0; //Quantidade de eleitores masculinos.
        int contFem = 0;
        float idadeMasc = 0; //Soma das idades dos eleitores masculinos.
        float idadeFem = 0;
        int votos10 = 0;
        int votos20 = 0;
        int votos30 = 0;
        int votos40 = 0;
        int votos50 = 0;

        
       
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
                
                if (sexo == 'm') {
                    contMasc += 1; 
                    idadeMasc = idadeMasc + idade;
                } else {
                    contFem += 1;
                    idadeFem = idadeFem + idade;
                }

                if (valor == 10) {
                    votos10 += 1;
                } else if (valor == 20) {
                    votos20 += 1;
                } else if (valor == 30) {
                    votos30 += 1;
                } else if (valor == 40) {
                    votos40 += 1;
                } else {
                    votos50 += 1;
                }
                
            }
           
        } while (valor != 0);
        
        System.out.println("Quantidade de eleitores masculinos: " + contMasc);
        System.out.println("Quantidade de eleitores femininos: " + contFem);
        System.out.println("Idade média dos eleitores masculinos é: " + idadeMasc / contMasc + " anos.");
        System.out.println("Idade média dos eleitores femininos é: " + idadeFem / contFem + " anos.");
        

        sc.close();

    }
    
}
