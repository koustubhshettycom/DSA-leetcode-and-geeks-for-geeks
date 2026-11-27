class Solution {
    public boolean canAliceWin(int n) {
        //Easy logic go through the loop and iterate
        int chance =10;
        boolean ans =true;

        while(n>=chance){
            n-=chance;
            chance--;
            ans= !ans;
        }
        return !ans;
    }
}//Time complexity is O(n)