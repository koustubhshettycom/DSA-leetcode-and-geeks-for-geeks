class Solution {
    public void rotate(int[] arr, int k) {
       //if k is larger than the array
        k = k % arr.length;
        // first reverse the full array
        reverse(arr,0,arr.length-1);
        // then reverse the first k-1 elements
        reverse(arr,0,k-1);
        // then reverse the last k elements
        reverse(arr,k,arr.length-1);
        
    }

    void reverse(int[] arr, int start,int end){
        while(start<=end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }



    }
}// Time complexity is o(n) which is good ig 8/10