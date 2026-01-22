package campus02.iwi.horvat.Flugschule;

public class Rotkopfente extends Ente {
    public Rotkopfente() {
        flugverhalten = new Flatterflugverhalten();
    }

    @Override
    public void anzeigen() {
        System.out.println("Ich bin eine Rotkopfente!");
    }
}
