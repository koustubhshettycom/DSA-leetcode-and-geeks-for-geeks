class Solution {
    public int mostFrequentEven(int[] nums) {
        //Easy logic use map and store it acc to even or odd
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            if(num%2==0){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        int ans =-1;
        int max = 0;

        for(int num: map.keySet()){
            int freq = map.get(num);
        

         if(freq>max || (freq==max && num<ans)){
            max = freq;
            ans = num;
           }
        }

        return ans;


    }
}//Time complexity O(n)