class Solution {
    public int maxDistinct(String s) {
        // easy logic distinct start means distinct elements present 
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();

        for( char ch : arr){
            set.add(ch);
        }
        return set.size();
        
    }
}//Time complexity is O(n)