
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode curr1 = l1;
        ListNode curr2 = l2;

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        int carry = 0;

        while(curr1 != null || curr2 != null || carry != 0) {

            int val1 = (curr1 != null) ? curr1.val : 0;
            int val2 = (curr2 != null) ? curr2.val : 0;

            int sum = val1 + val2 + carry;

            carry = sum / 10;
            int digit = sum % 10;

            head.next = new ListNode(digit);
            head = head.next;

            if(curr1 != null) {
                curr1 = curr1.next;
            }
            if(curr2 != null) {
                curr2 = curr2.next;
            }
        }
        return dummy.next;
    }
}
