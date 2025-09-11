class Solution {
    public int findMin(int[] arr) {
     // binary search is best for sorted array 
     int start=0;
     int end= arr.length-1;
     while(start<end){
        if(arr[start]<arr[end]) {
        return arr[start];
     }
        int mid = start + (end-start)/2;
        if(arr[mid]>arr[end] ){
            start= mid+1;
        }
        else if(arr[mid]<arr[end]){
            end =mid;
        }
        // this case is to eliminate one of the common value
        else{
            end--;
        }
     }
    
     return arr[start];
     
     
    }
}// time compplexity is O(logn)