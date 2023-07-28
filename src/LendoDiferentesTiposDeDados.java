import java.util.Scanner;

public class LendoDiferentesTiposDeDados {
    
    public static void main(String[] args) {
        
        String textoQualquer;
        double numeroDecimal;
        int numeroInteiro;
        boolean valorBooleano;

        Scanner sc = new Scanner(System.in);

        System.out.println("=========LENDO DIFERENTES TIPOS DE DADOS=============\n");
        System.out.println(">>>Digite um texto qualquer:");
        textoQualquer = sc.nextLine();
        System.out.println("Digite um numero qualquer com decimal: ");
        numeroDecimal = Double.parseDouble(sc.nextLine());
        System.out.println("Digite um numero inteiro: ");
        numeroInteiro = Integer.parseInt(sc.nextLine());
        System.out.println(">>>Digite um valor booleano (true ou false): ");
        valorBooleano = Boolean.parseBoolean(sc.nextLine());
        System.out.println("======================================================");
        System.out.println("Resultado:");
        System.out.println("Texto Qualquer é: " + textoQualquer);
        System.out.println("Número com decimal é: " + numeroDecimal);
        System.out.println("Número inteiro é: " + numeroInteiro);
        System.out.println("O valor booleano é: " +valorBooleano);
        System.out.println("Fim!");
        System.out.println("==================================================");


        sc.close();

    }

}
