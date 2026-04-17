class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> res = new HashSet<>();
        for(int i = 0 ; i < 9 ; i++)
        {
            for(int j = 0 ; j < 9 ; j++)
            {
                char num = board[i][j];
                if(num == '.')
                continue;
                String row = "r" + i + num;
                String col = "c" + j + num;
                String box = "b" + (i/3) + (j/3) + num;
                if(res.contains(row) || res.contains(col) || res.contains(box))
                return false;
                res.add(row);
                res.add(col);
                res.add(box);
            }
        }
        return true;
        }
}