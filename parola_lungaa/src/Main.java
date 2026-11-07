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

        System.out.print("La parola piu' lunga e: ");
        if (p1.length() > p2.length()){
            System.out.print(p1);
        }else {
            System.out.print(p2);
        }
    }
}