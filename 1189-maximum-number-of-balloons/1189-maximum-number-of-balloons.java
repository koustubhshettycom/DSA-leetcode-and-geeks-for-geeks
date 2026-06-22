class Solution {
    public int maxNumberOfBalloons(String text) {
        // Easy logic keep the record of the letters and then pick the min of them
        // tc of the l and o characters as they repeat twice
        
        int[] ans = new int[5];

        char[] arr = text.toCharArray();

        for(char ch : arr){
            if(ch=='b'){
                ans[0] +=1;
            }
            else if(ch=='a'){
                ans[1] +=1;
            }
            else if(ch=='l'){
                ans[2] +=1;
            }
            else if(ch=='o'){
                ans[3] +=1;
            }
            else if(ch=='n'){
                ans[4] +=1;
            }
           
        }
         ans[2]/=2;
           ans[3]/=2;

            int min=Integer.MAX_VALUE;
            for(int n: ans){
                min = Math.min(min,n);
            }

            return min;
        
    }
}// Time complexity O(n)