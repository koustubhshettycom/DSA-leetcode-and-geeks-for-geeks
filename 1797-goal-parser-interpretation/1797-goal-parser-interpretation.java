class Solution {
    public String interpret(String command) {
        int size = command.length();
        StringBuilder sb = new StringBuilder();
        //logic is easily identifiable but u have to apply it properly
        for(int i=0;i<size;i++){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append("o");
                i++;
            }
            else if(i+1<size && command.charAt(i)=='(' && command.charAt(i+1)!=')'){
                sb.append("al");
                i+=3;
            }
            else if(command.charAt(i)==')'){
                i++;
            }
            else{
                sb.append(command.charAt(i));
            }
        }
        return sb.toString();
    }// Time complexity is O(n) i think its good enough
}