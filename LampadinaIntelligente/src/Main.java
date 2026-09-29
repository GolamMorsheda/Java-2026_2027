import java.util.Scanner;

public class Main {
    /*public static void main(String[]ars) {
        LampadinaIntelligente l1 = new LampadinaIntelligente(60);
        LampadinaIntelligente l1Copia = new LampadinaIntelligente(l1);

        l1.setNome("camera");
        System.out.println(l1.getNome());

        l1.setColore("bianco");
        System.out.println(l1.getColore());

        l1.accendiLamp();
        System.out.println(l1.toString());

        l1.diminuisciIlluminazione();
        System.out.println(l1.toString());

        l1.spegniLamp();
        System.out.println(l1.toString());

        l1.aumentaIlluminazione();
        System.out.println(l1.toString());
    }
    */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        LampadinaIntelligente l1 = null;
        LampadinaIntelligente l1Copia = null;

        int scelta, potenza, illuminazione;
        String colore;
        String nome;

        do{
            System.out.println("1. Inserisci la potenza in Watt " +
                    "\n2. Crea una copia della lampadina esistente " +
                    "\n3. Inserisci il nome \n4. Ottieni il nome \n5. Inserisci il colore " +
                    "\n6. Ottieni il colore \n7. Accendi la lampada \n8. Spegni la lampada " +
                    "\n9. Aumenta l'illuminazione \n10. Diminuisci l'illuminazione " +
                    "\n11. Ottieni i dati della lampada");
            scelta = in.nextInt();
            switch(scelta){
                case 1:
                    potenza = in.nextInt();
                    l1 = new LampadinaIntelligente(potenza);
                    break;
                case 2:
                    l1Copia = new LampadinaIntelligente(l1);
                    break;
                case 3:
                    nome = in.next();
                    l1.setNome(nome);
                    break;
                case 4:
                    System.out.println(l1.getNome());
                    break;
                case 5:
                    colore = in.next();
                    l1.setColore(colore);
                    break;
                case 6:
                    System.out.println(l1.getColore());
                    break;
                case 7:
                    l1.accendiLamp();
                    break;
                case 8:
                    l1.spegniLamp();
                    break;
                case 9:
                    l1.aumentaIlluminazione();
                    break;
                case 10:
                    l1.diminuisciIlluminazione();
                    break;
                case 11:
                    System.out.println(l1.toString());
                    break;
            }
        }while(scelta != 0);
    }
}