import java.util.*;

public class Program1 {
        public double calculate(double a, double b, String operation) {
            switch (operation.toLowerCase()) {
                case "add":
                    return a + b;
                case "subtract":
                    return a - b;
                case "multiply":
                    return a * b;
                case "divide":
                    if (b == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return Double.NaN;
                    }
                    return a / b;
                default:
                    System.out.println("Error: Invalid operation.");
                    return Double.NaN;
        }
    }

    // Main method to take input and call calculator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        scanner.nextLine();  // consume newline

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.nextLine();

        Program1 calc = new Program1();
        double result = calc.calculate(a, b, operation);

        System.out.println("Result: " + result);
    }
}
