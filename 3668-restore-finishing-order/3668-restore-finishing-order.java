class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        // Easy logic basic use of hashset 
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[friends.length];
        int idx=0;

        for(int num : friends){
            set.add(num);
        }

        for(int num : order){
            if(set.contains(num)){
                arr[idx]=num;
                idx++;
            }
        }
        return arr;
        
    }
}// Time complexity is O(n)