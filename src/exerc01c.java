public class exerc01c {
    
    public static void main(String[] args) {
        
        int i = 1;

        do {
            System.out.println(i);
            i += 1;
            if (i > 200) {
                break;
            }
        } while (i < 1000);
    }
}
