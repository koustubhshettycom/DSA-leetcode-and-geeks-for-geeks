class Solution {
    ArrayList<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        // Tough logic of recursion 
        //Add and later remove after the function is deployed thats the very basic of the logic 

        ArrayList<Integer> ll = new ArrayList<>();

        // Convert array to list for easy removal/insertion
        for(int num: nums){
            ll.add(num);
        }
        // Temp list to build each permutation
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        // recursion    
        permutations(ll,arr);

        return list;
    }
    public void permutations(ArrayList<Integer> ll , ArrayList<Integer> arr){
        
        if(ll.isEmpty()){
            // When no more numbers left to choose, record the permutation
           list.add(new ArrayList<>(arr));
           return;
        }

        for(int j=0;j<ll.size();j++){
            // Add
            int number = ll.remove(j);
            arr.add(number);
            // Next Step
            permutations(ll,arr);

            //BackTrack
            arr.remove(arr.size() - 1);
            ll.add(j,number);
        }
        
    }
  
}
// Time complexity is O(n * n!)