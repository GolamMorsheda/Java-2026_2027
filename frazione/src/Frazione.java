import javax.xml.stream.FactoryConfigurationError;
import java.io.PrintStream;

public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore){
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    //costruttore copia??

    public Frazione(Frazione f){
        this.numeratore = f.numeratore;
        this.denominatore = f.denominatore;
    }

    //da finire e capire
    public Frazione semplificaFrazione(Frazione f){
        //Frazione risultato = null;
        Frazione risultato = new Frazione(f);
        if (f.numeratore == f.denominatore){
            risultato.denominatore = 1;
            risultato.numeratore = 1;
        }
        while (risultato.numeratore % 2 == 0 && risultato.denominatore % 2 == 0) {
            risultato.numeratore /= 2;
        }
        return risultato;
    }

    public Frazione reciprocaFrazione(){
        //ridai la frazione al contrario
        //System.out.println(denominatore + "/" + denominatore);
        Frazione risultato = null;
        risultato.numeratore = denominatore;
        risultato.denominatore = numeratore;
        return risultato;
    }

    public Frazione  oppostaFrazione(){
        //System.out.println(-denominatore + "/" + denominatore);
        Frazione risultato = null;
        risultato.numeratore = numeratore;
        risultato.denominatore = denominatore;
        return risultato;
    }

    public Frazione sommaFrazione(Frazione frazione){//vuole l'altra frazione
        Frazione risultato = null;
        if (this.denominatore == frazione.denominatore){
            risultato.numeratore = frazione.numeratore + this.numeratore;
        }else {
            risultato.denominatore = frazione.denominatore * this.denominatore;
            risultato.numeratore = (risultato.denominatore/frazione.denominatore*frazione.numeratore)
                    + (risultato.denominatore/this.denominatore*this.numeratore);
        }
        return risultato;
    }

    public Frazione sottraiFrazione(Frazione frazione){
        Frazione risultato = null;
        return risultato;
    }
}
