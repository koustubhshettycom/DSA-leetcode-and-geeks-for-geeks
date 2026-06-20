class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        // Easy logic add seperate the digit and stoe them in any structure 
        // traverse and check them 
        int count =0;
        Stack<Integer> stc = new Stack<>();

        for(int num : nums){
            int n= num;
            if(num==0 && digit ==0){
                count++;
                continue;
            }

            while(n>0){
                stc.add(n%10);
                n/=10;
            }
        }

        while(!stc.isEmpty()){
            if(stc.peek()==digit){
                count++;
            }
            stc.pop();
        }
        return count;

        
    }
}// Time complexity is O(n)