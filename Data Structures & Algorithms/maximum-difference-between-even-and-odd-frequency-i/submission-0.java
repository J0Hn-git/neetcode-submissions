class Solution {
    public int maxDifference(String s) {
        
        int min_even = Integer.MAX_VALUE;
        int max_odd = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int count: map.values()){

            if(count % 2 == 0){
                min_even = Math.min(min_even, count);
            }
            else{
                max_odd = Math.max(max_odd, count);
            }
        }
        return (max_odd - min_even);
    }
}