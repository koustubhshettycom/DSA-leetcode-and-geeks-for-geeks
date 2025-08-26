class Solution {
    
   int findingindex(int[] arr, int target, boolean startindex){
     int end = arr.length-1;
     int start=0;
     int ans=-1;
     while(start<=end){
            int mid = start+ (end-start)/2;
            if(arr[mid]<target){
                start =mid+1;
            }
            else if(arr[mid]>target){
               end=mid-1 ;
            }
            else if(arr[mid]==target){
                 ans= mid;
                if(startindex){
                end=mid-1;
                }
                else{
                start=mid+1;
                }
            }
            
        }
        return ans;
   }
    public int[] searchRange(int[] arr, int target) {
        int[] array = {-1,-1};
        int start = findingindex( arr,target,true);
        int end = findingindex( arr,target,false);
        array[0]= start;
        array[1]=end;
        return array;


        
    }
}