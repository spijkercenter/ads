package nl.spijkerman.ivo.ads;

public class Opdracht1_1 {

    public int teller;

    public int zoekFactorLangzaam(int n) {
        teller = 0;
        for(int i = 2; i < n - 1; i++) {
            teller++;
            if(n % i == 0) {
                return i;
            }
        }
        return n;
    }

    public int zoekFactorSnel(int n) {
        teller = 0;
        for(int i = 2; i < Math.sqrt(n * 1.0); i++) {
            teller++;
            if(n % i == 0) {
                return i;
            }
        }
        return n;
    }

}
