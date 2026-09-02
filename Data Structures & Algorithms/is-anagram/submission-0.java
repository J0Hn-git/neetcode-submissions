class Solution {
    public boolean isAnagram(String s, String t) {
        // if the length are different, they can't be anagrams.
        if(s.length() != t.length()) {
            return false;
        }

        // create an array to count character frequencies.
        int[] charCounts = new int[26];

        // inc count for each char in 's' and dec for each in 't'.
        for(int i=0;i<s.length();i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }
        // check if all counts are zero
        for(int count : charCounts) {
            if(count != 0) {
                return false;
            }
        }
        return true;

    }
}
