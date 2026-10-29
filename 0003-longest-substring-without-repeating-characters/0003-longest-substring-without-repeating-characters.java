class Solution {
    public int lengthOfLongestSubstring(String s) {
    //Easy logic dynamic sliding window incrs till u get a same val then choose max
        int n = s.length();
        int max = 0;
        Set<Character> set = new HashSet<>();
        int left =0;
        for(int rt=0;rt<n;rt++){
            if(!set.contains(s.charAt(rt))){
                set.add(s.charAt(rt));
                max = Math.max(max,rt-left+1);
            }
            else{
                while(set.contains(s.charAt(rt))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(rt));
            }
        }
        return max;

    }
}//Time complexity is O(n)