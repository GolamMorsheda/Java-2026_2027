import java.time.Duration;

public class Canzone {
    private String titolo;
    private String artista;
    private Duration durata;

    public Canzone(String titolo, String artista, Duration durata){
        this.titolo = titolo;
        this.artista = artista;
        this.durata = durata;
    }

    public String getTitolo(){
        return titolo;
    }

    public String getArtista(){
        return artista;
    }

    public Duration getDurata(){
        return durata;
    }

    public String toString(){
        int minuti = (int)durata.toMinutes();
        int secondi = (int)durata.minusMinutes(minuti).toSeconds();

        return "Titolo: " + titolo +
                "\n Durata: " + minuti + "minuti e " + secondi + " secondi" +
                "\n Artista: " + artista;
    }
}
