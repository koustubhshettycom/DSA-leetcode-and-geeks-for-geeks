class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] arr = sentence.toCharArray();
        // adding if its true or not 
        boolean[] arr2 = new boolean[26];
        for(char ch : arr){
           arr2[ch - 'a'] = true;
        }
        // checking each and every element
        for(boolean boo:arr2){
            if(!boo){
                 return false;
            }
           
        }
        return true;
    }
}
// Time complexity is great and is of O(n) 8/10
