class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        int[] result = new int[length - k + 1];

        for(int i=0;i<=length-k;i++) {
            int maxi = nums[i];
            for(int j=i;j<i+k;j++) {
                maxi = Math.max(maxi, nums[j]);
            }
            result[i] = maxi;
        }
        return result;
    }
}
