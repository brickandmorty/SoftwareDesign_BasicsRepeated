package campus02.iwi.horvat.Provisonsberechnung;

public class ProvisionsberechnungMini implements Provisionsberechnung {
    @Override
    public double berechneProvision(Mitarbeiter mitarbeiter) {
        return mitarbeiter.umsatz * 0.05;
    }
}
