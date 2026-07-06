import java.util.Scanner;

public class NumberTypes {

    // Factorial Function
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // ---------------- Armstrong ----------------
        int temp = num;
        int digits = String.valueOf(num).length();
        int armSum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            armSum += (int) Math.pow(rem, digits);
            temp /= 10;
        }

        if (armSum == num)
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is NOT an Armstrong Number");

        // ---------------- Strong ----------------
        temp = num;
        int strongSum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            strongSum += factorial(rem);
            temp /= 10;
        }

        if (strongSum == num)
            System.out.println(num + " is a Strong Number");
        else
            System.out.println(num + " is NOT a Strong Number");

        // ---------------- Perfect ----------------
        int perfectSum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                perfectSum += i;
        }

        if (perfectSum == num)
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is NOT a Perfect Number");

        // ---------------- Harshad ----------------
        temp = num;
        int digitSum = 0;

        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }

        if (digitSum != 0 && num % digitSum == 0)
            System.out.println(num + " is a Harshad Number");
        else
            System.out.println(num + " is NOT a Harshad Number");

        // ---------------- Neon ----------------
        int square = num * num;
        temp = square;
        int neonSum = 0;

        while (temp > 0) {
            neonSum += temp % 10;
            temp /= 10;
        }

        if (neonSum == num)
            System.out.println(num + " is a Neon Number");
        else
            System.out.println(num + " is NOT a Neon Number");

        // ---------------- Duck ----------------
        String str = String.valueOf(num);

        if (str.charAt(0) != '0' && str.contains("0"))
            System.out.println(num + " is a Duck Number");
        else
            System.out.println(num + " is NOT a Duck Number");

        // ---------------- Automorphic ----------------
        if (String.valueOf(square).endsWith(str))
            System.out.println(num + " is an Automorphic Number");
        else
            System.out.println(num + " is NOT an Automorphic Number");

        // ---------------- Sunny ----------------
        int root = (int) Math.sqrt(num + 1);

        if (root * root == num + 1)
            System.out.println(num + " is a Sunny Number");
        else
            System.out.println(num + " is NOT a Sunny Number");

        // ---------------- Spy ----------------
        temp = num;
        int spySum = 0;
        int spyProduct = 1;

        while (temp > 0) {
            int rem = temp % 10;
            spySum += rem;
            spyProduct *= rem;
            temp /= 10;
        }

        if (spySum == spyProduct)
            System.out.println(num + " is a Spy Number");
        else
            System.out.println(num + " is NOT a Spy Number");

        // ---------------- Disarium ----------------
        int disariumSum = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            disariumSum += (int) Math.pow(digit, i + 1);
        }

        if (disariumSum == num)
            System.out.println(num + " is a Disarium Number");
        else
            System.out.println(num + " is NOT a Disarium Number");

        sc.close();
    }
}