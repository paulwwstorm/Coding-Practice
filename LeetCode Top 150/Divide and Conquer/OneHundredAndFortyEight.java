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
        if (prev.next != null) {
            if (prev.next.next != null) {
                ListNode curr = prev.next;
                if (curr.next.val < curr.val) {
                    ListNode currNext = curr.next.next;
                    prev.next = prev.next.next;
                    prev.next.next = curr;
                    curr.next = currNext;
                    
                    changed = true;
                }
            }

            changed = bubbleSort(prev.next, changed);
        }

        return changed;
    }

    public ListNode sortList(ListNode head) {
        boolean changed = true;
        ListNode activeHead = head;

        while (changed) {
            changed = false;

            ListNode curr = activeHead;
            if (curr != null && curr.next != null) {
                if (curr.next.val < curr.val) {
                    ListNode next = curr.next.next;
                    head = curr.next;
                    curr.next = next;
                    head.next = curr;
                } else {
                    activeHead = curr.next;
                }
                changed = bubbleSort(head, changed);
            } 


        }

        return head;
        
    }
}