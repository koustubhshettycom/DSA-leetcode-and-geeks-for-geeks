class Solution {
    public int romanToInt(String s) {
        // easy logic but u thinking is hard initially 
        // go from right to left because sometimes u have to minus the value 
        int result = value(s.charAt(s.length()-1));
        for(int i= s.length()-2;i>=0;i--){
            int curr = value(s.charAt(i));
            int next = value(s.charAt(i+1));
            if(curr<next){
                result -= curr;
            }
            else{
                result+= curr;
            }
            
        }
        return result;
    }

    private int value(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}// Time complexity is O(n)