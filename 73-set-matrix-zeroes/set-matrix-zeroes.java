class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] b = new boolean[m][n];
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(matrix[i][j] == 0)
                    b[i][j] = true;
            }
        }
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(b[i][j])
                {
                    int x = 0;
                    int y = 0;
                    while(x < m || y < n)
                    {
                        if(x < m)
                            matrix[x++][j] = 0;
                        if(y < n)
                            matrix[i][y++] = 0;
                    }
                }
            }
        }
    }
}