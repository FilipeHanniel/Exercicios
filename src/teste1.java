public class teste1 {
    

    public static void main(String[] args) {
        
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
                    System.out.println("O valor médio dos salários é de " + mediaDosNumeros + " .
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
                System.out.println(salariosAteMedia + " ganham salário menor um igual à média sal
                System.out.println(salariosAcimaMedia + " ganham salário acima da média salarial.
                System.out.println("Fim!");
                System.out.println("============================");
                leituraScanner.close();
            }
        }
    }
 }
    }
}
