import java.util.Scanner;

public class Calculator {

    // Methods for basic operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            //return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        boolean running = true;

        System.out.println("Welcome to Java Console Calculator");

         

        while (running) {
            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Choose operation: +  -  *  /");
            String operator = scanner.next();

            double result = 0;

            switch (operator) {
                case "+":
                    result = add(num1, num2);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    break;
                case "*":
                    result = multiply(num1, num2);
                    break;
                case "/":
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }

            System.out.println("Result : " + result);

           System.out.print("Do you want to perform another calculation? (yes/no): ");
           String choice = scanner.next();
            if (!choice.equalsIgnoreCase("yes")) {
                running = false;
                System.out.println("Exiting Calculator. Thank you!");
            }
             

        }
        scanner.close();

        
        
    }
}
