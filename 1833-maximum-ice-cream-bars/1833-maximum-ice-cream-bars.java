class Solution {
    public int maxIceCream(int[] costs, int coins) {
       //Easy logic greedy method on a single array sort and choose the best
        Arrays.sort(costs);
        int cost=0;

        for(int i=0;i<costs.length;i++){
            if(costs[i]<=coins){
                cost++;
                coins-=costs[i];
            }
            else{
                break;
            }
            
        }
        return cost;

    }
}// Time complexity is O(n)