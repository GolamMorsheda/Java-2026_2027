import java.util.Scanner;

public class Main {

    public static int n_vocali(String p){
        String vocali = "aeiou";
        int conta = 0;
        p.toLowerCase();
        for (int i = 0; i < vocali.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == vocali.charAt(i)){
                    conta++;
                }
            }
        }

        return conta;
    }

    public static void main(String[] args) {
        String a;
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci una parola: ");
        a = in.next();

        System.out.println(n_vocali(a));
    }
}