class Solution {
    public String mergeAlternately(String word1, String word2) {
        // logic is to add one from word1 and next from word2
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length() || j<word2.length() ){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length()){
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
}// time complexity is O(n)