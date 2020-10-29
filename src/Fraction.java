public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){}

    public Fraction (int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int findGCD(Fraction f) {
        int GCD = 0;
        for (int i = 1; i <= numerator && i <= denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0)
                GCD = i;
        }
        return GCD;
    }

    public void isOptimized(Fraction f){

    }

    public void findOptimized(Fraction f){
        int optimizedNumerator = f.getNumerator()/findGCD(f);
        int optimizedDenominator = f.getDenominator()/findGCD(f);
        f.setNumerator(optimizedNumerator);
        f.setDenominator(optimizedDenominator);

    }

    public boolean isDivisible(int numerator, int denominator){
        if(numerator%denominator == 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Fraction = " + numerator + "/" +
                denominator;
    }


}
