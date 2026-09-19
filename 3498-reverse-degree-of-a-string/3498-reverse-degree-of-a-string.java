class Solution {
    public int reverseDegree(String s) {
        // easy logic for a loop of s subtract with 123 to find the c in rev order 
        // 122 is the ASCII value of z so we use 123
        char[] arr = s.toCharArray();
        int sum =0;

        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            int ans = 123-c;
            sum+= ans*(i+1);
        }
        return sum;

    }
}//Time complexity is O(n)