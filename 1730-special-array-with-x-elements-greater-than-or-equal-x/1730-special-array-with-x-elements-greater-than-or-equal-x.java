class Solution {
    public int specialArray(int[] arr) {
        // Sort the arry
       Arrays.sort(arr);
       int no = 0;
    // count one by one 
       while(no<arr.length+1){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=no){
                count++;
            }
        }
        if(count==no){
            return no;
        }
        else{
            no++;
        }
       }
       return -1;

       
       
    }
}
// bad time complexity what u did was brute force which is actually bad 
// time complexity O(logn)