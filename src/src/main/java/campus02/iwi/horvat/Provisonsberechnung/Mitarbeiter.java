package campus02.iwi.horvat.Provisonsberechnung;

public class Mitarbeiter {
    public String name;
    public double umsatz;
    public double gewinn;

    public Mitarbeiter(String name, double umsatz, double gewinn) {
        this.name = name;
        this.umsatz = umsatz;
        this.gewinn = gewinn;
    }

    /** WICHTIG:
     * Um double-Werte in Java auf eine bestimmte Anzahl von Nachkommastellen zu begrenzen,
     * verwenden Sie am besten die Formatierung über String.format() (z.B. %.2f für zwei Stellen)
     * oder DecimalFormat, da double selbst Rundungsfehler hat und
     * nur eine Näherung ist.
     *
     * Alternativ können Sie Math.round() in Kombination mit Multiplikation
     * und Division verwenden, was jedoch bei sehr genauen Anforderungen weniger
     * ideal ist als spezialisierte Formatierungs-Klassen oder BigDecimal.
     */

}
