import java.util.Scanner;

// Base class (Level 1)
class Person {
    protected String name;
    protected int age;

    // Method to input person details
    public void inputPersonDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine().trim();

        // Validate age input
        while (true) {
            System.out.print("Enter age: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                sc.nextLine(); // consume newline
                if (age > 0) break;
                else System.out.println("Age must be positive.");
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.nextLine(); // clear invalid input
            }
        }
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class (Level 2)
class Employee extends Person {
    protected String employeeId;

    public void inputEmployeeDetails(Scanner sc) {
        inputPersonDetails(sc); // Call base class method
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextLine().trim();
    }

    public void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}

// Derived class from Employee (Level 3)
class Manager extends Employee {
    private String department;

    public void inputManagerDetails(Scanner sc) {
        inputEmployeeDetails(sc); // Call parent method
        System.out.print("Enter Department: ");
        department = sc.nextLine().trim();
    }

    public void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Manager object (inherits from Employee -> Person)
        Manager mgr = new Manager();

        System.out.println("=== Enter Manager Details ===");
        mgr.inputManagerDetails(sc);

        System.out.println("\n=== Manager Information ===");
        mgr.displayManagerDetails();

        sc.close();
    }
}