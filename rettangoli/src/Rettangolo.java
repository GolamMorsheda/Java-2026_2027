public class Rettangolo {
    private Punto a;
    private Punto b;

    public Rettangolo(Punto a, Punto b){
        this.a = a;
        this.b = b;
    }

    public Rettangolo effetuaTraslazione(){
        return new Rettangolo()
    }

    public boolean contenuto(Rettangolo r){
        if (this.a.getX() < r.a.getX())

            return true;
    }
}
