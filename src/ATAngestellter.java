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
        
        private vertragsArtT vertrag = vertragsArtT.ATANGESTELLTER

    @Override
    public float entgeltBerechnen() {
        if (LocalDateTime.now().getMonthValue() == 1){
            jahresGehaltBisHeute = 0;
        }
        jahresGehaltBisHeute += monatsLohn;
        return monatsLohn;
    }
    
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
