import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int[] arr1 = {50, 12, 4, 355};
        int[] arr2 = {0, 1, 2, 3};
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3, 4};
        int[] arr5 = null;
        int[] arr6 = null;
        int[] arr7 = {};
        int[] arr8 = {};
        int[] res = calcQuotientOfTwoArrays(arr7, arr8);
        System.out.println(Arrays.toString(res));
    }

    static int[] calcQuotientOfTwoArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("One of Arrays are null");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays is unequal");
        }
        if (arr1.length == 0) {
            throw new RuntimeException("Array is empty");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            try {
                result[i] = arr1[i] / arr2[i];
            } catch (ArithmeticException e) {
                throw new RuntimeException("Divide by zero may cause big troubles...");
            }
        }
        return result;
    }
}
