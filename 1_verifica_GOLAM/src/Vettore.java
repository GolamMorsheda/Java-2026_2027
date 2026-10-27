public class Vettore {
    private Punto origine;
    private Punto vertice;

    public Vettore(Punto vertice, Punto orgine){
        this.vertice= vertice;
        this.origine = orgine;
    }

    public Punto getVertice() {
        return vertice;
    }

    public Punto getOrigine() {
        return origine;
    }

    public String toString(){
        return "X del vertice: " + vertice.getX() + "Y del vertice: " + vertice.getY() +
                "X dell'origine: " + origine.getX() + "Y dell'origine: " + origine.getY();
    }

    public boolean verificaOrigie(Punto P){
        if (this.origine == P){
            return true;
        }else{
            return false;
        }
    }




}
