import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);

    public int addDenominator(){
        int denominator;
        System.out.print("input first fraction denominator: ");
        denominator = Integer.parseInt(input.nextLine());
        try{
            if(denominator == 0){
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("please input any other number other than 0");
            addDenominator();
        }
        return denominator;
    }

    public Fraction createNum1(){
        Fraction f1 = new Fraction();
        f1.setDenominator(addDenominator());
        System.out.print("input first fraction numerator: ");
        int f1Numerator = Integer.parseInt(input.nextLine());
        f1.setNumerator(f1Numerator);
        return f1;
    }

    public Fraction createNum2(){
        Fraction f2 = new Fraction();
        System.out.print("input second fraction denominator: ");
        int f2Denominator = Integer.parseInt(input.nextLine());
        f2.setDenominator(f2Denominator);
        System.out.print("input second fraction numerator: ");
        int f2Numerator = Integer.parseInt(input.nextLine());
        f2.setNumerator(f2Numerator);
        return f2;
    }

}
