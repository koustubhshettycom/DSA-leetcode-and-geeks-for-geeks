class Solution {
    public int firstMatchingIndex(String s) {
        //Easy logic use 2 pointer type of sol
        int n = s.length();
        for(int i=0;i<=n/2;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                return i;
            }
        }
        return -1;
    }
}//Time complexity is O(N)