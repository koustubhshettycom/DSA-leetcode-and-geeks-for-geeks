class Solution {
    //Easy logic u need to check every elemnt row col grid wise if 1 extra exists
    // if u find xtra return false if u find empty cell return true
    // the main hard part of logic is grid
    //take the idxes and divid it by 3 such that u get start idx of grid and check
    public boolean isValidSudoku(char[][] board) {
        boolean ans = true;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                ans = ans && solve(board[i][j],i,j,board);
            }
        }
        return ans;
        
    }
    public boolean solve(char cr, int r,int c,char[][] board){
        if(cr=='.'){
            return true;
        }
        
        // int n = c -'0';
        for(int i=0;i<board.length;i++){
            if(i !=c && cr==board[r][i]){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(i !=r && cr==board[i][c]){
                return false;
            }
        }
        int sr = (r/3)*3;
        int sc = (c/3)*3;
        for(int i=sr;i<=sr+2;i++){
            for(int j=sc;j<=sc+2;j++){
                if(cr==board[i][j]){
                    if(i!=r || j!=c){
                        return false;
                    }
                    
                }
            }
        }

        return true;





        
    }
}//Time complexity is O(n*n)