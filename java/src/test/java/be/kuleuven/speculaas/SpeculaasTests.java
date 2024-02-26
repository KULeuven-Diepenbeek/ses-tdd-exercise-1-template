package be.kuleuven.speculaas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SpeculaasTests {

    @Test
    public void maakNieuweSpeculaasAan_standaardZonderBoter() {
        var speculaas = new Speculaas();

        assertThat(speculaas.getBoter()).isEqualTo(0);
    }

    // TODO Opgave 1: vul aan, zie opgave 1 in README.md!
}
