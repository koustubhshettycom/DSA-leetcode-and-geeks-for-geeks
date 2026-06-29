class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for( String str: patterns){
            if(word.contains(str)){  // .contains() is the highlight
                count++;
            }
        }
        return count;
        
    }
}// Time complexity is o(n*n)