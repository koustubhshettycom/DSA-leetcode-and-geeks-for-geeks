class Solution {
    public boolean checkGoodInteger(int n) {
        // Easy logic read the question
        int squareSum=0;
        int digitSum=0;

        while(n>0){
            int num = n%10;
            digitSum+= num;
            squareSum+= num*num;
            n/=10;

        }
        if(squareSum - digitSum >= 50){
            return true;
        }
        return false;

        
    }
} // Time complexity is O(n)