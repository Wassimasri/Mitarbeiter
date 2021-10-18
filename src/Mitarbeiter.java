public abstract class Mitarbeiter {

    protected String vorname;
    protected String nachname;
    protected float jahresGehaltBisHeute;

    public Mitarbeiter(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public float getJahresGehaltBisHeute() {
        return jahresGehaltBisHeute;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String toString() {
        return nachname + ", " + vorname;
    }

    public abstract float entgeldBerechnen();

    public static void main(String[] args) {
    }
}
