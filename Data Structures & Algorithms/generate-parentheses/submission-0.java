

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // Base case: when the length of current string equals 2 * n
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Try to add an opening parenthesis if possible
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // Try to add a closing parenthesis if valid
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}
