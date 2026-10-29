package it.scuola.esercizi;

public class Rettangolo {
    double x1;
    double y1;
    double x2;
    double y2;

    public Rettangolo(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getBase(){
        double base;
        base = x1 - x2;
        if (base < 0){
            base *= -1;
        }
        return base;
    }

    public double getAltezza(){
        double altezza;
        altezza = y1 - y2;
        if (altezza < 0){
            altezza *= -1;
        }
        return altezza;
    }

    public double getArea(){
        double base = getBase();
        double altezza = getAltezza();
        return base * altezza;
    }

    public double getPerimetro(){
        double base = getBase();
        double altezza = getAltezza();

        return (base*2)+(altezza*2);

    }
}