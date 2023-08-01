import java.util.Scanner;

public class EstruturaSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out
                .println("(1 - Domingo / 2 - Segunda / 3 - Terça / 4 - Quarta / 5 - Quinta / 6 - Sexta / 7 - Sabado)");
        System.out.println("Informe o dia da semana: ");
        int dia = Integer.parseInt(sc.nextLine());
        String nomeDoDia = "";
        switch (dia) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-Feira";
                break;
            case 3:
                nomeDoDia = "Terça-Feira";
                break;
            case 4:
                nomeDoDia = "Quarta-Feira";
                break;
            case 5:
                nomeDoDia = "Quinta-Feira";
                break;
            case 6:
                nomeDoDia = "Sexta-Feira";
                break;
            case 7:
                nomeDoDia = "Sabado";
                break;
            default:
                nomeDoDia = "Dia inválido!";
                break;
        }

        System.out.println("O dia da semana é " + nomeDoDia + ".");
        System.out.println("Fim!");
        System.out.println("===================================");


        sc.close();
    }

}
