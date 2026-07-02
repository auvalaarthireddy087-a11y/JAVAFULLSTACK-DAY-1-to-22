import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int indexToRemove = 2;
        int[] result = new int[original.length - 1];
        System.arraycopy(original, 0, result, 0, indexToRemove);
        System.arraycopy(original,indexToRemove + 1, result,
        indexToRemove, original.length - indexToRemove - 1);
        System.out.println(Arrays.toString(result));
    }
}