import java.util.Scanner;

public class Main{
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int eta, scelta;
        double altezza, massa;
        String nome, cognome, BMI;
        Studente s1 = new Studente();
        Studente s2 = null;
        do{
            System.out.println("inserisci la tua scelta");
            scelta = sc.nextInt();
        switch(scelta){
                case 1:
                    System.out.println("Inserisci Nome del primo stud");
                    s1.nome = sc.next(); //legge da tastiera una parola
                    /*System.out.println("Inserisci Cognome del primo stud");
                    cognome = sc.next();
                    System.out.println("Inserisci Eta del primo stud");
                    eta = sc.nextInt();
                    System.out.println("Inserisci Altezza del primo stud");
                    altezza = sc.nextDouble();
                    System.out.println("Inserisci massa del primo stud");
                    massa = sc.nextDouble();

                    System.out.println("Inserisci Nome del secondo stud");
                    nome = sc.next(); //legge da tastiera una parola
                    System.out.println("Inserisci Cognome del secondo stud");
                    cognome = sc.next();
                    System.out.println("Inserisci Eta del secondo stud");
                    eta = sc.nextInt();
                    System.out.println("Inserisci Altezza del secondo stud");
                    altezza = sc.nextDouble();
                    System.out.println("Inserisci massa del secondo stud");
                    massa = sc.nextDouble();
                    */
                    System.out.println(s1);
                    break;
                case 2:

                break;
                case 3:
                    System.out.println("I dati del primo studente sono: ");
                    System.out.println(s1);


                break;
            }
        }while (scelta != 0);


    }
}
