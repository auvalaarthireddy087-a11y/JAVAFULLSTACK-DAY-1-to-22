import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.printf("Element [%d]: ", i);
            array[i] = scanner.nextInt();
        }
        System.out.println("\n--- Original Array ---");
        printArray(array);
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < size; i++) {
            if (seen.contains(array[i])) {
                array[i] = 0;
            } else {
                seen.add(array[i]);
            }
        }
        System.out.println("\n Array after deleting duplicates");
        printArray(array);

        scanner.close();
    }
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}