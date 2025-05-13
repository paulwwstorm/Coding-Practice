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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        Boolean firstNode = true;
        ListNode currNode = sum;
        ListNode currNode1 = l1;
        ListNode currNode2 = l2;
        int currCarry = 0;

        while (currNode1 != null || currNode2 != null) {
            ListNode newNode;
            if (firstNode) {
                newNode = sum;
                firstNode = false;
            } else {
                newNode = new ListNode();
                currNode.next = newNode;
                currNode = newNode;
            }

            int digit1 = currNode1 != null ? currNode1.val : 0;
            int digit2 = currNode2 != null ? currNode2.val : 0;

            int currSum = digit1 + digit2 + currCarry;

            if (currSum < 10) {
                currCarry = 0;
                newNode.val = currSum;
            } else {
                currCarry = 1;
                newNode.val = currSum - 10;
            }

            currNode1 = currNode1 != null && currNode1.next != null ? currNode1.next : null;
            currNode2 = currNode2 != null && currNode2.next != null ? currNode2.next : null;
        }

        if (currCarry > 0) {
            ListNode newNode = new ListNode();
            currNode.next = newNode;
            newNode.val = currCarry;
        }

        return sum;
    }
}