import java.util.Scanner;

/**
 * SimpleCalculator - A simple command-line calculator application
 * Performs basic arithmetic operations: addition, subtraction, multiplication, and division
 */
public class SimpleCalculator {
    
    private Scanner scanner;
    
    public SimpleCalculator() {
        scanner = new Scanner(System.in);
    }
    
    /**
     * Main method to run the calculator application
     */
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.run();
    }
    
    /**
     * Main calculator loop
     */
    public void run() {
        System.out.println("====================================");
        System.out.println("   Welcome to Simple Calculator");
        System.out.println("====================================");
        
        boolean continueCalculating = true;
        
        while (continueCalculating) {
            try {
                // Get first number
                System.out.print("\nEnter first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());
                
                // Get operation
                System.out.print("Enter operation (+, -, *, /): ");
                String operation = scanner.nextLine().trim();
                
                // Get second number
                System.out.print("Enter second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());
                
                // Perform calculation
                double result = calculate(num1, num2, operation);
                
                // Display result
                System.out.println("\nResult: " + num1 + " " + operation + " " + num2 + " = " + result);
                
            } catch (NumberFormatException e) {
                System.out.println("\nError: Please enter valid numbers!");
            } catch (ArithmeticException e) {
                System.out.println("\nError: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("\nError: " + e.getMessage());
            }
            
            // Ask if user wants to continue
            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            continueCalculating = response.equals("yes") || response.equals("y");
        }
        
        System.out.println("\nThank you for using Simple Calculator!");
        scanner.close();
    }
    
    /**
     * Perform the calculation based on the operation
     * 
     * @param num1 First number
     * @param num2 Second number
     * @param operation Operation to perform (+, -, *, /)
     * @return Result of the calculation
     * @throws ArithmeticException if division by zero
     * @throws IllegalArgumentException if invalid operation
     */
    public double calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "+":
                return add(num1, num2);
            case "-":
                return subtract(num1, num2);
            case "*":
                return multiply(num1, num2);
            case "/":
                return divide(num1, num2);
            default:
                throw new IllegalArgumentException("Invalid operation! Please use +, -, *, or /");
        }
    }
    
    /**
     * Add two numbers
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtract two numbers
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiply two numbers
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Divide two numbers
     * 
     * @throws ArithmeticException if dividing by zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
}
