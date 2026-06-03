
        class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        // logic is lil confusing make sure uk how to handle data types well
        //add 1's in the first and last of the matrix 
        //in between take a loop and add the the curr and prev index val from prev list
        

        for(int i=0;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            
            temp.add(1);
            
            for(int j=1 ; j<i; j++){
               temp.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
  
            }

            if(i>0){
               temp.add(1);
            }
            

            ans.add(temp);

        }
        return ans;

    }
}// Time complexity is O(n*n)