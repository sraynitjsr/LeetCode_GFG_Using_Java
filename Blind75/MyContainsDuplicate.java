import java.util.HashSet;

public class MyContainsDuplicate {
    public static void containsDuplicate() {
        int[] nums = {1, 2, 3, 4, 1};
        boolean result = containsDuplicate(nums);
        System.out.println("Contains Duplicate: " + result);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
