class Solution {
    public int longestConsecutive(int[] nums) {
    //Easy logic use set to store ele for each ele check if nxt one exists
    // use a if condition checking if prev num exists so u run all only once
        int max =0;
        HashSet<Integer> set = new HashSet<>();

        for(int n:nums){
            set.add(n);

        }
        for(int n:set){
            int curr =0;
            
            if (!set.contains(n-1)){
            while(set.contains(n)){
                n++;
                curr++;
            }
            }
           max = Math.max(curr,max);
        }
        return max;
    }
}//Time complexity is O(n)