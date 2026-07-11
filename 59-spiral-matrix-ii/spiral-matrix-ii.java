class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int left = 0;
        int ryt = n - 1;
        int top = 0;
        int btm = n - 1;
        int ele = 1;
        while(left <= ryt && top <= btm && ele <= n * n)
        {
            for(int i = left ; i <= ryt ; i++)
            {
                res[top][i] = ele++;
            }
            top++;
            for(int i = top ; i <= btm ; i++)
            {
                res[i][ryt] = ele++;
            }
            ryt--;
            for(int i = ryt ; i >= left ; i--)
            {
                res[btm][i] = ele++;
            }
            btm--;
            for(int i = btm ; i >= top ; i--)
            {
                res[i][left] = ele++;
            }
            left++;
        }
        return res;
    }
}