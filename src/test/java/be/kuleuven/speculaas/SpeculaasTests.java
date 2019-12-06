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

    // TODO vul aan, zie opgave in README.md!
}
