import java.util.Scanner;

public class FactorsAndPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        System.out.println("Factors of " + n + " are:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();

        if (count == 2) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is Not a Prime Number.");
        }

        sc.close();
    }
}
