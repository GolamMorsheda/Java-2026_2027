public class Domanda {
    private String domanda;
    private Risposta[] opzioni;
    private int valore;
    private int rispostaScelta;

    public Domanda(String domanda, Risposta[] opzioni){
        this.domanda = domanda;
        this.valore = 1;
        for (int i = 0; i < 4; i++) {
            this.opzioni[i] = opzioni[i];
        }
        Risposta risposta;
    }

    public Domanda(Domanda d){
        this.domanda = d.domanda;
        this.opzioni = d.opzioni;
        this.valore = d.valore;
    }

    public boolean rispondi(int risposta){
        return false;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }

    public int getPunteggio(){
        if (rispondi(rispostaScelta)==0){
            return 0;
        }else {
            return 1;
        }
    }
}
