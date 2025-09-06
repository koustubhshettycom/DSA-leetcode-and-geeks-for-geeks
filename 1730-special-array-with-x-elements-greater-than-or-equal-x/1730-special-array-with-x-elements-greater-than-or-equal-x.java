class Solution {
    public int specialArray(int[] arr) {
       Arrays.sort(arr);
       int no = 0;
       
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