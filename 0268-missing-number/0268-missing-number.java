class Solution {
    public int missingNumber(int[] arr) {
       int i=0;
       // using of cycle sort as its time complexity is O(n) and question is from 0-n
       while(i<arr.length){
        int corect= arr[i];
        if(arr[i]<arr.length && arr[i]!=arr[corect]){
            int temp=arr[i];
            arr[i]=arr[corect];
            arr[corect]=temp;
        }
        else{
            i++;
        }
        // checking one by one until u find the ans 
       }
       for(int ind=0;ind<arr.length;ind++){
        if(arr[ind]!=ind){
            return ind;
        }
        // if the answer is not found then answer is next of the elements of array 
       }
       return arr.length;
    }
}