import java.util.*;

public class NthHighestElement {
    public static void start() {
        System.out.println("Nth Highest Element Problem");
        int n = 3; // Here we want third highest element
        
        List<Integer> input = Arrays.asList(55, 66, 77, 99, 88, 33, 11, 44, 22);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < input.size(); i++) {
            pq.add(input.get(i));
        }
        
        for (int i = 0; i < n - 1; i++) {
            pq.poll();
        }
        
        System.out.println(pq.peek() + " is the " + n + "rd highest element in the array");
    }
}
