class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // easy logic
        StringBuilder first = new StringBuilder();
        StringBuilder sec = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            first.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            sec.append(word2[i]);
        }
        return first.toString().equals(sec.toString());
    }
}// Time complexity is O(n)