package Calculator;

/**
 * The Calculator class provides static methods for basic arithmetic operations.
 */
public class Calculator {

   
    public double add(double a, double b) {
        return a + b;
    }

    
    public double subtract(double a, double b) {
        return a - b;
    }

 
    public double multiply(double a, double b) {
        return a * b;
    }

    
    public double divide(double a, double b) {
        if (b == 0) {
            // Throw an exception to handle division by zero.
            throw new IllegalArgumentException("Error: Cannot divide by zero.");
        }
        return a / b;
    }
}
