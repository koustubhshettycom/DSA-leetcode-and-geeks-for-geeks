class Solution {
    public String reverseWords(String s) {
        // make a string builder as it has reverse function and us split function to seperate elements with gap 
        String[] str= s.split(" ");
        String[] ans = new String[str.length];
        int i=0;
     // traverse through each and every element and store it as array later return it as string with join function
        for( String st:str){
            StringBuilder sb = new StringBuilder();
            sb.append(st);
            sb= sb.reverse();
            ans[i]= sb.toString();
            i++;
        }
        return String.join(" ",ans);
        
    }
}// Time complexity is O(n)