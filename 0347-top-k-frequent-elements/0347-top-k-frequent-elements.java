class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    //Easy logic: The intutuion should be that as the requirement is top k ele we need heap
    //we use min heap as we need max freq of elements 
    //PriorityQueue<>((a,b)->Integer.compare(map.get(a),map.get(b))) is for custom priority
    //Then usual priority queue logic for the top k ele question 
    //by adding the ele until it exceeds the size then removing by poll
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(map.get(a),map.get(b)));

        for(int n: map.keySet()){
            pq.add(n);

            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        return arr;
    }
}//Time complexity is O(nlogn)