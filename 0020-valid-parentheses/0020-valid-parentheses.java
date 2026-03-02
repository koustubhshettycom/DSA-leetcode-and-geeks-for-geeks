class Solution {
    public boolean isValid(String s) {
        // easy logic use stack pop when the bracket closes else just keep adding 
        Stack<Character> stc = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '('|| c== '[' || c=='{'){
                stc.push(c);
            }
            else{
                if(c==')'){
                    if(stc.isEmpty()|| stc.peek()!='('){
                        return false;
                    }
                    stc.pop();
                }
                if(c=='}'){
                    if(stc.isEmpty()|| stc.peek()!='{'){
                        return false;
                    }
                     stc.pop();

                }
                if(c==']'){
                    if(stc.isEmpty()|| stc.peek()!='['){
                        return false;
                    }
                     stc.pop();
                }
            }

        }
        return stc.isEmpty();
        
    }
}
// Time complexity is O(n)