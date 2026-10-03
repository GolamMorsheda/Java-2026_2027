import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Punto a = null;
        Punto b = null;
        Rettangolo rettangolo = null;

        int scelta;
        double X, Y;

        do {
            System.out.println("1. Costruisci un rettangolo nel piano." +
                    "\n2. Calcola perimetro." +
                    "\n3. Calcola area.");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    System.out.println("Inseire la X del primo punto: ");
                    X = in.nextDouble();
                    System.out.println("Inseire la Y del primo punto: ");
                    Y = in.nextDouble();
                    a = new Punto(X, Y);

                    System.out.println("Inseire la X del secondo punto: ");
                    X = in.nextDouble();
                    System.out.println("Inseire la Y del secondo punto: ");
                    Y = in.nextDouble();
                    b = new Punto(X, Y);
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