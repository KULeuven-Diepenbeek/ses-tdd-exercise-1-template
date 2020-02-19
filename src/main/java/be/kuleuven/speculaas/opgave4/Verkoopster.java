package be.kuleuven.speculaas.opgave4;

public class Verkoopster {

    private SpeculaasFabriek  speculaasFabriek;

    public void setSpeculaasFabriek(SpeculaasFabriek speculaasFabriek) {
        this.speculaasFabriek = speculaasFabriek;
    }

    public Verkoopster() {

    }

    public double verkoop() {
        var gebakken = speculaasFabriek.bak();
        if(gebakken.size() > 5) {
            // TODO opgave 4; zie README.md
        }
        return 0;
    }
}
