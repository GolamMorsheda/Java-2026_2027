import java.util.Scanner;

public class Main{
    /*public static void main(String[]ars) {
        ContoCorrente c = new ContoCorrente("maria", "rosi", "U4X7B2");
        c.deposita(-3);
        System.out.println(c.getSaldo());
        c.deposita(500);
        System.out.println(c.getSaldo());
        c.preleva(200);
        System.out.println(c.getSaldo());
        c.preleva(301);
        System.out.println(c.getSaldo());

        System.out.println(c.getCodiceUnivoco());
        System.out.println(c.getNominativo());
    }
     */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ContoCorrente c = null;
        int scelta;
        String nome, cognome, codiceUnivoco;
        float saldo, preleva, deposita;

        do{
            System.out.println("1. Inserisci i dati rilevanti " +
                    "\n2. Preleva " +
                    "\n3. Deposita \n4. Vedi saldo \n5. Vedi codice univoco " +
                    "\n6. Vedi nome e cognome \n7. Vedi informazioni");
            scelta = in.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("Inserisci il nome: ");
                    nome = in.next();
                    System.out.println("Inserisci il conome: ");
                    cognome = in.next();
                    System.out.println("Inserisci il codice unicovo: ");
                    codiceUnivoco = in.next();
                    c = new ContoCorrente(nome, cognome, codiceUnivoco);
                    break;
                case 2:
                    System.out.println("Inserisci il saldo da prelevare: ");
                    preleva = in.nextFloat();
                    c.preleva(preleva);
                    break;
                case 3:
                    System.out.println("Inserire il saldo da depositare: ");
                    deposita = in.nextFloat();
                    c.deposita(deposita);
                    break;
                case 4:
                    System.out.println("Il saldo presente e': " + c.getSaldo());
                    break;
                case 5:
                    System.out.println("Il codice univoco e': " + c.getCodiceUnivoco());
                    break;
                case 6:
                    System.out.println("Il nome e cognome sono: " + c.getNominativo());
                    break;
                case 7:
                    System.out.println(c.toString());
                    break;
            }
        }while(scelta != 0);
    }

}