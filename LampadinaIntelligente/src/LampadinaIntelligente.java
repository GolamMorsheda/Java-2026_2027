public class LampadinaIntelligente {
    private int potenza;
    private int illuminazione; //tra 0 e 100 (100 a piena potenza,
    // 0 è come se fosse spenta, 50 è alla metà
    // della propria potenza)
    private String colore;
    private String nome;

    public LampadinaIntelligente(int potenza){
        this.potenza = potenza;
        this.nome = "";
        this.illuminazione = 50;
        this.colore = "bianco";
    }

    public LampadinaIntelligente(LampadinaIntelligente l){
        this.potenza = l.potenza;
        this.nome = l.nome;
        this.illuminazione = l.illuminazione;
        this.colore = l.colore;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public String getColore(){
        return colore;
    }

    public void setColore(){
        this.colore = colore;
    }

    public void accendiLamp(){
        this.illuminazione = 100;
    }

    public void spegniLamp(){
        this.illuminazione = 0;
    }

    public void aumentaIlluminazione(){
        if (this.illuminazione < 100){
            this.illuminazione += (this.illuminazione*10)/100;
            if(this.illuminazione > 100){
                this.illuminazione = 100;
            }
        }
    }

    public void diminuisciIlluminazione(){
        if (this.illuminazione > 0){
            this.illuminazione -= (this.illuminazione*10)/100;
            if(this.illuminazione < 0){
                this.illuminazione = 0;
            }
        }
    }

    public String toString(){
        String stato;
        if(this.illuminazione > 0){
            stato = "accesa";
        }else{
            stato = "spenta";
        }
        return "nome: " + this.nome + ", Potenza: " + this.potenza + "watt, Stato: " + stato
                + ", Illuminazione: " + this.illuminazione + "%, Colore: "
                + this.colore;
    }
}
