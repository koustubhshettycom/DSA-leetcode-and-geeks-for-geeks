class Solution {
    public int minEatingSpeed(int[] arr, int h) {
       // the logic is bit different than the other qiestions as the binary apporach is not direct  
       // binary approach is put on the speed(answer) rather than the array 
       int end = arr[0];
       for(int pile: arr){
        end= Math.max(pile,end);
       }
       int start =1;
       while(start<end){
        int mid = start + (end-start)/2;
         if(checkingspeed(arr , mid , h)){
            end= mid;
         }
         else{
            start=mid+1;
         }

       }
       return start;

       
    }
    static boolean checkingspeed(int[] arr , int mid , int h){
        int hours=0;
        for(int pile : arr){
            hours +=( pile + mid -1)/mid;
        }
        return hours<=h;
       }
}//Time complexity is great O(logn)
// by this question u realised u have to think in a way u cant comprehend easily 