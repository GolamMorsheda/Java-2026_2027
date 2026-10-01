import jdk.jfr.Frequency;

public class ContoCorrente {
    private String nome;
    private String cognome;
    private String codiceUnivoco;
    private float saldo;

    public ContoCorrente(String nome, String cognome, String codiceUnivoco){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceUnivoco = codiceUnivoco;
    }

    public float preleva(float prelievo){
        float risultato;
        risultato = this.saldo - prelievo;
        if (prelievo > 0 && (risultato) >= 0){
            this.saldo -= prelievo;
        }
        return this.saldo;

    }

    public float deposita(float deposito){
        if(deposito>0){
            this.saldo += deposito;
        }
        return this.saldo;
    }

    public float getSaldo(){
        return saldo;
    }

    public String getCodiceUnivoco(){
        return codiceUnivoco;
    }

    public String getNominativo(){
        return nome + " " + cognome;
    }

    public String toString(){
        return "Nome: " + nome + " Cognome: " + cognome + "  Codice univoco: " + codiceUnivoco
                + " Saldo: " + saldo;
    }

}
