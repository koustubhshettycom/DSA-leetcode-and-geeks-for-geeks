
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
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