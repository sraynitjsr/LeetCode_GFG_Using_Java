import java.util.PriorityQueue;

public class LongestConsecutiveSequence {
    
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
        }

        int longestStreak = 1;
        int currentStreak = 1;
        int prevNum = pq.poll();

        while (!pq.isEmpty()) {
            int num = pq.poll();

            if (num == prevNum + 1) {
                currentStreak++;
            } else if (num != prevNum) {
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1;
            }

            prevNum = num;
        }

        return Math.max(longestStreak, currentStreak);
    }

    public static void longestConsecutiveSequence() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of longest consecutive sequence: " + longestConsecutive(nums));
    }
}
