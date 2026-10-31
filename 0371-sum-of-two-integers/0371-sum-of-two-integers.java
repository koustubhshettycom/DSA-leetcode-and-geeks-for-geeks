class Solution {
    public int getSum(int a, int b) {
        // to add 2 num follow the steps
        int c;
        while(b!=0){
            c = (a&b);
            a = a^b;
            b = (c)<<1;
        }
        return a;
    }
}//Time complexity is O(n)