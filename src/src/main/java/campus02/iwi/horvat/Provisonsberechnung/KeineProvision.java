package campus02.iwi.horvat.Provisonsberechnung;

public class KeineProvision implements Provisionsberechnung {

    //Fall abdecken, dass keine Provision berechnet werden soll

    @Override
    public double berechneProvision(Mitarbeiter mitarbeiter) {
        System.out.println("Hinweis: Kein Anspruch auf Provision bei diesem MA.");
        return 0;
    }
}
