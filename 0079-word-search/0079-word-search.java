class Solution {
    public boolean exist(char[][] board, String word) {
        // Great u were able to give the logic but u failed miserably in few step of logic 
        // and completely in the code execution 
        // u are choosing the right letter first if matches then u are creating the call
        // in the call if the answer is gotten return statement is sent the thing i lacked was 
        // how to send return as 'or' statement should have been put 
        // if mismatch is present u will come back 
        // i lacked in marking too
        // backtracking step is also there which is arr[i][j]= temp;

        int row = board.length;
        int col = board[0].length;

        for(int i=0;i<board.length;i++){
          for(int j=0;j<board[0].length;j++){
            if (board[i][j] == word.charAt(0)){
                if( ways(board,i,j,row, col,word,0)){
                    return true;
                }
            }
            
            
        }
        
       } 
       return false;
    }

    public boolean ways(char[][] arr,int i,int j,int row,int col,String word,int idx){
        if (idx == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= row || j >= col || arr[i][j] != word.charAt(idx)) {
            return false;
        }

        char temp = arr[i][j];
        arr[i][j] = '#';

        boolean found =
                ways(arr, i - 1, j, row, col, word, idx + 1) ||
                ways(arr, i + 1, j, row, col, word, idx + 1) ||
                ways(arr, i, j - 1, row, col, word, idx + 1) ||
                ways(arr, i, j + 1, row, col, word, idx + 1);

        arr[i][j]= temp;

        return found ;



    }
}
// time compelxity is (n*m*3^l) where l is the length if the word