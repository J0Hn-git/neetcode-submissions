class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current  = dummy;
        int carry = 0;

        // loop as long there is node in l1 and l2.
        while(l1 != null || l2 != null || carry != 0){

            // get values from current nodes, use.
            int value1 = 0;
            int value2 = 0;

            if(l1 != null){
                value1 = l1.val;
            }
            if(l2 != null){
                value2 = l2.val;
            }
            // calculate the total sum and carry.
            int sum = value1 + value2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            // create a new node with the calculated digit.
            current.next = new ListNode(digit);
            current = current.next;

            // move pointers forward.
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }

        }
        return dummy.next;
    }
}
