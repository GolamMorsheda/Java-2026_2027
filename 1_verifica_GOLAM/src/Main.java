import java.util.Scanner;

public class Main {

    public static Punto creaPunto(){
        double X, Y;
        Scanner in = new Scanner(System.in);
        System.out.println("Inseire la X del punto: ");
        X = in.nextDouble();
        System.out.println("Inseire la Y del punto: ");
        Y = in.nextDouble();
        return new Punto(X, Y);
    }

    public static Vettore creaVettore(){
        Punto vertice = creaPunto();
        Punto origine = creaPunto();
        return new Vettore(vertice, origine);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta;
        Vettore v1 = null;
        Vettore v2 = null;


        do {
            System.out.println("1.Definire i vettori v1, v2 nel piano cartesiano" +
                    "\n2.Visualizzare le coordinate dei vettori creati" +
                    "\n3.Calcola lunghezza" +
                    "\n4.Spostare l’origine di un vettore" +
                    "\n5. Verificare se i 2 vettori hanno origine uguale");
            scelta = in.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("V1: ");
                    v1 = creaVettore();
                    System.out.println("V2: ");
                    v2 = creaVettore();
                    break;
                case 2:
                    System.out.println(v1.toString());
                    System.out.println(v2.toString());

                    break;
                case 3:



                    break;
                case 4:


                    break;
                case 5:
                    System.out.println(v1.verificaOrigie(v2.getOrigine()));

                    break;
            }

        }while (scelta != 0);


    }
}