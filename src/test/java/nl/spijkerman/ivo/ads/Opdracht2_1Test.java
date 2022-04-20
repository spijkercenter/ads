package nl.spijkerman.ivo.ads;

import nl.spijkerman.ivo.ads.Opdracht2_1.MyList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Opdracht2_1Test {

    @Test
    void testSimple() {
        MyList sut = new MyList();
        assertFalse(sut.hasNumber(0));

        sut.insertNumber(1);
        assertTrue(sut.hasNumber(1));
        assertFalse(sut.hasNumber(2));

        assertEquals(List.of(1), sut.getList());
    }

    @Test
    void testOverflow() {
        MyList sut = new MyList();
        for (int i = 100; i > 0; i--) {
            sut.insertNumber(i);
        }

        assertTrue(sut.hasNumber(55));
        assertFalse(sut.hasNumber(-1));
        assertFalse(sut.hasNumber(1001));
    }

}