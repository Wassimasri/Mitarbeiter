/**
 * @author Anton Schmalfuß
 */

public interface IMitarbeiter {

    float mindestLohn = 9.60f;
    float entgeltBerechnen();

    enum vertragsArtT {
        ANGESTELLTER,
        ATANGESTELLTER,
        ZEITARBEITER;
    }

}
