package nl.spijkerman.ivo.ads;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public final class Utils {
    private Utils() {
    }

    public static int binarySearch(int[] haystack, int needle) {
        return binarySearch(Arrays.stream(haystack).boxed().toArray(Integer[]::new), needle, haystack.length - 1);
    }

    public static int binarySearch(int[] haystack, int needle, int maxIndex) {
        return binarySearch(Arrays.stream(haystack).boxed().toArray(Integer[]::new), needle, maxIndex);
    }

    public static <T extends Comparable<T>> int binarySearch(T[] haystack, T needle) {
        return binarySearch(Arrays.asList(haystack), needle, Comparator.naturalOrder(), haystack.length - 1);
    }

    public static <T extends Comparable<T>> int binarySearch(T[] haystack, T needle, int maxIndex) {
        return binarySearch(Arrays.asList(haystack), needle, Comparator.naturalOrder(), maxIndex);
    }

    public static <T extends Comparable<T>> int binarySearch(List<T> haystack, T needle) {
        return binarySearch(haystack, needle, Comparator.naturalOrder(), haystack.size() - 1);
    }

    public static <T> int binarySearch(List<T> haystack, T needle, Comparator<T> comparator, int maxIndex) {
        int l = 0;
        int h = maxIndex;
        int m;
        while (l <= h) {
            m = (h - l) / 2 + l;
            int c = comparator.compare(haystack.get(m), needle);
            if (c == 0) {
                return m;
            } else if (c < 0) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        ;
        return -l - 1;
    }
}
