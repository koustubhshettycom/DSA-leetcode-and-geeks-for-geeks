class Solution {
    public int arrangeCoins(int n) {
      int start=1;
      int end =n;
      int ans=0;
      // binary is good becuase of constraint and is optimal
      while(start<=end){
        int mid=start+(end-start)/2;
        long val =(long) mid*(mid+1)/2;
        if(val==n){
            return mid;
        }
        if(val<n){
            ans=mid;
            start =mid+1;
        }
        if(val>n){
            end=mid-1;
        }
      }
      return ans;
    }
}  // Time complexity is logn