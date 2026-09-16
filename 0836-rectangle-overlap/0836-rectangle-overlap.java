class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        //Easy logic just check the over laps of the 2 arrays
    return rec1[0]<rec2[2] && rec2[0]<rec1[2] && rec1[1]<rec2[3] && rec2[1]<rec1[3];
        
    }
}//Time complexity is O(1)