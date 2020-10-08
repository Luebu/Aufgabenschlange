public class Knoten {
    private Aufgabe inhalt;
    private Knoten nachfolger;

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
