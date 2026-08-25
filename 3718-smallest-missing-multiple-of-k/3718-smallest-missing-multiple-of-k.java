class Solution {
    public int missingMultiple(int[] nums, int k) {
        //easy logic add everything to set and see if multiples of k missing in set
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }

        for(int i=1;;i++){
            if(!set.contains(i*k)){
                return i*k;
            }
        }
    }
}//time complexity is O(n)