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
        Mitarbeiter zeitarbeiter = new Zeitarbeiter("Name", "Name", 21.50);
        Mitarbeiter angestellter = new Angestellter("Name", "Name", 2134.20, 25);
        Mitarbeiter atAngestellter = new ATAngestellter("Name", "Name", 2641.78);

        System.out.println(zeitarbeiter.toString() + ":"
                + "\nMonatsgehalt: " + zeitarbeiter.entgeldBerechnen()
                + "\nJahresgehalt bis Heute: " + zeitarbeiter.getJahresGehaltBisHeute());
        System.out.println(angestellter.toString() + ":"
                + "\nMonatsgehalt: " + angestellter.entgeldBerechnen()
                + "\nJahresgehalt bis Heute: " + angestellter.getJahresGehaltBisHeute());
        System.out.println(atAngestellter.toString() + ":"
                + "\nMonatsgehalt: " + atAngestellter.entgeldBerechnen()
                + "\nJahresgehalt bis Heute: " + atAngestellter.getJahresGehaltBisHeute());
    }
}
