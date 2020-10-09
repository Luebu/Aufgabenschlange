import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Datenstruktur data = new Datenstruktur();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Wilkommen bei ihrem Aufgabenspeicher");
            System.out.println("Was möchten sie machen?");
            System.out.println("Drücken sie 1 um eine neue Aufgabe hinzuzufügen");
            System.out.println("Drücken sie 2 um ihre Aufgaben anzusehen");
            System.out.println("Oder drücken sie 3 um eine Aufgabe zu löschen");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("An welcher Stelle soll die Aufgabe hinzugefügt werden?");
                    data.hinzufuegen(sc.nextInt());
                    break;
                case 2:
                    data.suchen();
                    System.out.println();
                    System.out.println("Geben sie etwas ein um fortzufahren");
                    sc.next();
                    break;
                case 3:
                    System.out.println("Welche Aufgabe soll geloescht werden");
                    if(data.loeschen(sc.nextInt())){
                      System.out.println("Erfolgreich gelöescht");
                    }else{
                        System.out.println("Es wurde nichts gelöscht.");
                        System.out.println("Versuchen sie eine andere Zahl");
                    }
                    break;
                default:
                    System.out.println("Keine Auswahlmöglichkeit");
                    System.out.println("Versuchen sie es erneut!");
            }
            System.out.println("Sie kehren nun automatisch zum start zurück");
            Thread.sleep(5000);
            System.out.print("\033[H\033[2J");
        }
    }
}
