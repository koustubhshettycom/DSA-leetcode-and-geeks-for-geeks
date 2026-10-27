class Solution {
    public String[] createGrid(int m, int n) {
        //Easy logic the first row is all . and other rows end is . left is #
        String[] arr = new String[m];
        for(int i=0;i<m;i++){
            char[] carr = new char[n];
            if(i==0){
                for(int j=0;j<n;j++){
                    carr[j]= '.';
                }
                
            }
            else{
                for(int j=0;j<n;j++){
                    if(j==n-1){
                        carr[j]='.';
                    }
                    else{
                    carr[j]= '#';
                    }
                }

            }
            arr[i] = new String(carr);
        }

        return arr;
        
    }
}//Time complexity is O(n*n)