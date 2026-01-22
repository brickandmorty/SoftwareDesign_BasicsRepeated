package campus02.iwi.horvat.Flugschule;

public class Stockente extends Ente {
    public Stockente() {
        flugverhalten = new Segelflugverhalten();
    }

    @Override
    public void anzeigen() {
        System.out.println("Ich bin eine Stockente!");
    }
}
