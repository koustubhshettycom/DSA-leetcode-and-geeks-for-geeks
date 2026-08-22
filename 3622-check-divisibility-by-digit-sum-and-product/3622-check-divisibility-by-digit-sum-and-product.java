class Solution {
    public boolean checkDivisibility(int n) {
// easy logic keep track of sum and prod then return if thier sum divides or not
        int ans=n;
        int sum =0;
        int prod =1;

        while(n>0){
            int num = n%10;
            sum+=num;
            prod*=num;
            n = n/10;
        }
        int div = sum + prod;

        if(ans%div==0){
            return true;
        }
        return false;
    }
}//Time complexity is O(n)