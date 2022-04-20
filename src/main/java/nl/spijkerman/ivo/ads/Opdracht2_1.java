package nl.spijkerman.ivo.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Opdracht2_1 {

    static class MyList  implements Opdracht2 {
        private int size = 0;
        private int[] values = new int[10];

        @SuppressWarnings("ManualArrayCopy")
        public void insertNumber(int a) {
            int ix = search(a);

            if (ix < 0) {
                if (++size > values.length) {
                    // expand array
                    int[] old = values;
                    values = new int[size * 2];
                    for (int i = 0; i < size - 1; i++) {
                        values[i] = old[i];
                    }
                }

                // copy to right
                ix = -ix - 1;
                for (int i = size - 2; i >= ix; i--) {
                    values[i + 1] = values[i];
                }

                // insert value
                values[ix] = a;
            }

        }

        public boolean hasNumber(int a) {
            return search(a) >= 0;
        }

        public List<Integer> getList() {
            List<Integer> result = new ArrayList<>(size); // we know the size beforehand, so assign it already
            for (int i = 0; i < size; i++) {
                result.add(values[i]);
            }
            return Collections.unmodifiableList(result);
        }

        private int search(int a) {
            return Utils.binarySearch(values, a, size - 1);
        }
    }
}
