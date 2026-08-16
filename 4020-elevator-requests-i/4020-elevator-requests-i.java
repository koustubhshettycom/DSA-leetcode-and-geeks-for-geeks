class Solution {
    public int elevatorRequests(int floor, int[] arr) {
        // easy logic the abs sum of adj arr elements is the answer
        int n = arr.length;
        int sum=0;
        sum+=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            sum+= Math.abs(arr[i]-arr[i-1]);
        }
        return sum;
    }
}//Time complexity is O(n)