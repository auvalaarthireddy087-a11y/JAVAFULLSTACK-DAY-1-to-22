import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        sc.close();
    }
}