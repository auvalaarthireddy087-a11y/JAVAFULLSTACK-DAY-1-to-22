import java.util.Scanner;

public class RowSwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Swap first row with last row
        for (int j = 0; j < cols; j++) {
            int temp = matrix[0][j];
            matrix[0][j] = matrix[rows - 1][j];
            matrix[rows - 1][j] = temp;
        }

        System.out.println("Matrix after swapping first row and last row:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}