package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
       
        Calculator calculator = new Calculator();
        
        // Use a loop to allow the user to perform multiple calculations.
        while (true) {
            try {
                // Prompt the user for the first number.
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                // Prompt the user for the second number.
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

      
                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                double result;

                // Use a switch statement to perform the correct operation.
                switch (operator) {
                    case '+':
                        result = calculator.add(num1, num2);
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case '-':
                        result = calculator.subtract(num1, num2);
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case '*':
                        result = calculator.multiply(num1, num2);
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case '/':
                        // The division operation is wrapped in a try-catch block
                        // to handle the specific case of dividing by zero.
                        try {
                            result = calculator.divide(num1, num2);
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        } catch (IllegalArgumentException e) {
                            // Catch the exception from the Calculator class and print its message.
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        // Handle cases where the user enters an invalid operator.
                        System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                        break;
                }
            
            } catch (InputMismatchException e) {
                // Handle cases where the user enters non-numeric input.
                System.out.println("Error: Invalid input. Please enter numbers only.");
                scanner.next(); // Clear the invalid input from the scanner
            }

            // Ask the user if they want to perform another calculation.
            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String continueChoice = scanner.next();

            // If the user's input, ignoring case, is not "yes", break the loop.
            if (!continueChoice.equalsIgnoreCase("yes")) {
                break;
            }
            System.out.println("----------------------------------------------------------------");
        }

        // Thank the user and close the scanner to free up resources.
        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}
