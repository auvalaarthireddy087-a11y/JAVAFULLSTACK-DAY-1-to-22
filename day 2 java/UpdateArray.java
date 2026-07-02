import java.util.Arrays;

public class UpdateArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // Update element at index 2
        arr[2] = 100;

        System.out.println("Updated Array:");
        System.out.println(Arrays.toString(arr));
    }
}