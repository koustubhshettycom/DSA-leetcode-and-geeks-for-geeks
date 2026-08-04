class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        //easy logic store the numbers that are there in arr then use a loop 
        //to verify its existence and add to the list accordingly 
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int n: nums){
            set.add(n);
            max = Math.max(max,n);
            min = Math.min(min,n);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
        
    }
}//Time complexity is O(n)