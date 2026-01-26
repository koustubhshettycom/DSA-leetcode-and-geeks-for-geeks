class Solution {
    public boolean rotateString(String s, String goal) {
        // Logic is to add s to s and the result must contain goal if not it doesnt exist 

        String str = s+s;
        return s.length()==goal.length() && str.contains(goal);
            
        
    }
}
// Time complexity is O(n*n)