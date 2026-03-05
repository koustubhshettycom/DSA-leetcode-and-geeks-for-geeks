class Solution {
    public int[] asteroidCollision(int[] arr) {
        //  easy logic check the signs and make changes in the stack and also see the sign cases
        //convert it into array then reutrn
        Stack<Integer> stc = new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            if(stc.isEmpty()){
                stc.push(arr[i]);
                continue;
            }
            boolean skip = false;
            while(!stc.isEmpty() && (arr[i]<0 && stc.peek()>0)){
                if(stc.peek()< -arr[i]){
                    stc.pop();
                }
                else if(stc.peek()== -arr[i]){
                    stc.pop();
                    skip = true;
                    break;
                }
                else{
                    skip = true;
                    break;

                }
                
            }
            if(!skip){
                stc.push(arr[i]);
                skip = true;
            }
            
            

        }
        int[] ans = new int[stc.size()];
        for(int i=stc.size()-1;i>=0;i--){
            ans[i]= stc.pop();
            
        }
        return ans;
        
    }
}
// Time complexity is O(n)