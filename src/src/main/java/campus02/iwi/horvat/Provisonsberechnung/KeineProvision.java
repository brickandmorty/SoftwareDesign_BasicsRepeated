package campus02.iwi.horvat.Provisonsberechnung;

public class KeineProvision implements Provisionsberechnung {
    @Override
    public double berechneProvision(Mitarbeiter mitarbeiter) {
        System.out.println("Hinweis: Kein Anspruch auf Provision bei diesem MA.");
        return 0;
    }
}
