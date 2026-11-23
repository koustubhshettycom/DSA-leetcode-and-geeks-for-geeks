class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //Easy logic we need k min ele thus max heap is used
        //The main part is comparing which is done by (a,b)->(b[0]*b[0] + b[1]*b[1])-(a[0]*a[0] + a[1]*a[1])
        //where a,b are 2 diff arrays
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(b[0]*b[0] + b[1]*b[1])-(a[0]*a[0] + a[1]*a[1]));

        for(int[] arr:points){
            pq.offer(arr);

            while(pq.size()>k){
                pq.poll();
            }
        }
        int[][] arr = new int[k][];

        for(int i=0;i<k;i++){
            arr[i] = pq.poll();
        }

        return arr;
    }
}//Time complexity is O(nlogn)