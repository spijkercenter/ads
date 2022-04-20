package nl.spijkerman.ivo.ads;

public class Opdracht1_2 {

    public int teller;

    public int zoekWoordLineair(String[] words, String theWord) {
        teller = 0;
        for (int i = 0; i < words.length; i++) {
            teller++;
            String word = words[i];
            if (word.equals(theWord)) {
                return i;
            }
        }
        return -1;
    }

    public int zoekWoordBinair(String[] words, String theWord) {
        int result = Utils.binarySearch(words, theWord);
        return result < 0 ? -1 : result;
    }
}
