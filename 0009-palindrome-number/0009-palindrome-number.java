class Solution {
    public boolean isPalindrome(int x) {
        // convert the number into string and then make it an array of characters 
        String str = String.valueOf(x);// this function is something to remember .valueOf()
        char[] arr = str.toCharArray(); // this one to .toCharArray
        // use two pointer method to compare 
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            if(arr[start]!=arr[end]){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;

    }
}// Time complexity is O(logn) im not sure as i thought it was O(n)