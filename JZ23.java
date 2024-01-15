import java.util.*;
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null || pHead.next == null || pHead.next.next == null){
            return null;
        }
        ListNode fast = pHead.next.next;
        ListNode slow = pHead.next;
        while (slow != fast) {
            if(fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode enter = pHead;
        while (enter != slow) {
            enter = enter.next;
            slow = slow.next;
        }
        return enter;
    }
}
