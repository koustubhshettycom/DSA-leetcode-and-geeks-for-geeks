class Solution {
    public int[] minOperations(String boxes) {
        // easy logic keep the index of 1 marked for each index add and index it
        char[] arr = boxes.toCharArray();
     
        List<Integer> count = new ArrayList<>();
        int[] ans = new int[arr.length];
        

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                count.add(i);
            }
        }

        for(int i=0;i<arr.length;i++){
            int sum=0;
            
            for(int j=0;j<count.size();j++){
                sum += Math.abs(i-count.get(j));
            }
            ans[i]= sum;
        }
        return ans;
        
    }
}// Time complexity is O(n*n)