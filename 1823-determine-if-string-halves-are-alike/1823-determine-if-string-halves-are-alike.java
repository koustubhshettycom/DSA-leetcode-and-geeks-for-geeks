class Solution {
    public boolean halvesAreAlike(String s) {
        // easy logic just go through the steps charAt stirngbuilder and sb.append function is used widely 
        int half = s.length()/2;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for( int i=0;i<s.length();i++){
            if(i<half){
                sb1.append(s.charAt(i));
            }
            else{
                sb2.append(s.charAt(i));
            }
        }
        int count1=0;
        for( int i=0;i<sb1.length();i++){
            if(sb1.charAt(i)=='a'|| sb1.charAt(i)=='e'||sb1.charAt(i)=='i'||sb1.charAt(i)=='o'||sb1.charAt(i)=='u'||sb1.charAt(i)=='A'|| sb1.charAt(i)=='E'||sb1.charAt(i)=='I'||sb1.charAt(i)=='O'||sb1.charAt(i)=='U'){
                count1++;
            }
        }
        int count2=0;
        for( int i=0;i<sb2.length();i++){
            if(sb2.charAt(i)=='a'|| sb2.charAt(i)=='e'||sb2.charAt(i)=='i'||sb2.charAt(i)=='o'||sb2.charAt(i)=='u'||sb2.charAt(i)=='A'|| sb2.charAt(i)=='E'||sb2.charAt(i)=='I'||sb2.charAt(i)=='O'||sb2.charAt(i)=='U'){
                count2++;
            }
        }
        return count1==count2;

    }
}// Time complexity is O(n)