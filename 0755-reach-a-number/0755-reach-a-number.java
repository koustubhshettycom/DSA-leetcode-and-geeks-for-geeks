class Solution {
    public int reachNumber(int target) {
      int count =0;
      int sum=0;
      // logic was hard to find u have deal it with pen and paper
      // u can return back after exceeding the number if the difference is even no.
      // as one turn makes a difference of 2 times of that turn     
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