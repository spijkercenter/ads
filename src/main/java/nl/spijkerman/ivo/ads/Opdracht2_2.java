package nl.spijkerman.ivo.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Opdracht2_2 {

    static class MyList implements Opdracht2 {

        private final List<Integer> innerList = new ArrayList<>();

        @Override
        public void insertNumber(int a) {
            int i = Utils.binarySearch(innerList, a);
            if (i < 0) {
                i = -i - 1;
                innerList.add(i, a);
            }
        }

        @Override
        public boolean hasNumber(int a) {
            return innerList.contains(a);
        }

        @Override
        public List<Integer> getList() {
            return Collections.unmodifiableList(innerList);
        }
    }
}
