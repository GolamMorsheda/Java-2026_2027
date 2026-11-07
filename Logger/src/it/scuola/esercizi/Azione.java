package it.scuola.esercizi;
import java.time.LocalDateTime;

public class Azione {
    private String descrizioneAzione; //Accesso dall’IP 134.67.12.54
    private LocalDateTime adesso;
    private int lv_azione;

    private static final String[] LV_ATTENZIONE = {
            "nessun problema", // livello 1 (indice 0 + 1)
            "annotazione",     // livello 2
            "evento moderato", // livello 3
            "evento grave",    // livello 4
            "evento critico"   // livello 5
    };

    public Azione(String descrizioneAzione, int lv_azione){
        this.adesso = LocalDateTime.now();
        this.descrizioneAzione = descrizioneAzione;
        this.lv_azione = lv_azione;
    }

    public String getDescrizioneAzione(){
        return descrizioneAzione;
    }

    public LocalDateTime getAdesso(){
        return adesso;
    }

    public int getLv_azione(){
        return lv_azione;
    }

    public String toString(){
        return "Descrizione: " + descrizioneAzione + "\n " + adesso +
                "\n" + LV_ATTENZIONE[lv_azione-1];
    }

}
