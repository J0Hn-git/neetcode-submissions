public class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        int[] tFreq = new int[128];
        for (char c : t.toCharArray()) tFreq[c]++;

        int left = 0, right = 0, minLen = Integer.MAX_VALUE;
        int start = 0, count = 0;
        int[] window = new int[128];

        while (right < s.length()) {
            char c = s.charAt(right);
            window[c]++;
            if (tFreq[c] > 0 && window[c] <= tFreq[c]) {
                count++;
            }

            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lChar = s.charAt(left);
                window[lChar]--;
                if (tFreq[lChar] > 0 && window[lChar] < tFreq[lChar]) {
                    count--;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
