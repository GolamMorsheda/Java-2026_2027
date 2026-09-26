
public class Main{
    public static void main (String [] args) {
        Studente a= new Studente ("Andrea", "Capasso", 47, 1.74, 80);
        Studente b= new Studente("Bea", "Rossi", 5, 1.0, 15);


        System.out.println(a.nome + " e': " + a.calcolaIndice());
        System.out.println(b.nome + " e': " + b.calcolaIndice());
    }
}
