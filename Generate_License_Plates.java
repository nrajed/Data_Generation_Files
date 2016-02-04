import java.util.Random;


public class Generate_License_Plates {
    public static void main(String[] args)
    {
    	final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int N = alphabet.length();

        Random r = new Random();

        for (int i = 0; i < 2000; i++) {
            System.out.print(alphabet.charAt(r.nextInt(N)));
            System.out.print(alphabet.charAt(r.nextInt(N)));
            System.out.print(alphabet.charAt(r.nextInt(N)));
            System.out.print(alphabet.charAt(r.nextInt(N)));
            System.out.print(alphabet.charAt(r.nextInt(N)));
            System.out.print(alphabet.charAt(r.nextInt(N)));
            System.out.println();
        }
        
    }
}
