class Solution {
    public double angleClock(int hour, int minutes) {
        // mid logic of aptitude maths
        double hr = (hour%12)*30+minutes*0.5;
        double min = minutes*6;
        double ans = Math.abs(hr-min);

        return Math.min(ans,360-ans);


        
    }
}// Time complexity is O(1)