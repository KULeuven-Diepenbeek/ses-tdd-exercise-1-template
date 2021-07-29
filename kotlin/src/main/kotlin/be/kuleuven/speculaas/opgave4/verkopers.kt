package be.kuleuven.speculaas.opgave4

class Verkoopster(val fabriek: SpeculaasFabriek) {

    fun verkoop(): Double {
        val gebakken = fabriek.bak()
        if(gebakken.size > 5) {
            // TODO opgave 4, zie README.md
        }
        return 0.0
    }
}