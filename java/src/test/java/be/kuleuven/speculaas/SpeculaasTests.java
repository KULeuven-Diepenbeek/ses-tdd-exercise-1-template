package be.kuleuven.speculaas;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SpeculaasTests {

    @Test
    public void maakNieuweSpeculaasAan_standaardZonderBoter() {
        var speculaas = new Speculaas();

        assertThat(speculaas.getBoter(), is(0));
    }

    // TODO Opgave 1: vul aan, zie opgave 1 in README.md!
}
