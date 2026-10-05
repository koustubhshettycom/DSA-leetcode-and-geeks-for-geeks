class Solution {
    public int minRotations(String s) {
        //easy logic either u go directly or rotate and go choose the min
        int count =0;
        int left = 0;
        for(int i=0;i<s.length();i++){
            int right = s.charAt(i)-'0';
            

            int diff = Math.abs(left-right);
            
            count+= Math.min(diff,10-diff);
            left = right;
        }
        return count;
    }
}//Time complexity is O(n)