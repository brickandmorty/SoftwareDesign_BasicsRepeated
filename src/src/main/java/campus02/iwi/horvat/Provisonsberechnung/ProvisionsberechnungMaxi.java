package campus02.iwi.horvat.Provisonsberechnung;

public class ProvisionsberechnungMaxi implements Provisionsberechnung {
    @Override
    public double berechneProvision(Mitarbeiter mitarbeiter) {
        return mitarbeiter.gewinn * 0.10;
    }
}
