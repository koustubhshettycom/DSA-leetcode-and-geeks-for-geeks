class Solution {
    public boolean threeFibonacciSum(int n) {
        // easy logic keep 3 numbers and loop as fib series and find the sum
        int a =0;
        
        int b = 1;
        int c = 1;
        int sum =a+b+c;
        while(sum<n){
            a=b;
            b=c;
            c= a+b;
            sum = a+b+c;
            
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}//Time complexity is O(n)