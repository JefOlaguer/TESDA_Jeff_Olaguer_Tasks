package chapter4;

import java.util.Scanner;

public class Task7 {

    // Method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method for division
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Return Not-a-Number (NaN) if division by zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the arithmetic operations
        double additionResult = add(num1, num2);
        double subtractionResult = subtract(num1, num2);
        double multiplicationResult = multiply(num1, num2);
        double divisionResult = divide(num1, num2);

        // Print the results
        System.out.println("\nResults:");
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        
        // Check for division by zero before printing the division result
        if (!Double.isNaN(divisionResult)) {
            System.out.println("Division: " + divisionResult);
        }

        scanner.close();
    }
}