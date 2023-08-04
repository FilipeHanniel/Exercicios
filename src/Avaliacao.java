import java.util.Scanner;

public class Avaliacao {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");        
        double temperaturaC, temperaturaF;

        System.out.println("      --- Conversor de Cº --> Fº ---");
        
        do {
            System.out.print("Informe a temperatura em graus Celsius ou zero para sair: ");
            temperaturaC = Double.parseDouble(sc.nextLine());
            if (temperaturaC != 0) {
                temperaturaF = (temperaturaC * 9/5 + 32);
                System.out.println(temperaturaC + "ºC corresponde a " + temperaturaF + "ºF graus Fahrenheit.");
            }
        } while (temperaturaC != 0);

        System.out.println("Fim!");
        System.out.println("============================");
        sc.close();
    }
    
}
