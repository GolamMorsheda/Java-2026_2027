import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        String nuovaA = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire la parola: ");
        a = in.next();

        for (int i = 0; i < a.length(); i++) {
            nuovaA += a.charAt(i);
            if (i != a.length()-1){
                nuovaA += "-";
            }
        }

        System.out.println(nuovaA);

    }
}