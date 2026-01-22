package campus02.iwi.horvat.Provisonsberechnung;

public interface Provisionsberechnung {


    /** Interface ist eine rein abstrakte Klasse, soll also über keinen Body verfügen.
     * Achtung: Nicht einmal ein leerer Body. Dieser wird konkret dann in den Klassen, welche
     * das Interface jeweils implementieren hinzugefügt > das ist die erwähnte Flexibilität
     */


    // die Maske für unsere Provisionsberechnung

    double berechneProvision(Mitarbeiter mitarbeiter);
}
