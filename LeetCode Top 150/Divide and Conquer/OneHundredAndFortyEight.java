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

    public int bubbleSort(ListNode prev, int loc, int changed, int max) {
        loc++;
        if (prev.next != null && loc <= max) {
            if (prev.next.next != null) {
                ListNode curr = prev.next;
                if (curr.next.val < curr.val) {
                    ListNode currNext = curr.next.next;
                    prev.next = prev.next.next;
                    prev.next.next = curr;
                    curr.next = currNext;
                    
                    changed = loc;
                }

                changed = bubbleSort(prev.next, loc, changed, max);
            }

        }

        return changed;
    }

    public ListNode sortList(ListNode head) {
        int changed = 1;
        int max = Integer.MAX_VALUE;

        while (changed > 0) {
            changed = 0;

            ListNode curr = head;
            if (curr != null && curr.next != null) {
                if (curr.next.val < curr.val) {
                    ListNode next = curr.next.next;
                    head = curr.next;
                    curr.next = next;
                    head.next = curr;
                }
                changed = bubbleSort(head, 0, changed, max);
                max = changed;
            } 

        }

        return head;
        
    }
}