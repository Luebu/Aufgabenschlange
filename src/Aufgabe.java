import java.util.Date;

public class Aufgabe {
    private String text;
    private Date datum;
    Aufgabe(String pText, int pJ, int pM, int pT){
        text=pText;
        datum=new Date(pJ,pM,pT);
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
