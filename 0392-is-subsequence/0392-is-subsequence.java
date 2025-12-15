class Solution {
    public boolean isSubsequence(String s, String t) {
        // easy logic by using pointers 
        int len = t.length();
        int j = 0;
        int i = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
        
    }
}
// time complexity is O(N)