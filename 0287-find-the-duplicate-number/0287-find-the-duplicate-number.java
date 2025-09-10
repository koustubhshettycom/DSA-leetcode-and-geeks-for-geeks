class Solution {
    public int findDuplicate(int[] arr) {
     int i=0;
     // cyclic sort as it is given from 1 to n 
     while(i<arr.length){
        int corect=arr[i]-1;
        if(arr[i]!=arr[corect]){
            int temp= arr[i];
            arr[i]=arr[corect];
            arr[corect]= temp;
        }
        else{
            i++;
        }
     }
     for(int ind=0;ind<arr.length;ind++){
        if(arr[ind]!= ind+1){
            return arr[ind];
        }
     }
     return -1;
     
    }
}//Time complexity is O(n)