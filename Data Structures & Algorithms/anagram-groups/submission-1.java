class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {

            int[] charArray = new int[26];

            for(int i = 0; i < str.length(); i++) {

                charArray[str.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(charArray);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
