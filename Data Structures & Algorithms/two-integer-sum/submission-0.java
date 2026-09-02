class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a hashmap to store values and integers.
        Map<Integer,Integer> map = new HashMap<>();

        //iterate through the array.
        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[] {map.get(complement),i};

            }
            map.put(nums[i],i);
        }
        return new int[] {};

      

    }
}
