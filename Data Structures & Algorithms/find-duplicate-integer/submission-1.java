class Solution {
    public int findDuplicate(int[] nums) {
        // detect intersection point.
        int slow = nums[0];
        int fast = nums[0];

        // move slow by one step and fast by two step.
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow != fast);

        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
