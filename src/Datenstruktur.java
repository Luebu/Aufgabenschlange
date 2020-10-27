import java.util.Scanner;

public class Datenstruktur {
    Scanner sc = new Scanner(System.in);
    private Knoten first;

    public void hinzufuegen(int pZahl) {
        System.out.println("Welchen Inhalt hat die Aufgabe?");
        String text = sc.next();
        System.out.println("Welches Jahr soll das Datum haben?");
        int j = sc.nextInt();
        System.out.println("Welchen Monat soll das Datum haben?");
        int m = sc.nextInt();
        System.out.println("Welchen Tag soll das Datum haben?");
        int t = sc.nextInt();
        if (first == null) {
            first = new Knoten(text, j, m, t);
        } else {
            Knoten aE = first;
            for (int i = 0; i < pZahl; i++) {
                if (aE.getNachfolger() != null) {
                    aE = aE.getNachfolger();
                }
            }
            Knoten temp = new Knoten(text, j, m, t);
            if (aE.getNachfolger() != null) {
                temp.setNachfolger(aE.getNachfolger());
                aE.setNachfolger(temp);
            }else{
                aE.setNachfolger(temp);
            }
        }
    }

    public void suchen() {
        if (first == null) {
            System.out.println("Keine gespeicherten Daten vorhanden");
            return;
        }
        Knoten aE = first;
        System.out.println(aE.getInhalt().getText());
        System.out.println(aE.getInhalt().getDatum());
        while (aE.getNachfolger() != null) {
            aE = aE.getNachfolger();
            System.out.println(aE.getInhalt().getText());
            System.out.println(aE.getInhalt().getDatum());

        }
    }

    public boolean loeschen(int pZahl) {
        if (first == null) {
            return false;
        }
        Knoten aE = first;
        for (int i = 0; i < pZahl - 1; i++) {
            if (aE.getNachfolger() != null) {
                aE = aE.getNachfolger();
            } else {
                return false;
            }
        }
        if(aE.getNachfolger()!=null) {
            aE.setNachfolger(aE.getNachfolger().getNachfolger());
            return true;
        }else{
            aE.setNachfolger(null);
            return true;
        }
    }

    public Knoten getFirst() {
        return first;
    }

    public void setFirst(Knoten first) {
        this.first = first;
    }
}
