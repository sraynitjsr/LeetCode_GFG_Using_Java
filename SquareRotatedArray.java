public class SquareRotatedArray {
    public static int[] squareAndRotate(int[] nums) {
        int n = nums.length;
        int[] squared = new int[n];
        for (int i = 0; i < n; i++)
        squared[i] = nums[i] * nums[i];
        int[] result = new int[n];
        int left = 0, right = n - 1, index = n - 1;
        while (left <= right) {
            if (squared[left] > squared[right]) {
                result[index--] = squared[left++];
            } else {
                result[index--] = squared[right--];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-7, -3, -1, 4, 8, 12};
        int[] result = squareAndRotate(nums);
        System.out.print("Squared and rotated array: ");
        for (int num : result)
        System.out.print(num + " ");
    }
}
