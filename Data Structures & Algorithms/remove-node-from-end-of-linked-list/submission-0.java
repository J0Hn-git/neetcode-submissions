class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode curr = head;

        while(curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }
        int removeIndex = nodes.size() - n;
        if(removeIndex == 0){
            return head.next;
        }
        nodes.get(removeIndex - 1).next = nodes.get(removeIndex).next;
        return head;

    }
}
