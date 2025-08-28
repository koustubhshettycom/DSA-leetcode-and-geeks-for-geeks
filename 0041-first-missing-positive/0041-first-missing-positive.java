class Solution {
    public int firstMissingPositive(int[] arr) {
     
     int pointer=1;   
     Arrays.sort(arr);
     for(int i=0;i<arr.length;i++){
        if(arr[i]== pointer){
            pointer++;
        }
     }
        return pointer;



    }
}//Time complexity is bad comparitively O(n*n) 4/10