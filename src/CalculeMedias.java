import java.util.Scanner;

public class CalculeMedias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float altura; 
        String sexo = "";
        float maiorAltura = -1, menorAltura = 1000;
        String sexoMaiorAltura = "", sexoMenorAltura = "";
        float contadorMeninos = 0, contadorMeninas = 0, acumuladorAlturaMeninos = 0, acumuladorAlturaMeninas = 0,
                mediaAlturaMenios = 0, mediaAlturaMeninas = 0;
        boolean loop = true;
        int teste = 0;

        while (loop) {

            System.out.println("Digite a altura ou zero para sair:");
            altura = Float.parseFloat(sc.nextLine());
            System.out.println("\n");

            if (altura == 0) {
                break;
            } else {
                System.out.println("Informe o sexo da criança (M ou F):");
                sexo = sc.nextLine();
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
                sexoMaiorAltura = sexo;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                sexoMenorAltura = sexo;
                teste = 1;
            }
            if (sexo.equals("m") || sexo.equals("M")) {
                contadorMeninos += 1;
                acumuladorAlturaMeninos += altura;
            } else {
                contadorMeninas += 1;
                acumuladorAlturaMeninas += altura;
            }
        }
        System.out.println("Sexo e altura da pessoa mais alta: " + sexoMaiorAltura + " - " + maiorAltura);
        System.out.println("Sexo e altura da pessoa mais baixa: " + sexoMenorAltura + " - " + menorAltura);

        if (contadorMeninos > 0) {
            mediaAlturaMenios = acumuladorAlturaMeninos / contadorMeninos;
            System.out.println("A média das alturas dos meninos é: " + mediaAlturaMenios);
        }

        if (contadorMeninas > 0) {
            mediaAlturaMeninas = acumuladorAlturaMeninas / contadorMeninas;
            System.out.println("A média das alturas das meninas é: " + mediaAlturaMeninas);
        }
        System.out.println(teste);
        sc.close();
    }

}
