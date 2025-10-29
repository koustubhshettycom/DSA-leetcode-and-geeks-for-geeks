class Solution {
    // easy code but done without bit manipulation bettter way exists
    public boolean isPowerOfTwo(int n) {
      if (n <= 0) return false;
      

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }
}// Time complexity is O(logn)