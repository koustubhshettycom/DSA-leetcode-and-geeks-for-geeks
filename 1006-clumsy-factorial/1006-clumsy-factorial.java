class Solution {
    public int clumsy(int n) {
        // easy logic find the patterns
        // these r the inital special elemnts
        if (n == 1) return 1; //gives 1
        if (n == 2) return 2; //gives 2
        if (n == 3) return 6; //gives 6 3*2/1
        if (n == 4) return 7; //gives 7 4*3/2+1

        // as the rotation is of 4 elements
        if (n % 4 == 0) return n + 1;
        if (n % 4 == 1) return n + 2;
        if (n % 4 == 2) return n + 2;
        return n - 1;// for n%3

    }
}// Time complexity O(1)