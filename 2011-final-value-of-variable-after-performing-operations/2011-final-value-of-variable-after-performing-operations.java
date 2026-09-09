class Solution {
    public int finalValueAfterOperations(String[] operations) {
        // Easy logic use a loop and calculate to add or sub
        int ans =0;

        for(String str: operations){
            if(str.equals("--X")||str.equals("X--")){
                ans--;
            }
            else{
                ans++;
            }
        }
        return ans;
        
    }
}//Time complexity is O(n)