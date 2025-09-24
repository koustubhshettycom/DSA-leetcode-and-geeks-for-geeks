class Solution {
    public void reverseString(char[] s) {
        // Easy logic u can use while loop also but used recursion
        int start=0;
        int end = s.length-1;
        reverse(start, end, s);
        
    }
    static void reverse(int start, int end, char[] s){
        if(start>=end){
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverse(start+1,end-1,s);

    }
}// Time complexity is O(n)