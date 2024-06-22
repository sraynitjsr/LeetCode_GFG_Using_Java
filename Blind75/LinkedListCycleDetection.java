import java.util.HashSet;

public class LinkedListCycleDetection {
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    public static boolean hasCycleHashing(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        
        while (head != null) {
            if (visited.contains(head)) {
                return true;
            }
            visited.add(head);
            head = head.next;
        }
        
        return false;
    }
    
    public static void linkedListCycleDetection() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;   
        
        boolean hasCycleHashing = hasCycleHashing(head);
        System.out.println(hasCycleHashing);
    }
}
