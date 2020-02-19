package be.kuleuven.speculaas.opgave4;

import be.kuleuven.speculaas.Speculaas;

import java.util.List;

public class GoedeSpeculaasFabriek implements SpeculaasFabriek {

    public List<Speculaas> bak() {
        return List.of(new Speculaas(), new Speculaas(), new Speculaas(), new Speculaas());
    }
}
