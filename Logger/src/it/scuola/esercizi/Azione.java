package it.scuola.esercizi;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Azione {
    String descrizioneAzione; //Accesso dall’IP 134.67.12.54
    LocalDateTime adesso;
    LocalDate ora;
    String[] lv_attenzione;

    public Azione(String descrizioneAzione, int lv_azione){
        this.adesso = LocalDateTime.now();


    }

}
