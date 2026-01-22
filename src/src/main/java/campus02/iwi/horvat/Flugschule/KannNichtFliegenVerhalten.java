package campus02.iwi.horvat.Flugschule;

public class KannNichtFliegenVerhalten implements Flugverhalten {
    @Override
    public void fliegen() {
        System.out.println("Ich kann nicht fliegen!");
    }
}
