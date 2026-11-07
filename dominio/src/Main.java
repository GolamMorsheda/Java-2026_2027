import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String email;
        int n;
        int j = 100;
        String dominio = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un'email': ");
        email = in.next();

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){
                j = i;
            }
            if (i > j){
                dominio += email.charAt(i);
            }
        }

        System.out.println("Il tuo dominio e': " + dominio);
    }
}