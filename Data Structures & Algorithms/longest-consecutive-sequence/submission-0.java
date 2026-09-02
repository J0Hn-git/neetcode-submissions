class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        // create a hashset to store the numbers.
        HashSet<Integer> numSet = new HashSet<>();

        for(int num : nums) {
            numSet.add(num);
        }
        int longestSequence = 1;

        for(int num : numSet) {
            if(numSet.contains(num-1)) {
                continue;
            }
            else {
                int currNum = num;
                int currSub = 1;
                while(numSet.contains(currNum+1)){
                    currNum ++;
                    currSub ++;
                }
                longestSequence = Math.max(longestSequence, currSub);
            }


        }
        return longestSequence;

    }
}
