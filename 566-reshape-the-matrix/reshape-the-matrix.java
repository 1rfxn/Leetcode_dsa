class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row * col != r * c)
        return mat;
        int a[] = new int[row * col];
        int count = 0;
        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                a[count++] = mat[i][j];
            }
        }
        count = 0;
        int[][] res = new int[r][c];
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                res[i][j] = a[count++];
            }
        }
        return res;  
    }
}