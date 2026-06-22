class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] charCount = new int[26];

            for(char ch : s.toCharArray()){
                charCount[ch - 'a']++;
            }
            String key = Arrays.toString(charCount);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
