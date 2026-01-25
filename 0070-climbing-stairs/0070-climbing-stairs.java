import java.math.BigInteger;
//my logic was to use recursion tree but its not optimal but then used permutation with int 
// which was also wrong as max int overflows bigint was used instead of int its for higher numbers to be as lower ones 
class Solution {
    public int climbStairs(int n) {

        int count1 = n;
        int count2 = 0;

        BigInteger steps = BigInteger.ONE;

        while (count1 > 1) {
            count1 -= 2;
            count2 += 1;

            int total = count1 + count2;
            steps = steps.add(
                fact(total).divide(fact(count1).multiply(fact(count2)))
            );
        }

        return steps.intValue(); // can still fit in int for n <= 45
    }

    public BigInteger fact(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
// Time complexity O(N*n)

