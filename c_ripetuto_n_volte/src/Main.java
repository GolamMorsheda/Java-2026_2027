import java.util.Scanner;

public class Main {

    public static String carattereRipetutoNVolte(char c, int n){
        String cRipetuto = "";
        for (int i = 0; i < n; i++) {
            cRipetuto += c;
        }
        return cRipetuto;
    }

    public static void main(String[] args) {
        String c;
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci una lettera: ");
        c = in.next();
        System.out.println("Inserisci quante volte vuoi ripeterla: ");
        n = in.nextInt();

        char c1 = c.charAt(0);
        System.out.println(carattereRipetutoNVolte(c1, n));
    }
}