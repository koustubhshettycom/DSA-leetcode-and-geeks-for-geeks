class Solution {
    public long sumAndMultiply(int n) {
        //easy logic go acc to question eliminate the number 0 
        //keep adding to sum and store the num return it
        int num = n;
        long sum=0;
        long curr=0;
        int exp =0;
        while(num>0){
            
            int ans = num%10;
            if(ans!=0){
            sum+= ans;
            
            curr+=ans*Math.pow(10,exp);
            exp++;
            }
            num/=10;
           

        }

        return curr*sum;
        
    }
}// Time complexity is O(logn)