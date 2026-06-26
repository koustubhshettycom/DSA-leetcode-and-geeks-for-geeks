class Solution {
    public int findClosest(int x, int y, int z) {
        // easy logic 
        int xdis = Math.abs(x-z);
        int ydis = Math.abs(y-z);

        if(xdis>ydis){
            return 2;
        }
        if(ydis>xdis){
            return 1;
        }
        return 0;
    }
}// Time complexity O(1)