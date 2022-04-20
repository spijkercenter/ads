package nl.spijkerman.ivo.ads;

import nl.spijkerman.ivo.ads.Opdracht2_6.Cursus;
import org.junit.jupiter.api.Test;
import org.mockito.verification.VerificationMode;

import java.io.PrintStream;
import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class Opdracht2_6Test {

    private static final VerificationMode once = times(1);

    @Test
    void testCursusFlow() {
        PrintStream out = mock(PrintStream.class);

        Cursus cursus = new Cursus("Test cursus", out);
        Opdracht2_6.Student s1 = new Opdracht2_6.Student("1234", "Henk", Year.of(1992));
        Opdracht2_6.Student s2 = new Opdracht2_6.Student("5678", "Piet", Year.of(2000));
        Opdracht2_6.Student s3 = new Opdracht2_6.Student("9abc", "Joop", Year.of(2000));

        cursus.addStudent(s1);
        cursus.addStudent(s2);
        cursus.addStudent(s2);

        cursus.print();

        assertTrue(cursus.hasStudent(s1));
        assertFalse(cursus.hasStudent(s3));

        verify(out, once).printf("%s:%n", "Test cursus");
        verify(out, once).printf("  %s%n", s1);
        verify(out, once).printf("  %s%n", s2);
        verifyNoMoreInteractions(out);
    }
}