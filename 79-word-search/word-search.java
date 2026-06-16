class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                if(chk(board,word,i,j,0))
                    return true;
            }
        }    
        return false;
    }
    private boolean chk(char[][] board,String word,int rows,int cols,int idx)
    {
        if(idx == word.length())
            return true;
        if(rows < 0 || cols < 0 || rows >= board.length || cols >= board[0].length || word.charAt(idx) != board[rows][cols])
            return false;
        char temp = board[rows][cols];
        board[rows][cols] = '#';
        boolean found = chk(board,word,rows + 1,cols,idx + 1) ||
                        chk(board,word,rows - 1,cols,idx + 1) ||
                        chk(board,word,rows,cols + 1,idx + 1) ||
                        chk(board,word,rows,cols - 1,idx + 1);
        board[rows][cols] = temp;
        return found;
    }
}