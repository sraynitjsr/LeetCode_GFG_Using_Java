import java.util.HashMap;

public class MyTwoSum {
    public static void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;        
        HashMap<Integer, Integer> map = new HashMap<>();        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int index1 = map.get(complement);
                int index2 = i;
                System.out.println("Indices: " + index1 + ", " + index2);
                return;
            }
            map.put(nums[i], i);
        }        
        System.out.println("No two sum solution found.");
    }
}
