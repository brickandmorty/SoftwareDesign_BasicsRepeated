package campus02.iwi.horvat.Provisonsberechnung;

public class ProvisionsDemo {
    public static void main(String[] args) {
        System.out.println("=== Provisions-Demo ===\n");

        MitarbeiterManager manager = new MitarbeiterManager();

        Mitarbeiter anna = new Mitarbeiter("Anna", 10000, 3000);
        Mitarbeiter bob = new Mitarbeiter("Bob", 20000, 5000);
        Mitarbeiter haluka = new Mitarbeiter("Haluka",45000.34d, 2000.99d );

        manager.addMitarbeiter(anna);
        manager.addMitarbeiter(bob);
        manager.addMitarbeiter(haluka);

        System.out.println("--- Mit ProvisionsberechnungMini (5% vom Umsatz) ---");
        manager.setProvisionsberechnung(new ProvisionsberechnungMini());
        manager.printAlleMitarbeiterMitProvision();

        System.out.println("\n--- Mit ProvisionsberechnungMaxi (10% vom Gewinn) ---");
        manager.setProvisionsberechnung(new ProvisionsberechnungMaxi());
        manager.printAlleMitarbeiterMitProvision();

        System.out.println("\n--- Keine Provisionsberechnung (Null) ---");
        manager.setProvisionsberechnung(new KeineProvision());
        manager.printAlleMitarbeiterMitProvision();


        System.out.println("\n--- Zurück zu ProvisionsberechnungMini ---");
        manager.setProvisionsberechnung(new ProvisionsberechnungMini());
        manager.printAlleMitarbeiterMitProvision();

        System.out.println("\n>>> Die Änderung des Preisberechnungsverhaltens zur Laufzeit wurde somit demonstriert. <<<");
    }
}
