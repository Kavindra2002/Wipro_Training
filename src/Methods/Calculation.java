package Methods;

import java.util.Scanner;

class calculator {
    // Method for addition
    int sum(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Display method
    void display() {
        System.out.println("Hello My name is Kavindra Pratap singh");
    }
}

public class Calculation {

    public static void main(String[] args) {
        calculator cal1 = new calculator();
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.println("Enter the first value:");
        int a = scanner.nextInt();
        System.out.println("Enter the second value:");
        int b = scanner.nextInt();

        // Perform operations
        int sumResult = cal1 .sum(a, b);
        int subtractResult = cal1 .subtract(a, b);
        int multiplyResult = cal1 .multiply(a, b);
        double divideResult = cal1 .divide(a, b);

        // Display results
        System.out.println("Addition result: " + sumResult);
        System.out.println("Subtraction result: " + subtractResult);
        System.out.println("Multiplication result: " + multiplyResult);
        System.out.println("Division result: " + divideResult);

        // Call display method
        cal1 .display();
    }
}
