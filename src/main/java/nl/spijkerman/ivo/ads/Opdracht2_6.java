package nl.spijkerman.ivo.ads;

import java.io.PrintStream;
import java.time.Year;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Opdracht2_6 {

    static record Student(
            String number,
            String name,
            Year year
    ) implements Comparable<Student> {
        @Override
        public int compareTo(Student that) {
            return Comparator.comparing(Student::name)
                    .thenComparing(Student::year)
                    .thenComparing(Student::number)
                    .compare(this, that);
        }
    }

    static class Cursus {

        private final String name;
        private final Set<Student> students;
        private final PrintStream out;

        public Cursus(String name) {
            this(name, System.out);
        }

        // Visible for testing
        Cursus(String name, PrintStream out) {
            this.name = name;
            this.out = out;
            this.students = new TreeSet<>();
        }

        void addStudent(Student student) {
            students.add(student);
        }

        boolean hasStudent(Student student) {
            return students.contains(student);
        }

        void print() {
            out.printf("%s:%n", name);
            students.forEach(student -> out.printf("  %s%n", student));
        }
    }
}
