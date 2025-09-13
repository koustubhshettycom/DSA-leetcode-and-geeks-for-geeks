class Solution {
    public String sortSentence(String s) {
        // this question important as it has new string commands 
        // s.split seperates the string with the value it needs to be seperated by 
       String[] words = s.split(" ");
    //    making a new array for storing the answer
       String[] ans = new String[words.length];
       // taking the index of each and every element of the converted array of string 
       for(String word: words){
        int ind = word.charAt(word.length()-1)-'0';
        // assigning the values to the index of the array after removing the number using substring
        ans[ind-1]= word.substring(0,word.length()-1);
       }
    //    returning the string after joining with join function 
       return String.join(" ",ans);
    }
}