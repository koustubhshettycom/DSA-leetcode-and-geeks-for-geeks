class Solution {
    public void sortColors(int[] arr) { 
        // store no. of 0 1 2
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            switch(arr[i]){
                case 0:count0++; break;
                case 1:count1++; break;
                case 2: count2++; break;
            }
            
                
        // adding the elements  
        }
         int count=0;
            while(count0!=0){
                arr[count]=0;
                count0--;
                count++;
            }
            
            while(count1!=0){
                arr[count]=1;
                count1--;
                count++;
            }
             while(count2!=0){
                arr[count]=2;
                count2--;
                count++;
            }
        
        
    }
}// Time complexity is great O(n) 9/10