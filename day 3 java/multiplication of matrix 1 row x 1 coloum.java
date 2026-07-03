import java.util.Scanner;

public class MatrixFirstRowFirstColumn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] first = new int[2][2];
        int[][] second = new int[2][2];

        System.out.println("Enter First Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                first[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                second[i][j] = sc.nextInt();
            }
        }

        int result = 0;

        // First row of first matrix × First column of second matrix
        for (int k = 0; k < 2; k++) {
            result += first[0][k] * second[k][0];
        }

        System.out.println("First Row × First Column = " + result);

        sc.close();
    }
}