import java.time.LocalDateTime;

/**
 * Klasse Zeitarbeiter ist eine Subklasse von Mitarbeiter
 * Und berechnet das Monatsgehalt anhand der Anzahl von gearbeiteten Stunden.
 *
 * @author Abedalrhman Abdulaal
 * @version 19.10.2021
 */

public class Zeitarbeiter extends Mitarbeiter {

    //Stundenlohn des Zeitarbeiters
    private final float stundenLohn;
    //Anzahl gearbeitete Stunden zum ausrechnen des Entgelts
    private int gearbeiteteStunden;

    /**
     * Konstruktor der Klasse Zeitarbeiter.
     *
     * @param vorname     Vorname des Zeitarbeiters
     * @param nachname    Nachname des Zeitarbeiters
     * @param stundenLohn Lohn pro Stunde des Zeitarbeiters
     */
    public Zeitarbeiter(String vorname, String nachname, float stundenLohn, int gearbeiteteStunden) {
        super(vorname, nachname);
        this.stundenLohn = stundenLohn;
        this.gearbeiteteStunden = gearbeiteteStunden;
    }

    /**
     * @return stundenLohn des Zeitarbeiters
     */
    public float getStundenLohn() {
        return stundenLohn;
    }

    /**
     * @return gearbeiteteStunden des Zeitarbeiters
     */
    public int getGearbeiteteStunden() {

        return gearbeiteteStunden;
    }

    /**
     * @param gearbeiteteStunden zum setzen der gearbeiteten Stunden
     */
    public void setGearbeiteteStunden(int gearbeiteteStunden) {

        this.gearbeiteteStunden = gearbeiteteStunden;
    }

    /**
     * Berechnet das Entgelt des Zeitarbeiters am Monatsende.
     *
     * @return Monatsgehalt des Zeitarbeiters anhand der gearbeiteten Stunden.
     */
    public float entgeltBerechnen() {
        if (LocalDateTime.now().getMonthValue() == 1){
            jahresGehaltBisHeute = 0;
        }
        float entgelt = stundenLohn * gearbeiteteStunden;
        jahresGehaltBisHeute = jahresGehaltBisHeute + entgelt;

        return entgelt;
    }
}