class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        // easy logic as u have to pop based on top most element u use stack
        // if it matches pop and push double of it else add it
        Stack<Long> stc = new Stack<>();
        List<Long> ans = new ArrayList<>();
        int n = nums.length;

        
        int idx =1;
        stc.push((long)nums[0]);
        while(idx<n){
            if(stc.peek()!=nums[idx]){
                stc.push((long)nums[idx]);
                
            }
            else{
               long add = stc.pop()*2;
               while(!stc.isEmpty() && stc.peek()==add){
                stc.pop();
                add*=2;
               }
                
                stc.push(add);
            }
            idx++;
        }
        for(long num: stc){
            ans.add(num);
        }
        return ans;

    }
}//Time complexity is O(n)