import java.util.Scanner;

public class Datenstruktur {
    Scanner sc = new Scanner(System.in);
    private Knoten first;

    public void hinzufuegen(Aufgabe pAufgabe, int pZahl) {
        if (first == null) {
            first = new Knoten(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        } else {
            Knoten aE = first;
            for (int i = 0; i < pZahl; i++) {
                if (aE.getNachfolger() != null) {
                    aE = aE.getNachfolger();
                }
                aE.setNachfolger(new Knoten(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
            }
        }
    }

    public void suchen(String pText) {

    }

    public boolean loeschen(Aufgabe pAufgabe) {
        return true;
    }

    public Knoten getFirst() {
        return first;
    }

    public void setFirst(Knoten first) {
        this.first = first;
    }
}
