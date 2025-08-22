class Solution {
    public int removeDuplicates(int[] nums) {
        int no =nums[0];
        List<Integer> ll =new ArrayList<>();
        ll.add(no);
        for(int i=1;i<nums.length;i++){
            if(no!=nums[i]){
                ll.add(nums[i]);
                no =nums[i];
            }
        }
        for(int i=0,j=0;i<nums.length&&j<ll.size();i++,j++){
            nums[i]=ll.get(j);
            

        }
        return ll.size();

        
    }
}