class Solution {
    public int reverse(int x) {
        // easy logic use normal reversing of a number for the question
        // Take care of the over flow of int and type casting 
        long ans =0;
        while(x!=0){
            int n = x%10;
            ans= ans*10 + n;
            x = x/10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            return 0;
        }
        return (int)ans;
    }
}//Time complexity is O(n)