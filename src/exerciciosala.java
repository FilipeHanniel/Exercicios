public class exerciciosala {

    public static void main(String[] args) {
       
        int cont;
        System.out.println(2); //único número primo par.
        for (int i = 2; i < 501; i++) {
            cont = 0;
            if ((i%2) != 0) {
                for (int j = 2; j < i + 1; j++) {
                    if (i % j == 0) {
                        cont += 1;
                    }
                    
                }
                if (cont <= 1) {
                    System.out.println(i);
                }
            }
        }

    }
    
}
