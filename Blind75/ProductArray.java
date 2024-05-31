public class ProductArray {
    public static int[] getProductArray(int[] arr) {
        int n = arr.length;
        int[] prod = new int[n];

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            prod[i] = left[i] * right[i];
        }

        return prod;
    }

    public static void productArray () {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prod = getProductArray(arr);
        for (int num : prod) {
            System.out.print(num + " ");
        }
    }
}
