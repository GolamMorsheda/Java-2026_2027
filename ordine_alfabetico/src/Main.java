import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String p1;
        String p2;
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire la prima parola: ");
        p1 = in.next();
        System.out.println("Inserire la seconda parola: ");
        p2 = in.next();


        if (p1.compareTo(p2) > 0){
            System.out.print("La prima parola che arriva in ordine alfabetico e': ");
            System.out.print(p2);

        } else if (p1.compareTo(p2) < 0) {
            System.out.print("La prima parola che arriva in ordine alfabetico e': ");
            System.out.print(p1);

        }else {
            System.out.print("Le due parole sono uguali.");


        }

    }
}