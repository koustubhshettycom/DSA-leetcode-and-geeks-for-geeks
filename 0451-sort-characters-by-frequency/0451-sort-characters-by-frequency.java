class Solution {
    public String frequencySort(String s) {
        //Easy logic we use pq as we need to order things based onfreq 
        //use hashmap to store the freq and use pq as max heap
        //based on the freq add the chars into the string
        HashMap<Character,Integer> map = new HashMap<>();

        char[] arr = s.toCharArray();

        for(char c: arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->Integer.compare(map.get(b),map.get(a)));

        for(char c:map.keySet()){
            pq.add(c);
        }

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            char c = pq.poll();

            for(int i=0;i<map.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();


    }
}//Time complexity is o(nlogn)