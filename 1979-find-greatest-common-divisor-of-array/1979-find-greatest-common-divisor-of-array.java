class Solution {
    public int findGCD(int[] arr) {
        //only one logic [ temp= max; max = min % max ;min = temp ]
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        while(max!=0){
           int temp = max;
            max = min%max;
            min = temp;
        }
        return min;
        
    }
}// Time complexity is O(n)