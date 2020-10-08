import java.util.Date;

public class Aufgabe {
    private String text;
    private Date datum;
    Aufgabe(String pText, Date pDatum){
        text=pText;
        datum=pDatum;
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
