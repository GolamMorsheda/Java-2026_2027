import java.util.Scanner;

public class Main {

    Scanner in = new Scanner(System.in);

    public static Punto creaPunto(){
        double X, Y;
        Scanner in = new Scanner(System.in);
        System.out.println("Inseire la X del primo punto: ");
        X = in.nextDouble();
        System.out.println("Inseire la Y del primo punto: ");
        Y = in.nextDouble();
        return new Punto(X, Y);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double X, Y;
        Punto a = null;
        Punto b = null;
        Rettangolo rettangolo = null;

        int scelta;


        do {
            System.out.println("1. Costruisci un rettangolo nel piano." +
                    "\n2. Calcola perimetro." +
                    "\n3. Calcola area.");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    a=creaPunto();
                    b=creaPunto();

                    rettangolo = new Rettangolo(a, b);
                    break;
                case 2:
                    System.out.println(rettangolo.calcolaPerimetro());
                    break;
                case 3:
                    System.out.println(rettangolo.calcolaArea());
                    break;
            }

        }while (scelta != 0);

    }
}