class Solution {
    public int maxProduct(int no) {
        // easy logic take care of endcases 
        int max1 ;
        int max2 ;
        int ans=no;
        max1 = ans%10;
        ans/=10;
        max2 = ans%10;
        ans/=10;
        if(max1<max2){
            int temp = max1;
            max1 = max2;
            max2 = temp;
        }
        while(ans>0){
            int n = ans%10;
            ans/=10;
            if(n>max1){
                max2 = max1;
                max1 = n;
            }
            else if(n>max2){
                max2 = n;
            }

        }
        return max1*max2;
        
    }
}// Time complexity is O(n)