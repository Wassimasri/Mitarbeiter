import java.time.LocalDateTime;

/**@author Wassim Almasri & Anton Schmalfuß
 * 
 */

class Angestellter implements IMitarbeiter, ISteuerzahler
    {

        private vertragsArtT vertrag = vertragsArtT.ANGESTELLTER;
        private String vorname;
        private String nachname;
        private float jahresGehaltBisHeute;
        private float monatsLohn;
        private float ueberStundenTarif;
        private int gearbeiteteUeberstunden;

    public Angestellter(String vorname, String nachname, float monatsLohn, float ueberStundenTarif, int gearbeiteteUeberStunden)
    {
        if (monatsLohn/160 < mindestLohn){
            System.err.println("Der Angestellte " + vorname + " " + nachname + " erhält nicht den gesetzlich festgesetzten Mindestlohn!");
        }
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatsLohn = monatsLohn;
        this.ueberStundenTarif = ueberStundenTarif;
        this.gearbeiteteUeberstunden = gearbeiteteUeberStunden;
    }

    public void setGearbeiteteUeberstunden(int gearbeiteteUeberstunden) {
        this.gearbeiteteUeberstunden = gearbeiteteUeberstunden;
    }

    public float getmonatsLohn()
        {

            return monatsLohn;
        }

        public float getUeberStundenTarif()
        {

            return ueberStundenTarif;
        }

        public int getGearbeiteteUeberstunden()
        {

            return gearbeiteteUeberstunden;
        }

        public float getJahresGehaltBisHeute() {
            return jahresGehaltBisHeute;
        }

        @Override
        public String toString() {
            return vertrag + ": " + nachname + ", " + vorname;
        }

        @Override
        public float entgeltBerechnen()
        {
            if (LocalDateTime.now().getMonthValue() == 1){
                jahresGehaltBisHeute = 0;
            }
            jahresGehaltBisHeute += monatsLohn + ueberStundenTarif * gearbeiteteUeberstunden;
            return monatsLohn + ueberStundenTarif * gearbeiteteUeberstunden;
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
