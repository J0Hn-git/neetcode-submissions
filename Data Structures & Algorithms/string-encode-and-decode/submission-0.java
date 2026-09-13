class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for(String str : strs) {

            int strLen = str.length();
            sb.append(strLen).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;
        while(i < str.length()){

            int k = i;
            while(str.charAt(i) != '#'){
                i++;
            }
            String len = str.substring(k, i);
            int strLen = Integer.parseInt(len);

            i++;

            String word = str.substring(i, i + strLen);
            result.add(word);

            i += strLen;
        }
        return result;
    }
}
