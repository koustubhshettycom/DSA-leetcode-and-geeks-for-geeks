class Solution {
    // its for checking if its the max value in the column
    public boolean islargest(int[][] arr,int j, int min){
      for(int i=0; i<arr.length;i++){
        if(arr[i][j]>min){
            return false;
            
        }
       
      }
      return true;
    }




    public List<Integer> luckyNumbers(int[][] arr) {
        int min;
// checking of each row
        ArrayList<Integer> ll =new ArrayList<>();
        int coulmn =0;
        for(int i=0;i<arr.length;i++){ 
            min =Integer.MAX_VALUE;
           for(int j=0;j<arr[i].length;j++) {
            if(arr[i][j]<min){
                min = arr[i][j];
                 coulmn =j;
            }
           }
           boolean ans = islargest( arr,  coulmn,  min);
            if(ans){
                    ll.add(min);
                    break;
                }
        }
        
      return ll;  
    }
    
}

// time complexity is n*n good but not the best so its 7/10
