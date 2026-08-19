class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();

        int result = right;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            int hours = 0;

            for(int pile : piles) {
                hours += (int) Math.ceil((double) pile / mid);
            }
            if(hours <= h) {
                result = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return result;
    }
}
