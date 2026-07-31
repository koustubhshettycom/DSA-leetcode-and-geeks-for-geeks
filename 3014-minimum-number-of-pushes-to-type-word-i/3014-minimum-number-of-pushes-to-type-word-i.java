class Solution {
    public int minimumPushes(String word) {
        // logic is to map abcd.. to get min number of clicks
        // it fs will be of 26 length do map each letter to each number
        int count =0;
        int n = word.length();
        for(int i=0;i<n;i++){
            count+= (i/8)+1;
        }
        return count;
    }
}//Time complexity is O(n)