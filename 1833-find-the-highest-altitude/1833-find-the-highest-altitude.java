class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n+1];
        
        arr[0] = 0; // initally the altitude is zero 
        int max =0;
        int sum =0;
        for(int i=0;i<gain.length;i++){ // traversing for each loop 
            sum += gain[i];
            if(max<sum){ // comparing each time 
                max=sum ;
            }

        }
        return max;
        



    }

// Time complexity is quite good O(n) 9/10 
