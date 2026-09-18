class Solution {
    public String reverseVowels(String s) {
        //easy logic use 2 pointer and when both start and end has vowel swap
        char[] arr = s.toCharArray();
        int start =0;
        int end = arr.length-1;
        while(start<end){
            while(start<end && !solve(arr[start])){
                start++;
            }
            while(start<end && !solve(arr[end])){
                end--;
            }
            char temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;

            start++;
            end--;

            
        }
        return new String(arr);
        
    }
    public boolean solve(char c){
        return c =='a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' || c == 'I' || c == 'O' || c == 'U' ;
        
    }
}
//Time complexity is O(n)