class Solution {
    public int firstMissingPositive(int[] arr) {
     
     int i=0;
     // cyclic sort used as the only approach with sorting of O(n)
     while(i<arr.length){
        int corect= arr[i]-1;
        if(arr[i]>0 && arr[i]<=arr.length &&arr[i]!= arr[corect]){
            int temp= arr[i];
            arr[i]= arr[corect];
            arr[corect]=temp;
        }
        else{
            i++;
        }
       // adding elements
        }
         for(int ind=0;ind<arr.length;ind++){
          if(arr[ind]!=ind+1){
            return ind+1;
           }
        } 
         return arr[arr.length-1]+1;
        
     }

}// time complexity is O(n)