import java.time.LocalDateTime;

/**@author Wassim Almasri
 * 
 */

class Angestellter extends Mitarbeiter
    {
        private float monatsLohn;
        private float ueberStundenTarif;
        private int gearbeiteteUeberstunden;

    public Angestellter(String vorname, String nachname, float monatsLohn, float ueberStundenTarif, int gearbeiteteUeberStunden)
    {
        super(vorname, nachname);
        this.monatsLohn=monatsLohn;
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


        @Override
        public float entgeltBerechnen()
        {
            if (LocalDateTime.now().getMonthValue() == 1){
                jahresGehaltBisHeute = 0;
            }
            jahresGehaltBisHeute += monatsLohn + ueberStundenTarif * gearbeiteteUeberstunden;
            return monatsLohn + ueberStundenTarif * gearbeiteteUeberstunden;
        }
    }