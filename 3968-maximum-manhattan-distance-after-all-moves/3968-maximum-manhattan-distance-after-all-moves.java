class Solution {
    public int maxDistance(String moves) {
        // easy logic track x and y axis ans add the spaces in the end 
        char[] arr = moves.toCharArray();
        int space =0;
        int x=0;
        int y=0;

        for(char ch: arr ){
            if(ch=='U'){
                y++;
            }
            else if(ch=='D'){
                y--;
            }
            else if(ch=='L'){
                x--;
            }
            else if(ch=='R'){
                x++;
            }
            else{
                space++;
            } 
        }
        return Math.abs(x)+Math.abs(y)+space;

        
    }
}//Time complexity is O(n)