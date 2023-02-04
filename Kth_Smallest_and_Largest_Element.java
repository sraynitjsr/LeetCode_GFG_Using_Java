import java.util.*;

public class Main {

    public static void kLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        System.out.printf("%d-th Largest Element is => %d\n",k,pq.peek());
    }

    public static void kSmallest(int arr[], int k) {
        PriorityQueue<Integer> pqReversed = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++) {
            pqReversed.add(arr[i]);
            if(pqReversed.size() > k) {
                pqReversed.poll();
            }
        }
        System.out.printf("%d-th Smallest Element is => %d\n", k, pqReversed.peek());
    }

    public static void main(String[] args) {
        int myArray[] = {2, 1, 3, 7, 4, 5, 8, 6};
        int k = 3;
        kLargest(myArray, k);
        kSmallest(myArray, k);        
    }
}
