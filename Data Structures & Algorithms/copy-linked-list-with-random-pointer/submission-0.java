
class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null) {
            return null;
        }
        ArrayList<Node> original = new ArrayList<>();
        ArrayList<Node> copy = new ArrayList<>();

        Node curr = head;

        // Store original nodes and create copies.

        while(curr != null) {

            original.add(curr);
            copy.add(new Node(curr.val));

            curr = curr.next;
        }
        // Connect next Pointers.
        for(int i = 0; i < copy.size() - 1; i++) {

            copy.get(i).next = copy.get(i + 1);
        }
        // Connect random pointers.
        for(int i = 0; i < original.size(); i++) {

            Node randomNode = original.get(i).random;

            if(randomNode == null) {
                copy.get(i).random = null;
                continue;
            }
            // Find the randomNode's index in original
            for(int j = 0; j < original.size(); j++) {

                if(original.get(j) == randomNode) {
                    copy.get(i).random = copy.get(j);
                    break;
                }
            }
        }
        return copy.get(0);
    }
}
