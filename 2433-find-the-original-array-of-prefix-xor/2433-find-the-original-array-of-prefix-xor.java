class Solution {
    //Easy logic we have been given pref[i] = arr[i]^...arr[i-n]
    //inversion operator for xor is xor ie pref[i] = arr[i]^arr[i-1]
    public int[] findArray(int[] pref) {
        for(int i=pref.length-1;i>0;i--){
            pref[i] ^= pref[i-1];
        }
        return pref;
        
    }
}//Time complexity is O(n)