class Solution {
    public boolean judgeCircle(String s) {
        int hor =0;
        int ver=0;
        // storing u l r d values so that u can add and minus them like in x nad y plane
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U'){
                ver++;
            }
            else if(s.charAt(i)=='D'){
                ver--;
            }
            else if(s.charAt(i)=='L'){
                hor--;
            }
            else if(s.charAt(i)=='R'){
                hor++;
            }
        }
        if(hor==0 && ver==0){
            return true;
        }
        else{
            return false;
        }
    }// Time complexity O(n)
}