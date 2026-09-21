class Solution {
    public boolean canWinNim(int n) {
        // n as 4 multiples can never win logically
        if(n%4==0){
            return false;
        }
        return true;
    }
}//Time complexity is O(1)