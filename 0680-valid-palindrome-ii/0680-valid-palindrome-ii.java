class Solution {
    public boolean validPalindrome(String s) {
        // logic is to use two pointer for palindrome questions 
        // ignore the first one and return from the next
        int left=0;
        int right=s.length()-1;
        boolean ans1 = true;
        boolean ans2 = true;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                 return palindrome( s, left+1,right) || palindrome( s, left,right-1);
                 

            }
            


        }
        return true;
        
        
    }
    boolean palindrome( String s, int left, int right){
        while(left<right){
             if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }

        }
        return true;
    }
}// Time complexity is O(n)