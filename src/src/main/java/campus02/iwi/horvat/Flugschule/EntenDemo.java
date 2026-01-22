package campus02.iwi.horvat.Flugschule;

import campus02.iwi.horvat.Flugschule.*;

// Demo des Strategy Patterns mit Flugverhalten von Enten

public class EntenDemo {

    public static void main(String[] args) {
        System.out.println("=== Interface Demo: Strategy Pattern mit Enten ===\n");

        Ente rotkopfente = new Rotkopfente();
        rotkopfente.anzeigen();
        rotkopfente.performFliegen();
        rotkopfente.schwimmen();

        System.out.println();

        Ente stockente = new Stockente();
        stockente.anzeigen();
        stockente.performFliegen();
        stockente.schwimmen();

        System.out.println();

        Ente gummiente = new Gummiente();
        gummiente.anzeigen();
        gummiente.performFliegen();
        gummiente.schwimmen();

        System.out.println("\n=== Dynamisches Ändern des Verhaltens ===");
        gummiente.setFlugverhalten(new Flatterflugverhalten());
        System.out.println("Gummiente lernt fliegen:");
        gummiente.performFliegen();
    }
}

