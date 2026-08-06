class Solution {
    public int smallestNumber(int n, int t) {
        // easy logic read the question works because of contraints

        int product =1;
        int num ;
        for(int i=n;i<=100;i++){
            num =i;
            product =1;
            while(num>0){
                product*= num%10;
                num/=10;
            }
            if(product%t==0){
                return i;
            }
        }
        return 0;
    }
}//Time complexity is O(n)