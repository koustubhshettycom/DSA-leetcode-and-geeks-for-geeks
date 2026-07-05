class Solution {
    public int maxDigitRange(int[] nums) {
        // easy logic keep trace of max diff of each digit of each number from nums
        // the ones with the max same diff add them and return
        int sum = 0;
        int maxsum = -1;

        for(int num: nums ){
            int k = num;
            int max =0;
            int min=9;
            while(num>0){
                int n = num%10;
                if(n>max){
                    max = n;
                }
                if(n<min){
                    min = n;
                }
                num =num/10;

            }
            int ans = max-min;
            if(ans>maxsum){
                maxsum = ans;
                sum = k;
            }
            else if(ans==maxsum){
                sum += k;
            }
        }

        return sum;
        
    }
}// Time complexity is O(n)