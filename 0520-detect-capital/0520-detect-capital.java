class Solution {
    public boolean detectCapitalUse(String word) {
        //Easy logic acc to question
        // remember isUpperCase() and charAt()
        int count=0;
        for(int i=0;i<word.length();i++){ 
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }

        return count==word.length() || count==0 || (count==1 && Character.isUpperCase(word.charAt(0)));
        
    }
}//Time complexity is O(n)