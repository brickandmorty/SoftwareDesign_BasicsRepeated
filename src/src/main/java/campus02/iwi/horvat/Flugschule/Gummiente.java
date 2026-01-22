package campus02.iwi.horvat.Flugschule;

public class Gummiente extends Ente {
    public Gummiente() {
        flugverhalten = new KannNichtFliegenVerhalten();
    }

    @Override
    public void anzeigen() {
        System.out.println("Ich bin eine Gummiente!");
    }
}
