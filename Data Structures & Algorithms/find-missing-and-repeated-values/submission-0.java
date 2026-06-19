class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        Map<Integer, Integer> map = new HashMap<>();

        int n = grid.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int current = grid[i][j];

                map.put(current, map.getOrDefault(current, 0) + 1);
            }
        }
        int repeated = -1;
        int missing = -1;

        for(int num = 1; num <= n * n; num++){

            int freq = map.getOrDefault(num, 0);

            if(freq == 2){
                repeated = num;
            }
            if(freq == 0){
                missing = num;
            }
        }
        return new int[]{repeated, missing};
    }
}