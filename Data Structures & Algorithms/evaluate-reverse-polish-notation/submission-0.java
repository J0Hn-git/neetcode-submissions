class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){

            switch(token) {

                case "+" : {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                    break;
                }

                case "-" : {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                    break;
                }
                
                case "*" :
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/" :
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                    break;
                
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
