package be.kuleuven.speculaas

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class SpeculaasTests {

    @Test
    fun maakNieuweSpeculaasAan_standaardZonderBoter() {
        val speculaas = Speculaas()
        assertTrue { speculaas.boter == 0 }
    }
}