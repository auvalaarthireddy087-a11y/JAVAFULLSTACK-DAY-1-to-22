import java.util.Scanner;

public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not possible.");
            return 0;
        }
        return a / b;
    }

    static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Addition = " + add(a, b));
                break;

            case 2:
                System.out.println("Subtraction = " + subtract(a, b));
                break;

            case 3:
                System.out.println("Multiplication = " + multiply(a, b));
                break;

            case 4:
                System.out.println("Division = " + divide(a, b));
                break;

            case 5:
                System.out.println("Modulus = " + modulus(a, b));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}