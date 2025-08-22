class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] arr = sentence.toCharArray();
        boolean[] arr2 = new boolean[26];
        for(char ch : arr){
           arr2[ch - 'a'] = true;
        }
        for(boolean boo:arr2){
            if(!boo){
                 return false;
            }
           
        }
        return true;
    }
}