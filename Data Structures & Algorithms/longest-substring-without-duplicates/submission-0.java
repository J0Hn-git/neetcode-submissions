class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // ascii size array.
        int[] chars = new int[128];
        int left = 0, right = 0, maxLen = 0;

        while(right < s.length()) {
            char rchar = s.charAt(right);
            chars[rchar]++;

            while(chars[rchar] > 1)  {
                char lchar = s.charAt(left);
                chars[lchar]--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left +1);
            right++;
        }
        return maxLen;
        
    }
}
