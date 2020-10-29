
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Fraction> fractions = new ArrayList<>();

        Methods m = new Methods();
        Menus menu = new Menus();

        do{
            System.out.println("========== Menu ==========");
            System.out.println("1. Create 2 number");
            System.out.println("2. Add 2 numbers");
            System.out.println("3. Subtract 2 numbers");
            System.out.println("4. Multiply 2 numbers");
            System.out.println("5. Divide 2 numbers");

            int choice = Integer.parseInt(input.nextLine());

            switch(choice){
                case 1:
                    fractions.add(menu.createNum1());
                    fractions.add(menu.createNum2());
                    break;
                case 2:
                    System.out.println(m.Add(fractions.get(0), fractions.get(1)));
                    break;
                case 3:
                    System.out.println(m.subtract(fractions.get(0), fractions.get(1)));
                    break;
                case 4:
                    System.out.println(m.multiply(fractions.get(0), fractions.get(1)));
                    break;
                case 5:
                    System.out.println(m.divide(fractions.get(0), fractions.get(1)));
                    break;
                default:
                    System.out.println("there is no such option");
                    break;
            }
        }while(true);

    }
}
