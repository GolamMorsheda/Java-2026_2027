import java.util.Scanner;

public class Main {
    /*public static void test(String[] args){
        Dado d1 = new Dado();
        Dado d2 = new Dado(9);
        Dado d3 = new Dado(d1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d1.lancia());
        System.out.println(d2.lancia());
    }

     */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int scelta, nFacce;
        Dado d1 = new Dado();
        Dado d2 = new Dado();

        do{
            System.out.println("1. Inserisci un numero di facce " +
                    "\n2. Copia il numero di facce del dado " +
                    "\n3. Lancia il dado" +
                    "\n4. Visualizza quante facce hanno i dadi");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    int dado = in.nextInt();
                    d1 = new Dado(dado);
                    break;
                case 2:
                    d2 = new Dado(d1);
                    break;
                case 3:
                    System.out.println("Hai ottenuto il numero: " + d1.lancia());
                    break;
                case 4:
                    System.out.println(d1.toString());
                    break;
            }
        }while (scelta != 0);
    }
}