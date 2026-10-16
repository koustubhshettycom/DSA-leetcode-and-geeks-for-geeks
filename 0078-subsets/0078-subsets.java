class Solution {
    List<List<Integer>> ll = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        //Easy logic of backtracking either add or not add 
        //after adding remove the last step
        List<Integer> l = new ArrayList<>();
        solve(0,nums,l);
        return ll;
        
    }
    public void solve(int idx, int[] arr,List<Integer> l){
        if(idx==arr.length){
           ll.add(new ArrayList<>(l));
           return;
        }
        List<Integer> list = new ArrayList<>(l);
        solve(idx+1,arr,l);

        
        l.add(arr[idx]);
        solve(idx+1,arr,l);
        l.remove(l.size()-1);
        return;

    }
}//Time complexity is O(2^n)