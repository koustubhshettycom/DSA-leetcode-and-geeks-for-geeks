class Solution {
    public int maxDistance(int[] colors) {
        // easy logic traverse from front and back code is lil harder
        int ans=0;
        int n= colors.length;

        for(int i=n-1;i>=0;i--){
            if(colors[0]!=colors[i]){
                ans = Math.max(ans,i);
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(colors[n-1]!=colors[i]){
                ans = Math.max(ans,n-1-i);
                break;
            }
        }
        return ans;
        
    }
}// Time complexity is O(n)