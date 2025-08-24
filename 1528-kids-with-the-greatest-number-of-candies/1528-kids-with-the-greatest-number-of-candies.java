class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int n = candies.length;
      List<Boolean> arr = new ArrayList<>(n);
      int max =0;
        // finding the max value 
      for(int i=0;i<n;i++){
        if(candies[i]>max){
            max=candies[i];
        }
      } 
        //comparing the values 
      for(int j=0;j<n;j++){          
            if(candies[j]+extraCandies >= max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        
      
      return arr; 
    }
}
// time complexity is good O(n) 9/10
