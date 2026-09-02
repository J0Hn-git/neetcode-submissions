class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create a hashset to store elements from array.
        HashSet<Integer> seenNumbers = new HashSet<>();

        // Iterate through each element in array.
        for(int num : nums) {
            // Check if the element is already in the hashset.
            if(seenNumbers.contains(num)) {
                return true; // duplicate found.
            }
            // add the element to the hashset
            seenNumbers.add(num);
        } 
        return false;
    }
}
