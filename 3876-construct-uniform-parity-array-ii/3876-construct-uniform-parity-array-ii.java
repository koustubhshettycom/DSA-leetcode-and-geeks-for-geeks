class Solution {
    public boolean uniformArray(int[] nums1) {
    //Med Logic u need to find the min of the array and check if its odd or even
    //if its odd u can make any num odd so its always true
    //if its even it can only work if every number is even else u cant 
    //bcoz to convert a odd num to even u need another smaller odd
    //for the smallest odd there wont be another odd to convert it thus false
        int min = Integer.MAX_VALUE;
        for(int n:nums1){
            min = Math.min(n,min);
        }
        if(min%2!=0){
            return true;
        }
        else{
            for(int n:nums1){
                if(n%2!=0){
                    return false;
                }
            }
        }
        return true;
    }
}//Time complexity is O(n)