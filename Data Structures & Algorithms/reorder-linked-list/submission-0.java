
class Solution {
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null){
            return ;
        }

        // Find the middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }
        //Reverse the second half.
        ListNode second = slow.next;
        slow.next = null;


        ListNode prev = null;

        while(second != null) {

            ListNode temp = second.next;
            second.next = prev;

            prev = second;
            second = temp;
        }
        second = prev;
        ListNode first = head;

        while(second != null) {

            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;


            first = temp1;
            second = temp2;
        }
    }
}
