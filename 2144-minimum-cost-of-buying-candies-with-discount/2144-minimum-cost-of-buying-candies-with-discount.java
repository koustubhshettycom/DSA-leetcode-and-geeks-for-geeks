class Solution {
    public int minimumCost(int[] cost) {
       // Easy logic sort the whole thing and ignore every third term 
       Arrays.sort(cost);
       int ans=0;
       int count=0;
       for(int i=cost.length-1;i>=0;i--){
        count++;
        if((count)%3==0){
            continue;
        }
        else{
            ans+=cost[i];
        }
        
       }
       return ans;
    }
}// Time compelxity is O(nlogn) bcoz of sorting 