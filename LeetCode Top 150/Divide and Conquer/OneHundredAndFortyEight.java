/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public boolean bubbleSort(ListNode prev, boolean changed) {
        ListNode curr = prev.next;
        if (curr != null && curr.next != null) {
            if (curr.next.val < curr.val) {
                 prev.next = prev.next.next;
                 prev.next.next = curr;
                 changed = true;
            }
            
            bubbleSort(prev.next, changed);
        } else {
            return changed;
        }

        return changed;
    }

    public ListNode sortList(ListNode head) {
        boolean changed = true;

        while (changed) {
            changed = false;

            ListNode curr = head;
            if (curr != null && curr.next != null) {
                if (curr.next.val < curr.val) {
                    ListNode next = curr.next.next;
                    head = curr.next;
                    curr.next = curr;
                    curr.next.next = next;
                }
                
                bubbleSort(head, changed);
            } 


        }

        return head;
        
    }
}