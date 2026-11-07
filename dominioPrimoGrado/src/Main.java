import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String email;
        int n;
        int j = 100;
        String primoDominio = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un'email': ");
        email = in.next();

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){
                for (int k = i; k < email.length(); k++) {
                    if (email.charAt(k) == '.'){
                        j = k;
                    }
                    if (k > j){
                        primoDominio += email.charAt(k);
                    }

                }
            }
        }

        System.out.println("Il tuo dominio di primo grado e': " + primoDominio);
    }
}