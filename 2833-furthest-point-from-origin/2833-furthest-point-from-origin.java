class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        //calculate the left right and _ return the diff + count 
        int left =0;
        int right =0;
        int count =0;
        char[] arr = moves.toCharArray();

        for(char c: arr){
            if(c=='L'){
                left++;
            }
            if(c=='R'){
                right++;
            }
            if(c=='_'){
                count++;
            }
        }
        return Math.abs(left-right)+count;
    }
}//Time complexity is O(n)