class Solution {
    public int hammingWeight(int n) {
        //The logic of finding no. of setbit is [{n = n&(n-1)}in a while loop]
        int ans =0;
        while(n>0){
            n = n&(n-1);
            ans++;
        }
        return ans;
        
    }
}//Time complexity is O(n)