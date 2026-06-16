class Solution {
    public String processStr(String s) {
        // Easy logic just keep doing what the question has asked u to do 
        // with if conditions

        StringBuilder str = new StringBuilder();

        char[] arr = s.toCharArray();

        for(char ch : arr){
            if(ch=='*'){
                if(str.length()>0){
                str.deleteCharAt(str.length()-1);
                }
            } 
            else if(ch=='#'){
                str.append(str);
            }
            else if(ch=='%'){
                str.reverse();
            }
            else{
                str.append(ch);
            }

            
        }
        return str.toString();

        // Time complexity is O(2^n)



        
    }
}