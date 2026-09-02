class Solution {
    public boolean isValid(String s) {
        
        // create a hashmap to store the characters.
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}','{');
        map.put(']','[');

        // create a stack to push the char in s.
        Stack<Character> stackt = new Stack<>();

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            if(!map.containsKey(c)) {
                stackt.push(c);
            }
            else {
                if(stackt.empty()) {
                    return false;
                }
                char topElement = stackt.pop();
                if(topElement != map.get(c)) {
                    return false;
                }
            }
        }
        return stackt.isEmpty();
    }
}
