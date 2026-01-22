package campus02.iwi.horvat.Flugschule;

public abstract class Ente {
    protected Flugverhalten flugverhalten;

    public void performFliegen() {
        if (flugverhalten != null) {
            flugverhalten.fliegen();
        }
    }

    public void setFlugverhalten(Flugverhalten flugverhalten) {
        this.flugverhalten = flugverhalten;
    }

    public void schwimmen() {
        System.out.println("Alle Enten schwimmen!");
    }

    public void quaken() {
        System.out.println("Alle Enten schwimmen!");
    }

    public void nichtAbstractAnzeigen() {
        System.out.println("Alle Enten schwimmen!");
    }


    public abstract void anzeigen();
}
