class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        
        for(String str : strs){
            int strlength = str.length();
            sb.append(strlength).append('#').append(str);

        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while(i < str.length()){

            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));

            j++;

            String word = str.substring(j, j + length);
            result.add(word);

            i = j + length;
        }
        return result;
    }
}
