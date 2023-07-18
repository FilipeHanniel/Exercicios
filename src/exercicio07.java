import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        float valor;
        char sexo;
        int idade;
        int contMasc = 0; // Quantidade de eleitores masculinos.
        int contFem = 0;
        float idadeMasc = 0; // Soma das idades dos eleitores masculinos.
        float idadeFem = 0;
        int votos10 = 0;
        int votos20 = 0;
        int votos30 = 0;
        int votos40 = 0;
        int votos50 = 0;
        int h10 = 0, h20 = 0, h30 = 0, h40 = 0, h50 = 0, m10 = 0, m20 = 0, m30 = 10, m40 = 10, m50 = 10; // acumulador
                                                                                                         // da
                                                                                                         // quantidade
                                                                                                         // de eleitor
                                                                                                         // m\f de cada
                                                                                                         // candidato
        int hvencedor = 0, mvencedor = 0;
        int idadevencedor = 0; // soma das idades dos eleitores do vencedor.
        int votosvencedor = 0; // soma dos votos do vencedor.
        int idade10 = 0, idade20 = 0, idade30 = 0, idade40 = 0, idade50 = 0; // acumulador das idades dos eleitores de
                                                                             // cada canditado.
        String vencedor;
        int cod; // codigo de escolha para realizar o calculo das letras "f" e "g" do exercício.

        Scanner sc = new Scanner(System.in);

        System.out.println(" === PESQUISA ELEITORAL GOIÂNIA ===");
        System.out.println("Digite ZERO para sair.");
        System.out.println("Digite os dados, Nº DO CANDIDATO, SEXO e IDADE DO ELEITOR.");

        do {
            do {
                System.out.print("Digite o número do candidato: ");
                valor = sc.nextFloat();
                if ((valor != 10) & (valor != 20) & (valor != 30) & (valor != 40) & (valor != 50) & (valor != 0)) {
                    System.out.println("Nº do candidato inválido, por gentiliza digite um valor válido");
                    System.out.println("Nº 10; Nº 20; Nº 30; Nº 40; Nº 50");
                }
            } while ((valor != 10) & (valor != 20) & (valor != 30) & (valor != 40) & (valor != 50) & (valor != 0));
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
                    idade10 = idade10 + idade;
                    if (sexo == 'm') {
                        h10 += 1;
                    } else {
                        m10 += 1;
                    }
                } else if (valor == 20) {
                    votos20 += 1;
                    idade20 = idade20 + idade;
                    if (sexo == 'm') {
                        h20 += 1;
                    } else {
                        m20 += 1;
                    }
                } else if (valor == 30) {
                    votos30 += 1;
                    idade30 = idade30 + idade;
                    if (sexo == 'm') {
                        h30 += 1;
                    } else {
                        m30 += 1;
                    }
                } else if (valor == 40) {
                    votos40 += 1;
                    idade40 = idade40 + idade;
                    if (sexo == 'm') {
                        h40 += 1;
                    } else {
                        m40 += 1;
                    }
                } else {
                    votos50 += 1;
                    idade50 = idade50 + idade;
                    if (sexo == 'm') {
                        h50 += 1;
                    } else {
                        m50 += 1;
                    }
                }

            }

        } while (valor != 0);

        if (votos10 > votos20 & votos10 > votos30 & votos10 > votos40 & votos10 > votos50) {
            vencedor = "Candidato 10";
            cod = 1;
        } else if (votos20 > votos10 & votos20 > votos30 & votos20 > votos40 & votos20 > votos50) {
            vencedor = "Candidato 20";
            cod = 2;
        } else if (votos30 > votos10 & votos30 > votos20 & votos30 > votos40 & votos30 > votos50) {
            vencedor = "Candidato 30";
            cod = 3;
        } else if (votos40 > votos10 & votos40 > votos20 & votos40 > votos30 & votos40 > votos50) {
            vencedor = "Candidato 40";
            cod = 4;
        } else {
            vencedor = "Candidato 50";
            cod = 5;
        }

        switch (cod) {
            case 1:
                hvencedor = h10;
                mvencedor = m10;
                idadevencedor = idade10;
                votosvencedor = votos10;
                break;
            case 2:
                hvencedor = h20;
                mvencedor = m20;
                idadevencedor = idade20;
                votosvencedor = votos20;
                break;
            case 3:
                hvencedor = h30;
                mvencedor = m30;
                idadevencedor = idade30;
                votosvencedor = votos30;
                break;
            case 4:
                hvencedor = h40;
                mvencedor = m40;
                idadevencedor = idade40;
                votosvencedor = votos40;
                break;
            case 5:
                hvencedor = h50;
                mvencedor = m50;
                idadevencedor = idade50;
                votosvencedor = votos50;
                break;

        }

        System.out.println("Quantidade de eleitores masculinos: " + contMasc);
        System.out.println("Quantidade de eleitores femininos: " + contFem);
        System.out.println("Idade média dos eleitores masculinos é: " + idadeMasc / contMasc + " anos.");
        System.out.println("Idade média dos eleitores femininos é: " + idadeFem / contFem + " anos.");
        System.out.println("O vencedor da eleição é o " + vencedor);
        System.out.println("Os votantes do candidato vencedor do sexo masculino somam um total de " + hvencedor);
        System.out.println("Os votantes do candidato vencedor do sexo feminino somam um total de " + mvencedor);
        System.out.println("A idade média dos eleitores do vencedor é de " + idadevencedor / votosvencedor);

        sc.close();

    }

}
