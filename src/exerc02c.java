public class exerc02c {
    
    public static void main(String[] args) {
        
        int i = 0;
        do {
            if ((i%2) != 0) {
                System.out.println(i);
                 
            }
            i += 1;
            if (i > 500) {
                break;
            }
        } while (i < 1000);
        

    }
}
