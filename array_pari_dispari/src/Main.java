import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n_valori, scelta;
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("Inserisci quanti valori vuoi inserire: ");
        n_valori = in.nextInt();
        for (int i = 0; i < n_valori; i++) {
            System.out.println("Inserisci il numero: ");
            scelta = in.nextInt();
            a[i] = scelta;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0){
                System.out.println(a[i]);
            }
        }

    }
}