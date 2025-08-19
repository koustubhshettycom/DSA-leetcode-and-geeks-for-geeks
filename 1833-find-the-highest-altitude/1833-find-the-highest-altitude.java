class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n+1];
        arr[0] = 0;
        int max =0;
        int sum =0;
        for(int i=0;i<gain.length;i++){
            sum += gain[i];
            if(max<sum){
                max=sum ;
            }

        }
        return max;
        



    }
}