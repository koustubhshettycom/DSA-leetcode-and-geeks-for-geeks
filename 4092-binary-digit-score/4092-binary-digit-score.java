class Solution {
    public int calculateScore(int a, int b) {
        //Convert to binary string and check number of 1 and return accordingly 
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toBinaryString(b);

        int sc1 =0; int sc2=0;

        for(int i=0;i<s1.length();i++){
           char c = s1.charAt(i);
            if(c=='1'){
                sc1++;
            }
        }
        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            if(c=='1'){
                sc2++;
            }
        }
        if(sc1>=sc2){
            return sc1*sc2;
        }
        return sc2/sc1;

    }
}//Time complexity is O(n)