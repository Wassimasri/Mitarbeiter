import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Zeitarbeiter zeitarbeiter = new Zeitarbeiter("Abedalrhman", "Abdulaal", 21.50F, 160);
        Angestellter angestellter = new Angestellter("Wassim", "Almasri", 2134.20F, 25, 4);
        ATAngestellter atAngestellter = new ATAngestellter("Anton", "Schmalfuß", 2641.78F);


        for (int i = 0; i < LocalDateTime.now().getMonthValue(); i++){
            zeitarbeiter.entgeltBerechnen();
            angestellter.entgeltBerechnen();
            atAngestellter.entgeltBerechnen();
        }

        System.out.println(zeitarbeiter.toString() + ":"
                + "\nMonatsgehalt: " + zeitarbeiter.entgeltBerechnen()
                + "\nJahresgehalt bis Heute: " + zeitarbeiter.getJahresGehaltBisHeute()
                + "\nAktuell anfallende Einkommensteuer: " + zeitarbeiter.tatsächlicheEinkommenSteuer()
                + "\nVorraussichtliche Einkommensteuer: " + zeitarbeiter.voraussichtlicheEinkommenSteuer()
                + "\n----------------------");
        System.out.println(angestellter.toString() + ":"
                + "\nMonatsgehalt: " + angestellter.entgeltBerechnen()
                + "\nJahresgehalt bis Heute: " + angestellter.getJahresGehaltBisHeute()
                + "\nAktuell anfallende Einkommensteuer: " + angestellter.tatsächlicheEinkommenSteuer()
                + "\nVorraussichtliche Einkommensteuer: " + angestellter.voraussichtlicheEinkommenSteuer()
                + "\n----------------------");
        System.out.println(atAngestellter.toString() + ":"
                + "\nMonatsgehalt: " + atAngestellter.entgeltBerechnen()
                + "\nJahresgehalt bis Heute: " + atAngestellter.getJahresGehaltBisHeute()
                + "\nAktuell anfallende Einkommensteuer: " + atAngestellter.tatsächlicheEinkommenSteuer()
                + "\nVorraussichtliche Einkommensteuer: " + atAngestellter.voraussichtlicheEinkommenSteuer()
                + "\n----------------------");

    }
    }
}
