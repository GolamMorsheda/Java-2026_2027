public class Punto { //x e y di 1 punto
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //aggiungere due set

    public String toString(){
        return "La X del punto e': " + this.x + " e la Y e': " + this.y;
    }

    public Punto spostaPunto(double dx, double dy){
        return new Punto(x+dx, y+dy);
    }



}
