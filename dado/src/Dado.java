import java.util.Random;

public class Dado {
    private int nFacce;

    public Dado(){
        nFacce = 6;
    }

    public Dado(int nFacce){
        if (nFacce <= 3){
            this.nFacce = 6;
        }else {
            this.nFacce = nFacce;
        }
    }

    public  Dado(Dado d){
        this.nFacce = d.nFacce;
    }

    public int lancia(){
        Random random = new Random();
        int casuale = random.nextInt(this.nFacce)+1;
        return casuale;
    }


    @Override
    public String toString(){
        return "Il dado ha " + this.nFacce + " facce.";
    }
}
