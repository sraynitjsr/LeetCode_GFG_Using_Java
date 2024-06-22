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
    
    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        
        if (!hasCycle) {
            return null;
        }
        
        ListNode ptr1 = head;
        ListNode ptr2 = slow;
        
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        return ptr1;
    }
    
    public static ListNode detectCycleHashing(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        
        while (head != null) {
            if (visited.contains(head)) {
                return head;
            }
            visited.add(head);
            head = head.next;
        }
        
        return null;
    }
    
    public static void linkedListCycleDetection() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        
        ListNode cycleNodeFloyd = detectCycle(head);
        if (cycleNodeFloyd != null) {
            System.out.println("Cycle detected using Floyd's Algorithm. Start of the cycle: " + cycleNodeFloyd.val);
        } else {
            System.out.println("No cycle detected using Floyd's Algorithm.");
        }
        
        ListNode cycleNodeHashing = detectCycleHashing(head);
        if (cycleNodeHashing != null) {
            System.out.println("Cycle detected using Hashing. Start of the cycle: " + cycleNodeHashing.val);
        } else {
            System.out.println("No cycle detected using Hashing.");
        }
    }
}
