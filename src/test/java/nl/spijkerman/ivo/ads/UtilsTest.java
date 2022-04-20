package nl.spijkerman.ivo.ads;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    private static final int[] array = new int[]{2, 4, 6, 8, 10};

    @Test
    void testBinarySearch_for6_expect2() {
        assertEquals(2, Arrays.binarySearch(array, 6));
        assertEquals(2, Utils.binarySearch(array, 6));
    }

    @Test
    void testBinarySearch_for7_expectN3() {
        assertEquals(-4, Arrays.binarySearch(array, 7));
        assertEquals(-4, Utils.binarySearch(array, 7));
    }

    @Test
    void testBinarySearch_for1_expectN1() {
        assertEquals(-1, Arrays.binarySearch(array, 1));
        assertEquals(-1, Utils.binarySearch(array, 1));
    }

    @Test
    void testBinarySearch_for11_expectN5() {
        assertEquals(-6, Arrays.binarySearch(array, 11));
        assertEquals(-6, Utils.binarySearch(array, 11));
    }

}