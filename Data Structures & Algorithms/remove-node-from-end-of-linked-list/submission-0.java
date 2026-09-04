
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ArrayList<ListNode> array = new ArrayList<>();

        ListNode curr = head;

        while(curr != null){

            array.add(curr);
            curr = curr.next;
        }
        int removeIndex = array.size() - n;

        if(removeIndex == 0){
            return head.next;
        }
        ListNode prev = array.get(removeIndex - 1);

        prev.next = prev.next.next;

        return head;

    }
}
