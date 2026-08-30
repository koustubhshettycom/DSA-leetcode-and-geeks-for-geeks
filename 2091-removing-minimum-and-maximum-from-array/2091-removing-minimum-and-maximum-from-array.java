class Solution {
    public int minimumDeletions(int[] arr) {
        //Easy logic u need to find idx of min and max element
        // the min is between 2 aspects either elements are together from front/back or front and back

        int n = arr.length;
        if(n==1){
            return 1;
        }
        int min=0 ;
        int max=0 ;

        for(int i=1;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min =i;
            }
            if(arr[max]<arr[i]){
                max =i;
            }
        }

        return Math.min( Math.min(min+1,n-min)+Math.min(max+1,n-max),Math.min(n - Math.min(min, max),Math.max(min,max)+1));

        
    }
}// Time complexity is O(n)