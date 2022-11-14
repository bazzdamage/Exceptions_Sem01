import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3};
        int[] arr2 = {0, 1, 2, 3};
        int[] arr3 = {0, 1, 2};
        int[] res = calcDifferenceOfTwoArrays(arr1, arr3);
        System.out.println(Arrays.toString(res));
    }

    static int[] calcDifferenceOfTwoArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Arrays is unequal");
            throw new IllegalArgumentException();
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
