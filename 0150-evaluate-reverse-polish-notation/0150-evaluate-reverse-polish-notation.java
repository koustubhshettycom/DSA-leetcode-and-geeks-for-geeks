class Solution {
    public int evalRPN(String[] tokens) {
        //Easy logic of stc if "ab+"then it is "a+b"
        Stack<String> stc = new Stack<>();
        int ans=0;
        for(String str: tokens){
            if(str.equals("+")||str.equals("-")||str.equals("/")||str.equals("*")){
                int b = Integer.parseInt(stc.pop());
                int a = Integer.parseInt(stc.pop());
                switch(str){
                    case"+":
                    ans=a+b;break;
                    case"-":
                    ans=a-b;break;
                    case"*":
                    ans=a*b;break;
                    case"/":
                    ans=a/b;break;
                }
                stc.push(String.valueOf(ans));
            }
            else{
                stc.push(str);
            }
        }
        return Integer.parseInt(stc.peek());
        
    }
}//Time complexity is O(n)