class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        for(int i = 0; i < nums1.length; i++){

            int current = nums1[i];

            int j = 0;

            while(nums2[j] != nums1[i]){
                j++;
            }
            int greater = -1;

            for(int k = j; k < nums2.length; k++){
                if(nums2[k] > current){
                    greater = nums2[k];
                    break;
                }
            }
            nums1[i] = greater;
        }
        return nums1;
    }
}