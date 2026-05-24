class Solution {
    public boolean isUgly(int n) {
        int num = n;
        // Easy logic read the code u will know the logic 
        if(n<=0){
            return false;
        }
        while(num%2==0){
            num = num/2;
        }
        while(num%3==0){
            num = num/3;
        }
        while(num%5==0){
            num = num/5;
        }
        if(num==1){
            return true;
        }
        return false;
        
        
    }
}// Time complexity is O(logn)