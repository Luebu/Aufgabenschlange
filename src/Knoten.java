import java.util.Date;

public class Knoten {
    private Aufgabe inhalt;
    private Knoten nachfolger;
    Knoten(String pText, int pJ, int pM, int pT){
        inhalt=new Aufgabe(pText, pJ, pM, pT);
    }
    public Aufgabe getInhalt() {
        return inhalt;
    }

    public Knoten getNachfolger() {
        return nachfolger;
    }

    public void setInhalt(Aufgabe inhalt) {
        this.inhalt = inhalt;
    }

    public void setNachfolger(Knoten nachfolger) {
        this.nachfolger = nachfolger;
    }
}
