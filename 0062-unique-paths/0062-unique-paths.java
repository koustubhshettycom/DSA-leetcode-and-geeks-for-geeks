import java.math.BigInteger;
class Solution {
    public int uniquePaths(int m, int n) {
        // Easy maths
        BigInteger num = factorial(m+n-2);
        BigInteger div = (factorial(m-1).multiply(factorial(n-1)));
        return(num.divide(div).intValue());
        
    }
    public BigInteger factorial(int n){
        BigInteger ans =BigInteger.ONE;
        for(int i=1;i<=n;i++){
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}// Time complexity is O(n)