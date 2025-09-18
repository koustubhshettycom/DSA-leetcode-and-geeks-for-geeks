class Solution {
    public boolean checkOnesSegment(String s) {
        //check where it transforms and ignore first and the second time return the answer 
        if(s.charAt(0)=='0'){
            return true ;
        }
        boolean transition = false;
        int size =s.length();
        for(int i=0;i<size-1;i++){
            if(s.charAt(i)=='1' && s.charAt(i + 1) == '0'  ){
                transition =true;
            }
            if( transition && s.charAt(i)=='0' && s.charAt(i + 1) == '1' ){
                return false;
            }

        }
        return true;
    }
}// time complexity is O(n)