class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // Easy logic maintain a set to check if number has occured then record ans
        int[] arr = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int i=0;
        for(int n: nums){
            if(set.contains(n)){
                arr[i]=n;
                i++;
            }
            set.add(n);
            if(i==2){
                break;
            }

        }
        return arr;
        
    }
}//Time complexity is O(n)