class Solution {
    public boolean checkInclusion(String s1, String s2) {
    //easy logic take a window of src str and sort it compare it to sorted dest
        if(s1.length()>s2.length()){
            return false;
        }
        
        int n = s2.length();
        char[] og = s1.toCharArray();
        Arrays.sort(og);
        String pat = new String(og);
        
        int str =0;
        int end = str+s1.length();

        while(end<=n){
            char[] s = s2.substring(str,end).toCharArray();
            Arrays.sort(s);
            String temp = new String(s);

            if(pat.equals(temp)){
                return true;
            }
            str++;end++;
            

        }
        return false;
    }
}//Time complexity is O(nlogn)