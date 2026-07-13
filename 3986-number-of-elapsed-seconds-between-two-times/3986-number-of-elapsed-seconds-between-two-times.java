class Solution {
    public int secondsBetweenTimes(String s, String e) {
        //easy logic handling of char with time knowledge
        int sec=0;
        int end=0;
        int sh = (s.charAt(0)-'0')*10+ (s.charAt(1)-'0');
        int eh = (e.charAt(0)-'0')*10+ (e.charAt(1)-'0');
        sec += (eh)*3600;
        end += (sh)*3600;
        int sm = (s.charAt(3)-'0')*10+ (s.charAt(4)-'0');
        int em = (e.charAt(3)-'0')*10+ (e.charAt(4)-'0');
        sec+= (em)*60;
        end += (sm)*60;
        int ss = (s.charAt(6)-'0')*10+ (s.charAt(7)-'0');
        int es = (e.charAt(6)-'0')*10+ (e.charAt(7)-'0');
        sec += (es);
        end += (ss);
        return sec-end;


    }
}// Time complexity is O(1)