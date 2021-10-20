/**
 * @author Anton Schmalfuss
 */

public abstract class Mitarbeiter {

    /*
     * zu vererbende Variablen
     */
    protected String vorname;
    protected String nachname;
    protected float jahresGehaltBisHeute;

    public Mitarbeiter(String vorname, String nachname) {
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

    public abstract float entgeltBerechnen();

    public static void main(String[] args) {
        Zeitarbeiter zeitarbeiter = new Zeitarbeiter("Abedalrhman", "Abdulaal", 21.50F, 160);
        Angestellter angestellter = new Angestellter("Wassim", "Almasri", 2134.20F, 25, 4);
        ATAngestellter atAngestellter = new ATAngestellter("Anton", "Schmalfuß", 2641.78F);

        System.out.println(zeitarbeiter.toString() + ":"
                + "\nMonatsgehalt: " + zeitarbeiter.entgeltBerechnen()
                + "\nJahresgehalt bis Heute: " + zeitarbeiter.getJahresGehaltBisHeute()
                + "\n----------------------");
        System.out.println(angestellter.toString() + ":"
                + "\nMonatsgehalt: " + angestellter.entgeltBerechnen()
                + "\nJahresgehalt bis Heute: " + angestellter.getJahresGehaltBisHeute()
                + "\n----------------------");
        System.out.println(atAngestellter.toString() + ":"
                + "\nMonatsgehalt: " + atAngestellter.entgeltBerechnen()
                + "\nJahresgehalt bis Heute: " + atAngestellter.getJahresGehaltBisHeute()
                + "\n----------------------");

    }
}
