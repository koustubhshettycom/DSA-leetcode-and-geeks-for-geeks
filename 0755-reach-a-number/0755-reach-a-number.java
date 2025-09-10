class Solution {
    public int reachNumber(int target) {
      int count =0;
      int sum=0;
      
      if(target>0){
        while(sum<target || (sum-target)%2!=0){
        count++;
        sum+=count;
      } 
      }
      else{
        while(sum>target || (sum-target)%2!=0){
        count--;
        sum+=count;
      } 
      return -count;
      }
      
      return count;
    }
}
// Time complexity is O(n^0.5)