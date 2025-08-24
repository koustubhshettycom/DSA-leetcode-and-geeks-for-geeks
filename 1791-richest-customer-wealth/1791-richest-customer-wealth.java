
import java.util.Arrays;
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        // traversing through each row and column with sum as it changes the rows 
        for(int i=0;i<accounts.length;i++){
            int sum =0;
            for(int j=0;j<accounts[0].length;j++){
                sum += accounts[i][j];
                if( max<sum){
                    max=sum;
                }
            }

        }
        return max;
    }
}
// Time complexity is good ig but not the best O(n*n) 7/10 
