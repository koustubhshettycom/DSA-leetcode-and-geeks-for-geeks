class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        //easy logic read the question 
        int n =x;
        int sum=0;
        while(x>0){
            sum+= x%10;
            x = x/10;
        }
        if(n%sum==0){
            return sum;
        }
        return -1;
    }
}//Time complexity is O(logn)