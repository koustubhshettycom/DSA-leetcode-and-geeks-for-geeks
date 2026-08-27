class Solution {
    public boolean isAnagram(String s, String t) {
        // easy logic check if the lengths are same if not return false
        // if element occurs in s add its freq if it is for t minus freq
        // the end freq for all should be 0
        int n = s.length();
        if(s.length()!= t.length()){
            return false;
        }
        int[] ans = new int[26];

        for(int i=0;i<n;i++){
            ans[s.charAt(i)-'a']++;
            ans[t.charAt(i)-'a']--;
        }

        for(int i: ans){
            if(i!=0){
                return false;
            }
        }
        return true;
        
        
    }
}// Time complexity is O(n)