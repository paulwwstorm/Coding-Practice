Class OneHundredFortyOne {
//  Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        ListNode[] visited = new ListNode[10000];
    
        public boolean hasCycle(ListNode head) {
            if (head == null) {
                return false;
            }
            ListNode currentNode = head;
    
            int count = 0;
            while (true) {
                if (currentNode.next == null) {
                    return false;
                }
    
                for (int i = 0; i < count; i++) {
                    if (currentNode == visited[i]) {
                        return true;
                    }
                }
    
                visited[count] = currentNode;
                currentNode = currentNode.next;
                count += 1;
            }
        }
    
    }
    
    public static void main(String[] args) {
        Solution();
    }
}