class Solution {
    public int maxDigitRange(int[] nums) {
        // easy logic keep keep trace of max and min numbers from the set of number
        // select the ones w largest and the smallest numbers 
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