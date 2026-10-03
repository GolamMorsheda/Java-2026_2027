public class Rettangolo {
    private Punto a;
    private Punto b;
    private double lato1;
    private double lato2;

    public Rettangolo(Punto a, Punto b){
        this.a = a;
        this.b = b;
        this.lato1 = (a.getX())-b.getX();
        this.lato2 = (a.getY())-b.getY();

        if (this.lato1 < 0){
            lato1 *= -1;
        }
        if (this.lato2 < 0){
            lato2 *= -1;
        }
    }

    public double calcolaPerimetro(){
        return (lato2*2) + (lato1*2);
    }

    public double calcolaArea(){
        return (lato1*lato2);
    }
}
