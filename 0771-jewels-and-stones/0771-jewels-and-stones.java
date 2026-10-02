class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        //Easy logic go char to char and check each element
    int count = 0;

    for (int i = 0;i<stones.length(); i++) {
        for (int j = 0;j<jewels.length(); j++) {
            if (stones.charAt(i) == jewels.charAt(j)) {
                count++;
                break;
            }
        }
    }

    return count;
    }
}
//Time complexity is O(n*n)