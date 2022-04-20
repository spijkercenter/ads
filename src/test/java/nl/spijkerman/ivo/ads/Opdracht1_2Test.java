package nl.spijkerman.ivo.ads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Opdracht1_2Test {

    private final String[] dictionary = new String[]{
            "aap",
            "bravo",
            "charlie",
            "delta",
            "echo",
            "foxtrot",
            "gamma",
            "henk",
            "india",
            "junit",
            "kilo",
            "lima",
            "mies",
            "noot",
            "o-ring",
            "papa",
            "qwerty",
            "radio",
            "silence",
            "travis",
            "uranium",
            "victor",
            "wally",
            "x-ray",
            "yesman",
            "zulu"
    };

    private final Opdracht1_2 sut = new Opdracht1_2();

    @Test
    void testZoek_forExisting_expectBinairToBeFaster() {
        assertEquals(22, sut.zoekWoordBinair(dictionary, "wally"));
        int binairTeller = sut.teller;

        assertEquals(22, sut.zoekWoordLineair(dictionary, "wally"));
        int lineairTeller = sut.teller;

        assertTrue(binairTeller < lineairTeller);
    }

    @Test
    void testZoek_forNonExisting_expectBinairToBeFaster() {
        assertEquals(-1, sut.zoekWoordBinair(dictionary, "ik besta niet"));
        int binairTeller = sut.teller;

        assertEquals(-1, sut.zoekWoordLineair(dictionary, "ik besta niet"));
        int lineairTeller = sut.teller;

        assertTrue(binairTeller < lineairTeller);
    }

}