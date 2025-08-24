class Solution {
    public int removeElement(int[] nums, int val) {
        int num = 0;
     
      // Traversing each element if matches the value its excluded also having count 
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[num]=nums[i];
            num++;
        }
       
        
       }
       return num;
    }
}
// great time complexity O(n) 9.5/10