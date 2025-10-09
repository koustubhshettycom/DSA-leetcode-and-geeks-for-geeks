class Solution {
    public int[] sortedSquares(int[] arr) {
        // logic is to double every element then sort it
        // sorting u can do from library or manual sorting methods
        for(int i=0; i<arr.length;i++){
            arr[i]= arr[i]*arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}// Time complexity is O(nlogn)