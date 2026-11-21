class Solution {
    public int[] rearrangeArray(int[] nums) {
    //Easy logic all the even idx are plus and odd are minus thus iterate accordingly
       int plus=0;
       int minus =1;

       int[] arr = new int[nums.length]; 
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            arr[plus]=nums[i];
            plus+=2;
        }
        else{
            arr[minus]=nums[i];
            minus+=2;
        }

       }
       return arr;
    }
}//Time complexity is O(n)