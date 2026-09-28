class Solution {
    public int maxDepth(String s) {
        //Easy logic u can use stack and keep a seperate count of elements
        Stack<Character> stc = new Stack<>();
        int currmax=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                stc.push('(');
                currmax++;
                max = Math.max(max,currmax);
            }
            else if(s.charAt(i)==')'){
                if(stc.peek()=='('){
                    stc.pop();
                    currmax--;
                    if(stc.isEmpty()){
                        max = Math.max(max,currmax);
                        
                    }

                }
                else{
                    stc.push(')');
                }
                
            }
            
        }

        return max;
        
    }
}//Time compplexity is O(n)