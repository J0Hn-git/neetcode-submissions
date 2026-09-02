class Solution{
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxFreq = 0, result=0;

        for(int right=0;right<s.length();right++) {
            char rchar = s.charAt(right);
            freq[rchar - 'A']++;
            maxFreq = Math.max(maxFreq, freq[rchar - 'A']);
        
            while((right - left +1) - maxFreq > k) {
                
                char lchar = s.charAt(left);
                freq[lchar - 'A']--;
                left++;
            }
            result = Math.max(result,right-left+1);

        } 
        return result;   



    }
}
