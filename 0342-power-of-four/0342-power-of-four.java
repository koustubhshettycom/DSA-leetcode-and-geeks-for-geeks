class Solution {
    public boolean isPowerOfFour(int n) {
        
        // simple code and easy 
        
            if(n<=0){
                return false;
            }
            int num= n;
            while(num%4==0){
                num = num/4;
            }
            return num==1;
        
    // Time complexity is O(logn)
    }
}