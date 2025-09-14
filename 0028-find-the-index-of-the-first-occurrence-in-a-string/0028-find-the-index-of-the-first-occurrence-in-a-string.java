class Solution {
    public int strStr(String haystack, String needle) {
        // basic use of sliding window using substirng method
        int start =0;
        int end = needle.length(); // important point in substring(start,end) end is not considered sun is till end-1
        while(end<=haystack.length()){
            String sub = haystack.substring(start,end);
            if(sub.equals(needle)){
                return start;
            }
            else{
                start++;
                end++;
            }
        }
        return -1;
    }
}// Time complexity is O(n)