//metodo con indice di massa: kg/altezza(?)


public class Studente {
    String nome;
    String cognome;
    int eta;
    double altezza;
    double peso;

    //public Studente(String name, String surname, int age, double height){

    //    nome = name;
    //    cognome = surname;
    //    eta = age;
    //    altezza = height;
    //}

    //COSTRUTTORE DI COPIA
    public Studente(String nome, String cognome, int eta, double altezza, double peso){
        this.nome = nome;
        this.cognome = cognome;
        if (this.eta <= 5){ //CONTROLLO VALORI
            eta = 6;
        }else {
            this.eta = eta;
        }
        this.altezza = altezza;
        this.peso = peso;
    }

    //COSTRUTTORE DI DEFAULT NON HA BISOGNO DI NULLA COME PARAMETRI
    public Studente(){
      this.nome=" ";
      this.cognome = " ";
      this.eta = 0;
      this.altezza = 0.0;
      this.peso = 0.0;
    }
    //OVERRIDE

    public String toString(){
        String s = "I dati dello studente sono: ";
        s+= this.nome + "," + this.cognome + "," + this.eta + ",";
        return s;
    }

    public String calcolaIndice(double peso, double altezza) {
        double BMI;
        BMI = peso/(altezza*altezza);
        if (BMI < 18.5){
            return "Sottopeso";
        } else if (BMI >= 18.5 && BMI <=24.9) {
            return "Normopeso";
        } else if (BMI >=25 && BMI <= 29.9) {
            return "Sovrappeso";
        }else {
            return "Obesita'";
        }
    }

}
