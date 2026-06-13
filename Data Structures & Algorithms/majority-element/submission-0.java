class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0;
        int answer = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            if(entry.getValue() > maxFreq){

                maxFreq = entry.getValue();
                answer = entry.getKey();
            }
        }
        return answer;
    }
}