class Solution {
    public boolean checkString(String s) {
        //Easy logic just keep iterating through the chars and check b's and a's
        boolean ans = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' && !ans){
                return false;
            }
            if(ans && s.charAt(i)=='a'){
                
             
                continue;
            }
            if(s.charAt(i)=='b' && ans){
                ans = false;
            }
            

        }
        return true;
    }
}//Time complexity is O(n)