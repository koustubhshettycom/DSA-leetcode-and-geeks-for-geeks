class Solution {
    public boolean check(int[] arr) {
    // easy logic check whether there is hike twice if yes it is not a sorted and rotated array
        int count=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                count++;
            }
            
        }
        if(count==1 && arr[0]<arr[arr.length-1]){
            count++;
        }
        if(count<=1){
            return true;
        }
        return false;
        
    }
}// Time complexity is O(n)