import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] original = {1, 2, 3};
        int newValue = 4;

        int[] newArray = Arrays.copyOf(original, original.length + 1);

        newArray[newArray.length - 1] = newValue;

        System.out.println(newArray[3]);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}