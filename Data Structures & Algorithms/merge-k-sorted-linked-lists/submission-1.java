class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Min heap based on listnode value.
        PriorityQueue<ListNode> heap = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        // add the head of the list to the heap.
        for(ListNode lst : lists){
            if(lst != null){
                heap.add(lst);
            }
        }
        // Dummy node to rebuild the result list.
        ListNode dummy = new ListNode(0);
        ListNode current  = dummy;

        // merge nodes.
        while(!heap.isEmpty()){
            ListNode minNode = heap.poll();
            current.next = minNode;
            current = current.next;

            if(minNode.next != null){
                heap.offer(minNode.next);
            }
        }
        return dummy.next;


    }
}
