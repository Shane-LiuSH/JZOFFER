import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param head ListNode类 
     * @return ListNode类
     */
    public ListNode ReverseList (ListNode head) {
        // write code here
        ListNode dummy = new ListNode(0);
        ListNode tmp = head;
        ListNode N;
        while (tmp != null) {
            N = tmp.next;
            tmp.next = dummy.next;
            dummy.next = tmp;
            tmp = N;
        }
        return dummy.next;
    }
}