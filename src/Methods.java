public class Methods {

    public String Add(Fraction f1, Fraction f2){
        f1.findOptimized(f1);
        f2.findOptimized(f2);
        Fraction fAdd = new Fraction();
        int fAddNumerator = f1.getNumerator()*f2.getDenominator() + f2.getNumerator()*f1.getDenominator();
        int fAddDenominator = f1.getDenominator() * f2.getDenominator();
        fAdd.setNumerator(fAddNumerator);
        fAdd.setDenominator(fAddDenominator);
        if(fAdd.isDivisible(fAddNumerator,fAddDenominator)){
            int result = fAddNumerator/fAddDenominator;
            return result + " ";
        }
        return fAdd.toString();
    }

    public String subtract(Fraction f1, Fraction f2){
        f1.findOptimized(f1);
        f2.findOptimized(f2);
        Fraction fSubtract = new Fraction();
        int fSubtractNumerator = f1.getNumerator()*f2.getDenominator() - f2.getNumerator()*f1.getDenominator();
        int fSubtractDenominator = f1.getDenominator() * f2.getDenominator();
        fSubtract.setNumerator(fSubtractNumerator);
        fSubtract.setDenominator(fSubtractDenominator);
        if(fSubtract.isDivisible(fSubtractNumerator,fSubtractDenominator)){
            int result = fSubtractNumerator/fSubtractDenominator;
            return result + " ";
        }
        return fSubtract.toString();
    }

    public String multiply(Fraction f1, Fraction f2){
        f1.findOptimized(f1);
        f2.findOptimized(f2);
        Fraction fMultiple = new Fraction();
        int fMultipleNumerator = f1.getNumerator()*f2.getNumerator();
        int fMultipleDenominator = f1.getDenominator() * f2.getDenominator();
        fMultiple.setNumerator(fMultipleNumerator);
        fMultiple.setDenominator(fMultipleDenominator);
        if(fMultiple.isDivisible(fMultipleNumerator,fMultipleDenominator)){
            int result = fMultipleNumerator/fMultipleDenominator;
            return result + " ";
        }
        return fMultiple.toString();
    }

    public String divide(Fraction f1, Fraction f2){
        f1.findOptimized(f1);
        f2.findOptimized(f2);

        Fraction fDivide = new Fraction();
        int fDivideNumerator = f1.getNumerator()*f2.getDenominator();
        int fDivideDenominator = f1.getDenominator() * f2.getNumerator();
        fDivide.setNumerator(fDivideNumerator);
        fDivide.setDenominator(fDivideDenominator);
        if(fDivide.isDivisible(fDivideNumerator,fDivideDenominator)){
            int result = fDivideNumerator/fDivideDenominator;
            return result + " ";
        }
        return fDivide.toString();
    }
}
