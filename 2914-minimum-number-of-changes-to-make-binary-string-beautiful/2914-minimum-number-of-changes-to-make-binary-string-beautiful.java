class Solution {
    public int minChanges(String s) {
        //Easy logic the q was the make any number of substring 
        //such tht it is beautiful so u loop w pair and count when the pair isnt same
        int n = s.length();
        int count =0;
        char[] arr = s.toCharArray();
        for(int i=0;i<n-1;i+=2){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        return count;
    }
}//Time complexity is O(n)