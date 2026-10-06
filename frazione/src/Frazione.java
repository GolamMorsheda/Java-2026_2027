import javax.xml.stream.FactoryConfigurationError;

public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore){
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    //costruttore copia??
    public void semplificaFrazione(){

    }

    public Frazione reciprocaFrazione(){
        //ridai la frazione al contrario
        //System.out.println(denominatore + "/" + denominatore);
        Frazione risultato = null;
        risultato.numeratore = denominatore;
        risultato.denominatore = numeratore;
        return risultato;
    }

    public void  oppostaFrazione(){
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
}
