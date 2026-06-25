class Solution {
    public int mirrorDistance(int n) {
        // Easy logic u can just store the reverseed number and find the difference
        int num = n;
        
        int reverse =0;

        while(n>0){ 
            reverse = reverse * 10 + (n%10);
            n/=10;
        }
      

        return Math.abs(reverse-num);
        
    }
}// Timw complexity is O(n)