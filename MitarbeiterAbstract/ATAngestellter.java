import java.time.LocalDateTime;

/** @author Wassim Almasri
 *
 */

class ATAngestellter extends Mitarbeiter {
    private float monatsLohn;

    public ATAngestellter(String vorname, String nachname, float monatsLohn) {
        super(vorname, nachname);
        this.monatsLohn = monatsLohn;
    }

    public float getmonatsLohn() {
        return monatsLohn;
    }

    @Override
    public float entgeltBerechnen() {
        if (LocalDateTime.now().getMonthValue() == 1){
            jahresGehaltBisHeute = 0;
        }
        jahresGehaltBisHeute += monatsLohn;
        return monatsLohn;
    }
}