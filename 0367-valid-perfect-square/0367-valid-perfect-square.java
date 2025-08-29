class Solution {
    public boolean isPerfectSquare(int num) {
     long start=0 ;
     long end =num;

     //using binary search as given constraints is in power of 2
     while(start<=end){
        long mid=start + (end-start)/2;
        long ans=mid*mid;
        if(ans==num){
            return true;
        }
        if(ans<num){
            start=mid+1;
        } 
        if(ans>num){
            end=mid-1;
        } 
     }  
     
    return false;
    }
    
}// Time complexity is O(logn)