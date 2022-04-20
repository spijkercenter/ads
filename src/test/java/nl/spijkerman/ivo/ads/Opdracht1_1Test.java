package nl.spijkerman.ivo.ads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Opdracht1_1Test {

    private final Opdracht1_1 sut = new Opdracht1_1();

    @Test
    void testZoekFactor_forNoFactors_expectSnelToBeFaster() {
        assertEquals(1453, sut.zoekFactorSnel(1453));
        int snelTeller = sut.teller;

        assertEquals(1453, sut.zoekFactorLangzaam(1453));
        int langzaamTeller = sut.teller;

        assertTrue(snelTeller < langzaamTeller);
    }

    @Test
    void testZoekFactor_forFactor_expectToBeSameSpeed() {
        assertEquals(2, sut.zoekFactorSnel(1_000_000));
        int snelTeller = sut.teller;

        assertEquals(2, sut.zoekFactorLangzaam(1_000_000));
        int langzaamTeller = sut.teller;

        assertEquals(snelTeller, langzaamTeller);
    }

}