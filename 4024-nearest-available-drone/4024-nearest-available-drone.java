class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        //easy logic for each arr find distance and cross check with range
        //store the min of the answess
        int count =Integer.MAX_VALUE;
        int dist =0;
        for(int i=0;i<drones.length;i++){
            int ans = Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(ans<=drones[i][2] && count>ans ){
                count = ans;
                dist =i;

            }
        }
        if(count==Integer.MAX_VALUE){
            return -1;
        }
        return dist;
        
    }
}//Time complexity is O(n)