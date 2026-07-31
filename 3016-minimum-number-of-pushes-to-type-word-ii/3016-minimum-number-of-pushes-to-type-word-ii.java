class Solution {
    public int minimumPushes(String word) {
        // easy logic keep the track of freq and sort them
        //the numbers with highest frequency get the lesser number of presses
        int[] arr = new int[26];

        char[] letters = word.toCharArray();

        for(char ch: letters){
            arr[ch-'a'] +=1;
        }

        Arrays.sort(arr);

        int ans=0;
        int t=0;

        for(int i=25;i>=0;i--){
            ans+= arr[i]*((t/8)+1);
            t++;
        }
        return ans;
        
    }
}// Time complexity is O(n + 26logn26)=> the second part can be ignored 