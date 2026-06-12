class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //Greedy method when 2 arrays are given
        // sort them choose the best possible answer for the exisiting one
        Arrays.sort(g);
        Arrays.sort(s);
        int start1=0;
        int start2=0;
        int count=0;
        while(start1<g.length && start2<s.length){
            if(g[start1]<=s[start2]){
                count++;
                start1++;
                start2++;

            }
            else{
                start2++;
            }
        }
        return count;
        
    }
}// Time complexity is O(nlogn) -> for sorting 