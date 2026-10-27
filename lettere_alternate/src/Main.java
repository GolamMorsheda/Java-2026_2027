import java.util.Scanner;

public class Main {

    public static String alternato(String a, String b){
        String alternata = "";
        if (a.length() < b.length()){
            String t;
            t = a;
            a = b;
            b = t;
        }
        for (int i = 0; i < a.length(); i++) {
            alternata += a.charAt(i);
            if (i < b.length()){
                alternata += b.charAt(i);
            }

        }
        return alternata;
    }

    public static void main(String[] args) {
        String a;
        String b;
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci la prima parola: ");
        a = in.next();
        System.out.println("Inserisci la seconda parola: ");
        b = in.next();

        System.out.println(alternato(a, b));
    }
}