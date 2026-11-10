package it.scuola.esercizi;

public class Logger {
    Azione[] a;
    int numAzioni;


    public Logger(int maxAzioni){
        this.a = new Azione[maxAzioni];
        numAzioni = 0;
    }

    public boolean add(Azione azionePassata){
        if (numAzioni < a.length){
            a[numAzioni] = azionePassata;
            numAzioni++;
            return true;
        }
        return false;
    }

    public Azione get(int indice){
        if (indice < 0 || indice > a.length){
            return null;
        }
        return a[indice];
    }

    public Azione getByAttenzione(int lvImportanza){
        Azione[] vuoto = new Azione[0];
        Azione[] lv;
        if (lvImportanza<0 || lvImportanza>4){
            return vuoto;
        }
        for (int i = 0; i < 4; i++) {
            if (lvImportanza == a.getLv_azione()){

            }
        }
    }


}
