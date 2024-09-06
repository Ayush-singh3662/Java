import org.w3c.dom.Node;

public class Length_Cycle_LinkedList {
    public static void main(String[] args) {
        
    }
    public int LengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                int count = 0;
                do {
                    slow = slow.next;
                    count++;
                } while(fast != slow);
                return count;
            }
        }
        return 0;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
