import java.time.LocalDateTime;

/** @author Wassim Almasri
*
 */

class ATAngestellter  implements IMitarbeiter, ISteuerzahler
{
    private vertragsArtT vertrag = vertragsArtT.ANGESTELLTER;
    private String vorname;
    private String nachname;
    private float monatsLohn;
    private float jahresGehaltBisHeute;

    public ATAngestellter(String vorname, String nachname, float monatsLohn)
    {
        if (monatsLohn/160 < mindestLohn){
            System.err.println("Der ATAngestellte " + vorname + " " + nachname + " erhält nicht den gesetzlich festgesetzten Mindestlohn!");
        }
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatsLohn = monatsLohn;

    public float getmonatsLohn() {
        return monatsLohn;
    }

    public float getJahresGehaltBisHeute() {
       return jahresGehaltBisHeute;
    }
    
    @Override
    public String toString() {
       return vertrag + ": " + nachname + ", " + vorname;
    }

    @Override
    public float entgeltBerechnen() {
        jahresGehaltBisHeute += monatsLohn;
        return monatsLohn;
    }
    
    @Override
    public float tatsächlicheEinkommenSteuer() {
        return jahresGehaltBisHeute * 0.36f;
    }

     @Override
     public float voraussichtlicheEinkommenSteuer() {
        float durchschnittsGehalt =
                jahresGehaltBisHeute * 12
                / LocalDateTime.now().getMonthValue();
        return durchschnittsGehalt * 0.36f;
     }
}
