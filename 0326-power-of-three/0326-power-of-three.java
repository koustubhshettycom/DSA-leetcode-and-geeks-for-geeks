class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        int num= n;
        while(num%3==0){
            num = num/3;
        }
        return num==1;
    }
}