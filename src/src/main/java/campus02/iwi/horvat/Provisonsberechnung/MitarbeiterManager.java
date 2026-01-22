package campus02.iwi.horvat.Provisonsberechnung;

import java.util.ArrayList;
import java.util.List;

public class MitarbeiterManager {
    private List<Mitarbeiter> mitarbeiterList;
    private Provisionsberechnung provisionsberechnung;

    public MitarbeiterManager() {
        this.mitarbeiterList = new ArrayList<>();
    }

    public void setProvisionsberechnung(Provisionsberechnung provisionsberechnung) {
        this.provisionsberechnung = provisionsberechnung;
    }

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterList.add(mitarbeiter);
    }

    public double berechneProvision(Mitarbeiter mitarbeiter) {
        if (provisionsberechnung != null) {
            return provisionsberechnung.berechneProvision(mitarbeiter);
        }
        return 0.0;


        // if (provisionsberechnung == null) {
        //return; }
        // --> So könnte man das auch abwickeln. Es gewährleistet, dass sämtliche Berechnungen
        // in den folgenden Zeilen auf jeden Fall kein 0 ergeben.
    }

    public void printAlleMitarbeiterMitProvision() {
        for (Mitarbeiter m : mitarbeiterList) {
            double provision = berechneProvision(m);
            System.out.println(m.name + " - Provision: " + provision + " EUR");
        }
    }
}
