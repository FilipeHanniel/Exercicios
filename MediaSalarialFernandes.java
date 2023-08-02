import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args) {
        Scanner leituraScanner = new Scanner(System.in);
        System.out.println("============================");
        double mediaDosSalarios = 0;
        int contadorDeSalarios = 0;
        int somaDosSalarios = 0;
        int salario;
        int salariosAteMedia = 0;
        int salariosAcimaMedia = 0;
        int mediaDosNumeros = 0;
        boolean digiteNovamente = true;
        while (digiteNovamente) {
            System.out.print("Digite valor do salário ou zero para sair: ");
            salario = leituraScanner.nextInt();
            System.out.println("\n");
            if (salario == 0) {
                digiteNovamente = false;
            } else {
                somaDosSalarios += salario;
                contadorDeSalarios += 1;
                if (contadorDeSalarios > 0) {
                    mediaDosSalarios = somaDosSalarios / contadorDeSalarios;
                    System.out.println("O valor médio dos salários é de " + mediaDosNumeros + " .");
                }

            }
        }

        boolean digiteNovamente = true;
        while (digiteNovamente) {
            System.out.print("Digite valor do salário ou zero para sair: ");
            salario = leituraScanner.nextInt();
            System.out.println("\n");
            if (salario == 0) {
                digiteNovamente = false;
            } else {
                if (salario <= mediaDosSalarios) {
                    salariosAteMedia += 1;
                } else {
                    salariosAcimaMedia += 1;
                }
            }
        }

        System.out.println(salariosAteMedia + " ganham salário menor um igual à média salarial.");
        System.out.println(salariosAcimaMedia + " ganham salário acima da média salarial.");
        System.out.println("Fim!");
        System.out.println("============================");
        leituraScanner.close();
    }
}