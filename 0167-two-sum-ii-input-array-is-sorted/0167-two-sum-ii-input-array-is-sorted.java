class Solution {
    public int[] twoSum(int[] arr, int target) {
        int large= arr.length-1;
        int small=0;
        //finding the index from back and front as it is easier idk abt binary search approach for this question so used two pointer method 
        while(small<large){
            if(arr[large]+arr[small]>target){
                large--;
            }
            if(arr[large]+arr[small]<target){
                small++;
            }
            if(arr[large]+arr[small]==target){
                return new int[] {small + 1, large + 1};
            }

        }
        
        return new int[] {-1,-1};
    }
} //Time complexity is o(n) 