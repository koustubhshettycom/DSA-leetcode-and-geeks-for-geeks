class Solution {
    public int countDigits(int num) {
        //easy logic read the question;
        
        int ans =0;
        int n=num;
        while(n>0){
            int d = n%10;
            
                if(d!=0 && num%d==0){
                ans++;
                }
            

            n = n/10;
        }
        
        return ans;


        
    }
}//Time complexity is O(log num)