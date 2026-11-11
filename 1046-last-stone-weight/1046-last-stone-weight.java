class Solution {
    public int lastStoneWeight(int[] stones) {
    //Med Logic we use Max heap as during run of the testcase 
    //in dry run we see we take 2 big elements and use the diff which makes us use pq
    //Use max heap ans keep popping 2 elements until u r left w onw or 0 elements
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n:stones){
            pq.add(n);
        }

        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();

            if(a!=b){
                pq.add(Math.abs(a-b));
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.peek();
        
    }
}//Time complexity is O(nlogn)