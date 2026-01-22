package campus02.iwi.horvat.Provisonsberechnung;

public class ProvisionsDemo {
    public static void main(String[] args) {
        System.out.println("=== Provisions-Demo ===\n");

        MitarbeiterManager manager = new MitarbeiterManager();

        Mitarbeiter anna = new Mitarbeiter("Anna", 10000, 3000);
        Mitarbeiter bob = new Mitarbeiter("Bob", 20000, 5000);

        manager.addMitarbeiter(anna);
        manager.addMitarbeiter(bob);

        System.out.println("--- Mit ProvisionsberechnungMini (5% vom Umsatz) ---");
        manager.setProvisionsberechnung(new ProvisionsberechnungMini());
        manager.printAlleMitarbeiterMitProvision();

        System.out.println("\n--- Mit ProvisionsberechnungMaxi (10% vom Gewinn) ---");
        manager.setProvisionsberechnung(new ProvisionsberechnungMaxi());
        manager.printAlleMitarbeiterMitProvision();

        System.out.println("\n--- Zurück zu ProvisionsberechnungMini ---");
        manager.setProvisionsberechnung(new ProvisionsberechnungMini());
        manager.printAlleMitarbeiterMitProvision();
    }
}
