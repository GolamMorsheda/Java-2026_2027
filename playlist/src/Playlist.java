public class Playlist {
    int N; //numero brani
    String nome; //nome della playlist
    String stato;
    int branoCorrente;

    public Playlist(String nome, int N){
        this.nome = nome;
        this.N = N;
        stato = "STOP";
        branoCorrente = 1; //la playlist parte sempre da 1
    }

    public Playlist(Playlist p){
        this.nome = p.nome;
        this.N = p.N;
        this.stato = p.stato;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantiBrani(){
        return N;
    }

    public void play(){
        stato = "PLAY";
    }

    public void pause(){
        if (stato != "STOP"){
            stato = "PAUSE";
        }else {
            stato = "STOP";
        }
    }

    public void stop(){
        stato = "STOP";
        //non so fare il passaggio dello stop consecutivo
    }

    public void branoSuccessivo(){
        if (branoCorrente == N){
            branoCorrente = 1;
        }else {
            branoCorrente++;
        }
    }

    public void branoPrecedente(){
        if (branoCorrente == 1){
            branoCorrente = N;
        }else {
            branoCorrente--;
        }
    }

    @Override
    public String toString(){
        return "Playlist " + nome + ", " + N + " brani, in " +
                stato + " sul brano " + branoCorrente;
    }




}
