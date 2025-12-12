class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        // logic is to add one by one element into checker function
        // in that 3 conditions are there which has different paths in it 
        // in my inital code 3 code wasnt there idk why they are there but i need to look out the reason

        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            Checker(0, i,nums,target,arr,new ArrayList<>() );
        }

        return arr;


        
    }

    public void Checker(int sum, int no,int[] nums,int target,List<List<Integer>> arr,List<Integer> arr2 ){
        sum += nums[no];
        
        arr2.add(nums[no]);
        if(sum == target){
            arr.add(new ArrayList<>(arr2)); // this line u need to understand 
            arr2.remove(arr2.size() - 1); // this one idk 
            return;
        }
        else if(sum< target){
            int i = no;
            while(i<nums.length){
                Checker(sum,i,nums,target,arr,arr2);
                i++;
            }
            arr2.remove(arr2.size() - 1); // so in this line udk why its necessary 
        }
        else{
            arr2.remove(arr2.size() - 1);
            return;
        }
    }


}// Time complexity is O(n**t) where t is a other number 