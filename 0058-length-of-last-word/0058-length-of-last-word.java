class Solution {
    public int lengthOfLastWord(String s) {
     String[] str = s.split(" ");
     String word = str[str.length-1];
     return word.length();   
    }
}// Time complexity is O(n) and str.trim() cuts off the spaces from front and end