class Solution {
    public boolean isPalindrome(String s) { 
        int left = 0;
        int right = s.length()-1;

        while(left<right) {
            // skip alphanumeric characters.
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            //compare characters case insensitively.
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            else {
                left++;
                right--;
            }
        } 
        return true;      
    }
}
