import java.util.*;
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode start = pHead;
        while (pHead != null) {
            RandomListNode tmp = new RandomListNode(pHead.label);
            tmp.next = pHead.next;
            pHead.next = tmp;
            pHead = tmp.next;
        }
        pHead = start;
        while (pHead != null) {
            if(pHead.random == null){
                pHead.next.random = null;
            }
            else{
                pHead.next.random = pHead.random.next;
            }
            pHead = pHead.next.next;
        }
        pHead = start;
        RandomListNode clonedHead = pHead.next;
        RandomListNode current = pHead;
        while (current != null) {
            RandomListNode clone = current.next; 
            current.next = clone.next; 
            current = current.next; 
            if (current != null) {
                clone.next = current.next; 
            }
        }
        return clonedHead;
    }
}
