class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = 
        new PriorityQueue<>(
            (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            pq.add(entry);
        }
        int i = 0;

        int[] result = new int[k];
        while(i < k){
            result[i++] = pq.poll().getKey();
        }
        return result;
    }
}
