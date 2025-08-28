class Solution {
    public int mySqrt(int x) {
      int ans=-1;
       int str=0;
       int end=x;
       if(x==0||x==1){
        return x;
       }
       while(str<=end){
        int mid = str +(end-str)/2;
        long sq = (long )mid*mid;
        if(sq==x){
            return mid;
        }
        else if(sq<x){
            ans=mid;
            str=mid+1;
        }
         else if(sq>x){
            
            end=mid-1;
        }
       }
       return ans;
    }
} // Time complexity is pretty good (logn) 9/10