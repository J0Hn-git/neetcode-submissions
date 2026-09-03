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
    public boolean hasCycle(ListNode head) {
        
        Set<ListNode> set = new HashSet<>();

        ListNode curr = head;

        while(curr != null) {
            
            if(!set.contains(curr)) {
                set.add(curr);
                curr = curr.next;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
