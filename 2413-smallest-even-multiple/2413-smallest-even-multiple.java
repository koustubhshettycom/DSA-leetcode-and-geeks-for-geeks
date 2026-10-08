class Solution {
    public int smallestEvenMultiple(int n) {
        //Easy logic read the question 
        if(n%2==0){
            return n;
        }
        return 2*n;
        
    }
}//Time complexity is O(1)