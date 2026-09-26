
public class Main{
    public static void main (String [] args) {
        Studente a= new Studente ("Andrea", "Capasso", 47, 1.74, 80);
        Studente b= new Studente("Bea", "Rossi", 5, 1.0, 15);


        System.out.println(a.nome + " e': " + a.calcolaIndice());
        System.out.println(b.nome + " e': " + b.calcolaIndice());

        System.out.println(a);
        System.out.println(b);

        /*Scanner sc = new Scanner;
        int eta, scelta;
        double altezza, massa;
        Studente s1 = null;
        Studente s2 = null;
        do{
            System.out.println("inserisci la tua scelta");
            scelta = sc.nectInt(){
                case 1:
                    System.out.println("Inserisci nome del primo stud")
                    nome = sc.next();
                    System.out.println("Inserisci cognome del primo stud")
                    cognome = sc.next;
                    break;
            }
        }

        */
    }
}
