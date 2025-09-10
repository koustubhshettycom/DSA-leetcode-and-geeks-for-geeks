class Solution {
    public int shipWithinDays(int[] arr, int days) {
     int min=0;
     int max=0;
     // using binary approach for numbers from max to the sum as it is effecient 
     // no direct hint 
     for(int i=0;i<arr.length;i++){
        max+= arr[i];
        if(arr[i]>min){
            min=arr[i];
        }
     }
     while(min<=max){
        int mid= min + (max-min)/2;
        if(check(arr,mid,days)){
            max=mid-1;
        }
        else{
            min=mid+1;
        }


     }
     return min;

    }
    boolean check( int[] arr, int mid,int days){
        int count=1;
        int sum=arr[0];
        for(int k=1;k<arr.length;k++){
            if(sum+arr[k]<=mid){
                sum+= arr[k];
            }
            else{
                sum=arr[k];
                count++;
            }
        }
        if(count<=days){
            return true;
        }
        else{
            return false;
        }
    }
}// time complexity is nlogn which is decent ig 