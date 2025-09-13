class Solution {
    public boolean judgeCircle(String s) {
        int hor =0;
        int ver=0;
        // storing u l r d values so that u can add and minus them like in x nad y plane
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='U'){
                ver++;
            }
            else if(ch=='D'){
                ver--;
            }
            else if(ch=='L'){
                hor--;
            }
            else if(ch=='R'){
                hor++;
            }
        }
        return hor==0 && ver==0;
        
    }// Time complexity O(n)
}