class Solution {
    public int scoreOfString(String s) {
        //Easy logic loop over the char of s and add it to the sum 
        int sum =0;
        for(int i=1;i<s.length();i++){
            sum += Math.abs(s.charAt(i)-s.charAt(i-1));
        }
        return sum;
    }
}//Time complexity is O(n)