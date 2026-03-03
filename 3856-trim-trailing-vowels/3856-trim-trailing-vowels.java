class Solution {
    public String trimTrailingVowels(String s) {
        // easy logic use stack as u need to remove the last elements present in vowels 
        // then use stringbuilder to convert it to string and return
        String str = "aeiou";
        Stack<Character> stc = new Stack<>();
        char[] arr = s.toCharArray();
        for(char ch: arr){
            stc.push(ch);
        }
        while(!stc.isEmpty() && str.indexOf(stc.peek())!=-1){
            stc.pop();

        }
        int n = stc.size();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}//Time complexity is O(n)