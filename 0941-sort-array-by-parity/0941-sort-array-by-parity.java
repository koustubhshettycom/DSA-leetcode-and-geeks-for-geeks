class Solution {
    public int[] sortArrayByParity(int[] nums) {
     // logic is to go one by one check even/odd then place front or back
     int front=0;
     int back = nums.length-1;
     int[] arr = new int[back+1];
     for(int i=0; i<arr.length;i++){
        if(nums[i]%2==0){
            arr[front]= nums[i];
            front++;
        }
        else{
            arr[back]=nums[i];
            back--;
        }
     }
     return arr;
    }
}// Time complexity is O(n)