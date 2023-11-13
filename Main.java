import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        var choosingFunction = true;

        System.out.print("Pick your first number: ");
        calculator.setA(scanner.nextInt());

        System.out.print("Pick your second number: ");
        calculator.setB(scanner.nextInt());

        while(choosingFunction) {
            System.out.println("     ");

            System.out.println("What would you like to do with " + calculator.getA() + " and " + calculator.getB() + "?: ");
            System.out.println("************************************************");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Choose option: ");

            var function = scanner.nextInt();

            System.out.println("        ");

            if (function == 1) {
                calculator.add(calculator.getA(), calculator.getB());
                choosingFunction = false;
            } else if (function == 2) {
                calculator.subtract(calculator.getA(), calculator.getB());
                choosingFunction = false;
            } else if (function == 3) {
                calculator.multiply(calculator.getA(), calculator.getB());
                choosingFunction = false;
            } else if (function == 4){
                calculator.divide(calculator.getA(), calculator.getB());
                choosingFunction = false;
            } else {
                System.out.println("Please choose a number between 1 and 4.");
            }
        }


    }
}