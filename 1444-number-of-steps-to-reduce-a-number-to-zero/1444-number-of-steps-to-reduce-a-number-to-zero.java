class Solution {
    public int numberOfSteps(int num) {
        // easy logic approach of recursion is a bit harder comparatively 
        int count =0;
        while(num!=0){
            if(num%2==0){
                num /= 2;
                count++;
            }
            else{
                num-=1;
                count++;
            }
        }
        return count;
    }
}// Time complexity is O(logn)