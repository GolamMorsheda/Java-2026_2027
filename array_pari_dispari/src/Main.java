import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n_valori, scelta, contaPari = 0, contaDispari = 0;
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];

        System.out.println("Inserisci quanti valori vuoi inserire: ");
        n_valori = in.nextInt();
        for (int i = 0; i < n_valori; i++) {
            System.out.println("Inserisci il numero: ");
            scelta = in.nextInt();
            if (scelta % 2 == 0){
                contaPari++;
                a[i] = scelta;
            }else {
                contaDispari++;
                b[i] = scelta;
            }
        }


        System.out.println("NUMEERI PARI: " + contaPari);
        for (int i = 0; i < n_valori; i++) {
            System.out.println(a[i]);
        }

        System.out.println("NUMERI DISPARI: " + contaDispari);
        for (int i = 0; i < n_valori; i++) {
            System.out.println(b[i]);
        }

    }
}