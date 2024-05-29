Class OneHundredFortyOne {
//  Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
            visited = false;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            currentNode = head;
            while(true) {
                if (currentNode.visited=false && currentNode.next != null) {
                    currentNode=currentNode.next;
                } else if (currentNode.visited=true) {
                    return true;
                } else if (currentNode.next==null) {
                    return false
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Solution();
    }
}