class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        //using arraylist as add property is convinient by logic
        ArrayList<Integer> ll= new ArrayList<>(nums.length);
        for(int i=0 ;i<nums.length;i++){
            ll.add(index[i],nums[i]); // adding to Arraylist;
        }
        //adding arraylist into array
        int num=0;
        for(int i=0 ;i<nums.length;i++){
           target[i] = ll.get(i);
            
        }
        return target;
    }
}
// Time complexity is O(n) 8/10
