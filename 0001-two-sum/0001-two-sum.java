class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] idk = new int[2];
        for(int i=0;i<nums.length;i++){
            int num = target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(num == nums[j]){
                    idk[0] = i;
                    idk[1] =j;
                    break;

                }
            }
            
        }
        return idk;
        
    }
}